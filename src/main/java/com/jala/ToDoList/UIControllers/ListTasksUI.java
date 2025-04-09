package com.jala.ToDoList.UIControllers;

import com.jala.ToDoList.TodolistApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class ListTasksUI {
    public AnchorPane TaskListInt;
    public ImageView menuButton;
    public Label usernameText;
    public ScrollPane listTasks;
    public VBox taskAllDetails;
    public ImageView filterButton;
    public ImageView searchButton;
    public ImageView orderByButton;




    @FXML
    private void backHome() throws IOException {
        TodolistApp.setRoot("Home");
    }

}
