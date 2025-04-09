package com.jala.ToDoList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class TodolistApp extends Application {

    private static Scene scene;
    private static Stage mainStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        mainStage = stage;
        scene = new Scene(loadFXML("Login"));
        mainStage.setScene(scene);
        mainStage.setResizable(false);
        mainStage.show();
        mainStage.setWidth(483);
        mainStage.setHeight(727);
    }

    public static void setRoot(String fxml) throws IOException {
        Parent root = loadFXML(fxml);
        scene.setRoot(root);
        mainStage.sizeToScene();
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(TodolistApp.class.getResource("VIEWS/FXML/"+fxml + ".fxml"));
        return fxmlLoader.load();
    }

}