package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.controlsfx.dialog.Dialogs;

import java.util.HashMap;

public class Controller {

    private HashMap<Button, String> buttonQuestion = new HashMap<Button, String>();

    private String questionKat1_100 = "Was sind Analgetika?";
    private String questionKat1_200 = "Nennen Sie zwei Beispielmedikamente!";
    private String questionKat1_300 = "Nennen Sie drei Krankheitsbilder, bei denen Analgetika gegeben werden!";
    private String questionKat1_400 = "Nennen Sie zwei Nebenwirkungen, die häufig auftreten können!";
    private String questionKat1_500 = "Was muss beim Verabreichen von Paracetamol beachtet werden?";

    private String questionKat2_100 = "Was sind Antibiotika?";
    private String questionKat2_200 = "Nennen Sie zwei Krankheitsbilder, bei denen Antibiotika gegeben werden!";
    private String questionKat2_300 = "Nennen Sie drei Beispielmedikamente!";
    private String questionKat2_400 = "Wie wirken Antibiotika?";
    private String questionKat2_500 = "Penicillin ist ein Antibiotikum und wird gewonnen aus...?";

    private String questionKat3_100 = "Werden Antidepressiva bei physischen oder psychischen Erkrankungen gegeben?";
    private String questionKat3_200 = "Nennen Sie ein Krankheitsbild, bei dem Antidepressiva gegeben werden!";
    private String questionKat3_300 = "Nennen Sie zwei Beispielmedikamente!";
    private String questionKat3_400 = "Nennen Sie drei Nebenwirkungen!";
    private String questionKat3_500 = "Was regen Antidepressiva im Gehirn an?";

    private String questionKat4_100 = "Was sind Lipidsenker?";
    private String questionKat4_200 = "Wie wirken Lipidsenker?";
    private String questionKat4_300 = "Wann werden Lipidsenker gegeben?";
    private String questionKat4_400 = "Nennen Sie drei Nebenwirkungen!";
    private String questionKat4_500 = "Wie heißt das bekannteste lipidsenkende Medikament?";

    private String questionKat5_100 = "Was sind Diuretika?";
    private String questionKat5_200 = "Wie wirken Diuretika?";
    private String questionKat5_300 = "Wann werden Diuretika gegeben?";
    private String questionKat5_400 = "Nennen Sie drei Nebenwirkungen!";
    private String questionKat5_500 = "Wie heißt das bekannteste Medikament der Diuretika?";

    private String kategorie1 = "Analgetika";
    private String kategorie2 = "Antibiotika";
    private String kategorie3 = "Antidepressiva";
    private String kategorie4 = "Lipidsenker";
    private String kategorie5 = "Diuretika";

    @FXML
    private Button buttonKat4_100;

    @FXML
    private Button buttonKat4_200;

    @FXML
    private Button buttonKat4_300;

    @FXML
    private Button buttonKat4_400;

    @FXML
    private Button buttonKat4_500;

    @FXML
    private Label kategorie2Label;

    @FXML
    private Label kategorie4Label;

    @FXML
    private Button buttonKat3_200;

    @FXML
    private Button buttonKat3_300;

    @FXML
    private Button buttonKat3_100;

    @FXML
    private Button buttonKat3_400;

    @FXML
    private Button buttonKat3_500;

    @FXML
    private Label kategorie3Label;

    @FXML
    private Button buttonKat2_500;

    @FXML
    private Button buttonKat2_100;

    @FXML
    private Button buttonKat2_200;

    @FXML
    private Button buttonKat2_300;

    @FXML
    private Button buttonKat2_400;

    @FXML
    private Button buttonKat1_400;

    @FXML
    private Button buttonKat1_500;

    @FXML
    private Button buttonKat1_200;

    @FXML
    private Label kategorie1Label;

    @FXML
    private Button buttonKat1_300;

    @FXML
    private Button buttonKat5_400;

    @FXML
    private Button buttonKat1_100;

    @FXML
    private Button buttonKat5_500;

    @FXML
    private Label kategorie5Label;

    @FXML
    private Button buttonKat5_200;

    @FXML
    private Button buttonKat5_300;

    @FXML
    private Button buttonKat5_100;

    @FXML
    private void initialize() {
        kategorie1Label.setText(kategorie1);
        kategorie2Label.setText(kategorie2);
        kategorie3Label.setText(kategorie3);
        kategorie4Label.setText(kategorie4);
        kategorie5Label.setText(kategorie5);

        buttonQuestion.put(buttonKat1_100, questionKat1_100);
        buttonQuestion.put(buttonKat1_200, questionKat1_200);
        buttonQuestion.put(buttonKat1_300, questionKat1_300);
        buttonQuestion.put(buttonKat1_400, questionKat1_400);
        buttonQuestion.put(buttonKat1_500, questionKat1_500);

        buttonQuestion.put(buttonKat2_100, questionKat2_100);
        buttonQuestion.put(buttonKat2_200, questionKat2_200);
        buttonQuestion.put(buttonKat2_300, questionKat2_300);
        buttonQuestion.put(buttonKat2_400, questionKat2_400);
        buttonQuestion.put(buttonKat2_500, questionKat2_500);

        buttonQuestion.put(buttonKat3_100, questionKat3_100);
        buttonQuestion.put(buttonKat3_200, questionKat3_200);
        buttonQuestion.put(buttonKat3_300, questionKat3_300);
        buttonQuestion.put(buttonKat3_400, questionKat3_400);
        buttonQuestion.put(buttonKat3_500, questionKat3_500);

        buttonQuestion.put(buttonKat4_100, questionKat4_100);
        buttonQuestion.put(buttonKat4_200, questionKat4_200);
        buttonQuestion.put(buttonKat4_300, questionKat4_300);
        buttonQuestion.put(buttonKat4_400, questionKat4_400);
        buttonQuestion.put(buttonKat4_500, questionKat4_500);

        buttonQuestion.put(buttonKat5_100, questionKat5_100);
        buttonQuestion.put(buttonKat5_200, questionKat5_200);
        buttonQuestion.put(buttonKat5_300, questionKat5_300);
        buttonQuestion.put(buttonKat5_400, questionKat5_400);
        buttonQuestion.put(buttonKat5_500, questionKat5_500);
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        Button source = (Button) event.getSource();
        source.setStyle("-fx-background-color: red;");
        Dialogs.create()
                .owner(Main.stage)
                .title("Die Frage/Aufgabe lautet:")
                .masthead(null)
                .message(buttonQuestion.get(source))
                .showInformation();
    }
}
