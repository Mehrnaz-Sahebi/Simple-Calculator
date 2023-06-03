package com.example.apworkshop11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controler {
    private StringBuilder stringToCalculate = new StringBuilder();
    @FXML
    public void addOne(ActionEvent actionEvent){
        stringToCalculate.append("1");
    }
    public void addTwo(ActionEvent actionEvent){
        stringToCalculate.append("2");
    }
    @FXML
    public void addThree(ActionEvent actionEvent){
        stringToCalculate.append("3");
    }
    @FXML
    public void addFour(ActionEvent actionEvent){
        stringToCalculate.append("4");
    }
    @FXML
    public void addFive(ActionEvent actionEvent){
        stringToCalculate.append("5");
    }
    @FXML
    public void addSix(ActionEvent actionEvent){
        stringToCalculate.append("6");
    }
    @FXML
    public void addSeven(ActionEvent actionEvent){
        stringToCalculate.append("7");
    }
    @FXML
    public void addEight(ActionEvent actionEvent){
        stringToCalculate.append("8");
    }
    @FXML
    public void addNine(ActionEvent actionEvent){
        stringToCalculate.append("9");
    }
    @FXML
    public void addZero(ActionEvent actionEvent){
        stringToCalculate.append("0");
    }
    @FXML
    public void addPlus(ActionEvent actionEvent){
        stringToCalculate.append("+");
    }
    @FXML
    public void addMinus(ActionEvent actionEvent){
        stringToCalculate.append("-");
    }
    @FXML
    public void addMultiply(ActionEvent actionEvent){
        stringToCalculate.append("*");
    }
    @FXML
    public void addDivide(ActionEvent actionEvent){
        stringToCalculate.append("/");
    }
    @FXML
    public void addPoint(ActionEvent actionEvent) {
        stringToCalculate.append(".");
    }
    @FXML
    public void equals(ActionEvent actionEvent){

    }
    @FXML
    public void ac(ActionEvent actionEvent){

    }
}
