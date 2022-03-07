package views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField screen;
    @FXML
    private Button btZero;
    @FXML
    private Button btOne;
    @FXML
    private Button btTwo;
    @FXML
    private Button btThree;
    @FXML
    private Button btFour;
    @FXML
    private Button btFive;
    @FXML
    private Button btSix;
    @FXML
    private Button btSeven;
    @FXML
    private Button btEight;
    @FXML
    private Button btNine;

    public void onBtZeroAction() {
        if (screen.getLength() > 0 && screen.getText().charAt(0) != '0') screen.setText(screen.getText() + '0');
    }

    public void onBtOneAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("1");
        else screen.setText(screen.getText() + "1");
    }

    public void onBtTwoAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("2");
        else screen.setText(screen.getText() + "2");
    }

    public void onBtThreeAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("3");
        else screen.setText(screen.getText() + "3");
    }

    public void onBtFourAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("4");
        else screen.setText(screen.getText() + "4");
    }

    public void onBtFiveAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("5");
        else screen.setText(screen.getText() + "5");
    }

    public void onBtSixAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("6");
        else screen.setText(screen.getText() + "6");
    }

    public void onBtSevenAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("7");
        else screen.setText(screen.getText() + "7");
    }

    public void onBtEightAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("8");
        else screen.setText(screen.getText() + "8");
    }

    public void onBtNineAction() {
        if (screen.getLength() == 1 && screen.getText().equals("0")) screen.setText("9");
        else screen.setText(screen.getText() + "9");
    }
}