package com.jala.ToDoList.UIControllers;

import com.jala.ToDoList.TodolistApp;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class CreateAccountUI {
    @FXML
    private Button confirmButton;
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField confirmPasswordField;
    @FXML
    private TextField emailField;
    @FXML
    private ChoiceBox<String> accountTypeField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField lastnameField;
    @FXML
    private Button cancelButton;
    @FXML
    private PasswordField passwordField;

    @FXML
    public void initialize() {
        accountTypeField.getItems().addAll("Student", "Teacher");
    }

    @FXML
    private void createAccount() throws IOException {
        //Obtienes los datos de los campos
        String username = usernameField.getText();
        String password = passwordField.getText();
        String email = emailField.getText();
        String accountType = accountTypeField.getValue();
        String name = nameField.getText();
        String lastname = lastnameField.getText();
        String confirmPassword = confirmPasswordField.getText();

        if(username.isEmpty() || password.isEmpty() || email.isEmpty() || accountType.isEmpty() || name.isEmpty() || lastname.isEmpty()) {
            System.out.println("Fill all the fields");
            return;
        } else if (password.length() < 8) {
            System.out.println("Password should be at least 8 characters");
            return;
        } else if (!confirmPassword.equals(password)) {
            System.out.println("Passwords do not match");
            return;
        } else {
            System.out.println("Account created successfully. Se pueden agregar mas validaaciones");
        }
        TodolistApp.setRoot("Login");
        clearFields();
    }

    @FXML
    private void cancel() throws IOException {
        clearFields();
        TodolistApp.setRoot("Login");
    }

    private void clearFields() {
        usernameField.clear();
        confirmPasswordField.clear();
        emailField.clear();
        nameField.clear();
        lastnameField.clear();
        accountTypeField.setValue(null);
        passwordField.clear();
    }
    

}
