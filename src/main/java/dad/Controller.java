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
    private Button button7, button8, button9, buttonCE, buttonC, buttonIgual, button0, button4, button5, button6,
            buttonMul, buttonDiv,button1,button2,button3,buttonRes,buttonComa,buttonSum;

    @FXML
    private TextField numTextField;

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
        String button7, button8, button9, buttonCE, buttonC, buttonIgual, button0, button4, button5, button6,
        buttonMul, buttonDiv,button1,button2,button3,buttonRes,buttonComa,buttonSum;

        
    }

    public GridPane getview() {
        return view;
    }

}
