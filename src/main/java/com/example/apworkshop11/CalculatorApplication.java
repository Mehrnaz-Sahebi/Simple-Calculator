package com.example.apworkshop11;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class CalculatorApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("calculator.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("AP-Calculator");
        Controler controler = fxmlLoader.getController();
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode() == KeyCode.DIGIT0 || event.getCode()==KeyCode.NUMPAD0){
                    controler.addZero();
                } else if (event.getCode() == KeyCode.DIGIT1 || event.getCode()==KeyCode.NUMPAD1) {
                    controler.addOne();
                } else if(event.getCode() == KeyCode.DIGIT2 || event.getCode()==KeyCode.NUMPAD2){
                    controler.addTwo();
                } else if (event.getCode() == KeyCode.DIGIT3 || event.getCode()==KeyCode.NUMPAD3) {
                    controler.addThree();
                } else if (event.getCode() == KeyCode.DIGIT4 || event.getCode()==KeyCode.NUMPAD4) {
                    controler.addFour();
                } else if (event.getCode() == KeyCode.DIGIT5 || event.getCode()==KeyCode.NUMPAD5) {
                    controler.addFive();
                }  else if (event.getCode() == KeyCode.DIGIT6 || event.getCode()==KeyCode.NUMPAD6) {
                    controler.addSix();
                } else if (event.getCode() == KeyCode.DIGIT7 || event.getCode()==KeyCode.NUMPAD7) {
                    controler.addSeven();
                } else if (event.getCode() == KeyCode.DIGIT8 || event.getCode()==KeyCode.NUMPAD8) {
                    controler.addEight();
                } else if (event.getCode() == KeyCode.DIGIT9 || event.getCode()==KeyCode.NUMPAD9) {
                    controler.addNine();
                } else if (event.getCode() == KeyCode.ADD) {
                    controler.addPlus();
                } else if (event.getCode() == KeyCode.SUBTRACT) {
                    controler.addMinus();
                } else if (event.getCode() == KeyCode.MULTIPLY) {
                    controler.addMultiply();
                } else if (event.getCode() == KeyCode.DIVIDE) {
                    controler.addDivide();
                } else if (event.getCode() == KeyCode.DECIMAL) {
                    controler.addPoint();
                } else if (event.getCode() == KeyCode.EQUALS || event.getCode() == KeyCode.ENTER) {
                    controler.equals();
                } else if(event.getCode() == KeyCode.BACK_SPACE) {
                    controler.backSpace();
                }
            }
        });
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
