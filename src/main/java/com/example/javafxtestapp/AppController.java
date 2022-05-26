package com.example.javafxtestapp;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

import java.net.URL;
import java.util.ResourceBundle;

public class AppController implements Initializable {

    @FXML
    private Label outputSliderField;

    @FXML
    private Label randField;

    @FXML
    private Slider inputSlider;


    int sliderValue;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        sliderValue = (int)inputSlider.getValue();
        outputSliderField.setText(Integer.toString(sliderValue));
        inputSlider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                sliderValue = (int)inputSlider.getValue();
                outputSliderField.setText(Integer.toString(sliderValue));
                randField.setText(String.format("%.0f", Random.getRandom(sliderValue)));
            }

        });
    }
}