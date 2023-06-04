package com.example.apworkshop11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;

public class Controler {
    private static StringBuilder stringToCalculate = new StringBuilder();
    @FXML
    private TextField textField = new TextField();

    @FXML
    public void addOne(ActionEvent actionEvent) {
        stringToCalculate.append("1");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addOne() {
        stringToCalculate.append("1");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addTwo(ActionEvent actionEvent) {
        stringToCalculate.append("2");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addTwo() {
        stringToCalculate.append("2");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addThree(ActionEvent actionEvent) {
        stringToCalculate.append("3");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addThree() {
        stringToCalculate.append("3");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addFour(ActionEvent actionEvent) {
        stringToCalculate.append("4");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addFour() {
        stringToCalculate.append("4");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addFive(ActionEvent actionEvent) {
        stringToCalculate.append("5");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addFive() {
        stringToCalculate.append("5");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addSix(ActionEvent actionEvent) {
        stringToCalculate.append("6");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addSix() {
        stringToCalculate.append("6");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addSeven(ActionEvent actionEvent) {
        stringToCalculate.append("7");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addSeven() {
        stringToCalculate.append("7");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addEight(ActionEvent actionEvent) {
        stringToCalculate.append("8");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addEight() {
        stringToCalculate.append("8");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addNine(ActionEvent actionEvent) {
        stringToCalculate.append("9");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addNine() {
        stringToCalculate.append("9");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addZero(ActionEvent actionEvent) {
        stringToCalculate.append("0");
        textField.setText(stringToCalculate.toString());
    }

    public void addZero() {
        stringToCalculate.append("0");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addPlus(ActionEvent actionEvent) {
        stringToCalculate.append("+");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addPlus() {
        stringToCalculate.append("+");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addMinus(ActionEvent actionEvent) {
        stringToCalculate.append("-");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addMinus() {
        stringToCalculate.append("-");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addMultiply(ActionEvent actionEvent) {
        stringToCalculate.append("*");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addMultiply() {
        stringToCalculate.append("*");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addDivide(ActionEvent actionEvent) {
        stringToCalculate.append("/");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addDivide() {
        stringToCalculate.append("/");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addPoint(ActionEvent actionEvent) {
        stringToCalculate.append(".");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void addPoint() {
        stringToCalculate.append(".");
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void equals(ActionEvent actionEvent) {
        String[] parts = stringToCalculate.toString().split("[+]|-|[*]|/");
        double operator1 = Double.parseDouble(parts[0]);
        double operator2 = Double.parseDouble(parts[1]);
        double answer = 0;
        if (stringToCalculate.toString().contains("+")) {
            answer = operator1 + operator2;
        } else if (stringToCalculate.toString().contains("-")) {
            answer = operator1 - operator2;
        } else if (stringToCalculate.toString().contains("*")) {
            answer = operator1 * operator2;
        } else if (stringToCalculate.toString().contains("/")) {
                answer = operator1 / operator2;
        }
        if(stringToCalculate.toString().contains("/")&&operator2==0){
            stringToCalculate.delete(0,stringToCalculate.length());
            stringToCalculate.append("Can't divide by zero");
            textField.setFont(Font.font("System",15));
        }else {
            stringToCalculate.delete(0, stringToCalculate.length());
            stringToCalculate.append(Double.toString(answer));
        }
        textField.setText(stringToCalculate.toString());

    }

    @FXML
    public void equals() {
        String[] parts = stringToCalculate.toString().split("[+]|-|[*]|/");
        double operator1 = Double.parseDouble(parts[0]);
        double operator2 = Double.parseDouble(parts[1]);
        double answer = 0;
        if (stringToCalculate.toString().contains("+")) {
            answer = operator1 + operator2;
        } else if (stringToCalculate.toString().contains("-")) {
            answer = operator1 - operator2;
        } else if (stringToCalculate.toString().contains("*")) {
            answer = operator1 * operator2;
        } else if (stringToCalculate.toString().contains("/")) {
            answer = operator1 / operator2;
        }
        stringToCalculate.delete(0, stringToCalculate.length());
        stringToCalculate.append(Double.toString(answer));
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void ac(ActionEvent actionEvent) {
        textField.setFont(Font.font("System",31));
        stringToCalculate.delete(0, stringToCalculate.length());
        textField.setText(stringToCalculate.toString());
    }

    @FXML
    public void backSpace() {
        stringToCalculate.delete(stringToCalculate.length() - 1, stringToCalculate.length());
        textField.setText(stringToCalculate.toString());
    }
}
