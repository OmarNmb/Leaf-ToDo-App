package com.jala.ToDoList.UIControllers;

import com.jala.ToDoList.TodolistApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginUI {


    @FXML
    private TextField usernameField;

    @FXML
    private TextField passwordField;

    @FXML
    private Button signInButton;

    @FXML
    private Label signUpButton;

    @FXML
    private Label errorLabel;

    @FXML
    public void initialize() {
    }

    @FXML
    public void handleLoginButtonClick() throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Autenticacion de usuario
        if (username.isEmpty() || password.isEmpty()) {
            errorLabel.setText("Username o Password vacíos.");
        } else {
            errorLabel.setText("Autenticacion aun no implementada");
            TodolistApp.setRoot("Home");
        }
    }


    @FXML
    public void switchSignUp() throws IOException {
        TodolistApp.setRoot("CreateAccount");
    }
}

