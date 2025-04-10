package com.jala.ToDoList.UIControllers;

import com.jala.ToDoList.TodolistApp;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class HomeUI {
    @FXML
    private ScrollPane listTaskPendings;
    @FXML
    private VBox taskListUserBox;
    @FXML
    private Button seeMoreButton;
    @FXML
    private Label nameUser;
    @FXML
    private VBox boxOneTaskFinish;
    @FXML
    private VBox boxOneTaskCompleteRecent;
    @FXML
    private Button addTaskButton;
    @FXML
    private Button seeAllTaskButton;
    @FXML
    private Button seeReportsButton;
    @FXML
    private AnchorPane addTask;
    @FXML
    private Region exitAddTask;
    @FXML
    private TextField nameField;
    @FXML
    private TextField descriptionField;
    @FXML
    private ChoiceBox<String> priorityField;
    @FXML
    private ChoiceBox<String> categoryField;
    @FXML
    private ChoiceBox<Integer> dayField;
    @FXML
    private ChoiceBox<String> monthField;
    @FXML
    private ChoiceBox<Integer> yearField;
    @FXML
    private ChoiceBox<String> statusField;
    @FXML
    private Button confirmButton;
    @FXML
    private Button cancelButton;

    @FXML
    public void initialize() {

    }



    @FXML
    private void showAddTask() {
        priorityField.getItems().addAll("High", "Medium", "Low");
        categoryField.getItems().addAll("Work", "Study", "Personal");
        dayField.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31);
        monthField.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
        yearField.getItems().addAll(2025, 2026, 2027, 2028, 2029, 2030, 2031);
        statusField.getItems().addAll("Complete", "Pending");
        addTask.setVisible(true);
        addTask.setDisable(false);
    }

    @FXML
    private void addTask() {
        if (nameField.getText().isEmpty() || descriptionField.getText().isEmpty() || priorityField.getValue().isEmpty() || categoryField.getValue().isEmpty() || statusField.getValue().isEmpty() || dayField.getValue() == null || monthField.getValue().isEmpty() || yearField.getValue() == null) {
            System.out.println("Please fill all the fields");
            return;
        }
        //Aqui se guardaria la tarea
        clearFields();
        hideAddTask();
    }

    @FXML
    private void hideAddTask() {
        clearFields();
        addTask.setVisible(false);
        addTask.setDisable(true);
    }

    private int convertMonthToNumber(String month) {
        switch (month) {
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
            default:
        }
        return 0;
    }

    @FXML
    public void handlePressionButtonShowAllTasks() throws IOException {
        TodolistApp.setRoot("ListTasks");
    }

    public void clearFields(){
        nameField.clear();
        descriptionField.clear();
        priorityField.setValue(null);
        categoryField.setValue(null);
        dayField.setValue(null);
        monthField.setValue(null);
        yearField.setValue(null);
        statusField.setValue(null);
    }

}
