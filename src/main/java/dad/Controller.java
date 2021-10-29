package dad;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class Controller implements Initializable {

    private StringProperty textProperty = new SimpleStringProperty();

    @FXML
    private GridPane view;

    @FXML
    private TextField numTextField;

    @FXML
    private Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonE,
            buttonK, buttonI, buttonM, buttonD, buttonR, buttonC, buttonS;

    private Calculadora calculadora = new Calculadora();

    public Controller() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/dad/View.fxml"));
        loader.setController(this);
        loader.load();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        numTextField.textProperty().bind(textProperty);

    }

    @FXML
    private void onClick(ActionEvent e) {

        char letra = e.getSource().toString().charAt(e.getSource().toString().length() - 2);


        switch (letra) {
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            calculadora.insertar(letra);
            break;
        case '+':
            calculadora.operar(Calculadora.SUMAR);
            break;
        case '-':
            calculadora.operar(Calculadora.RESTAR);
            break;
        case '*':
            calculadora.operar(Calculadora.MULTIPLICAR);
            break;
        case '/':
            calculadora.operar(Calculadora.DIVIDIR);
            break;
        case '.':
            calculadora.insertarComa();
            break;
        case '=':
            calculadora.operar(Calculadora.IGUAL);
            break;
        case 'C':
            calculadora.borrar();
            break;
        case 'E':
            calculadora.borrarTodo();
            break;
        }

        // if (e.getSource().equals(button0)) {
        // calculadora.insertar(button0.getText().charAt(0));
        // } else if (e.getSource().equals(button1)) {
        // calculadora.insertar(button1.getText().charAt(0));
        // } else if (e.getSource().equals(button2)) {
        // calculadora.insertar(button2.getText().charAt(0));
        // } else if (e.getSource().equals(button3)) {
        // calculadora.insertar(button3.getText().charAt(0));
        // } else if (e.getSource().equals(button4)) {
        // calculadora.insertar(button4.getText().charAt(0));
        // } else if (e.getSource().equals(button5)) {
        // calculadora.insertar(button5.getText().charAt(0));
        // } else if (e.getSource().equals(button6)) {
        // calculadora.insertar(button6.getText().charAt(0));
        // } else if (e.getSource().equals(button7)) {
        // calculadora.insertar(button7.getText().charAt(0));
        // } else if (e.getSource().equals(button8)) {
        // calculadora.insertar(button8.getText().charAt(0));
        // } else if (e.getSource().equals(button9)) {
        // calculadora.insertar(button9.getText().charAt(0));
        // } else if (e.getSource().equals(buttonC)) {
        // calculadora.borrar();
        // } else if (e.getSource().equals(buttonE)) {
        // calculadora.borrarTodo();
        // } else if (e.getSource().equals(buttonS)) {
        // calculadora.operar(Calculadora.SUMAR);
        // }else if (e.getSource().equals(buttonR)) {
        // calculadora.operar(Calculadora.RESTAR);
        // } else if (e.getSource().equals(buttonD)) {
        // calculadora.operar(Calculadora.DIVIDIR);
        // } else if (e.getSource().equals(buttonM)) {
        // calculadora.operar(Calculadora.MULTIPLICAR);
        // } else if (e.getSource().equals(buttonI)) {
        // calculadora.operar(Calculadora.IGUAL);
        // } else {
        // calculadora.insertarComa();
        // }

        textProperty.set(calculadora.getPantalla());

    }

    public GridPane getview() {
        return view;
    }

}
