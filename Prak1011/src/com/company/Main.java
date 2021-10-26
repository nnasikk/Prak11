package com.company;


import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class Main extends Application{

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Text text = new Text("Hello world!");
        text.setLayoutY(100);    // установка положения надписи по оси Y
        text.setLayoutX(107);   // установка положения надписи по оси X
        // Scene - это контейнер верхнего уровня для всех графических элементов. Однако напрямую в Scene объект Text мы поместить не можем.
        Group group = new Group(text);

        Scene scene = new Scene(group);//элемент Group устанавливается в качестве корневого элемента Scene
        stage.setScene(scene);//элемент Scene устанавливается для объекта Stage
        stage.setTitle("JavaFX"); // установка заголовка окна
        stage.setWidth(300); // установка ширины окна
        stage.setHeight(250); // установка длины окна
        stage.show();
    }
}