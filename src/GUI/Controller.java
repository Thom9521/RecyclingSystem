package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML
    private Label lblA, lblB, lblC, lblTotal, prisA, prisB, prisC;
    @FXML
    private Button btnA, btnB, btnC, btnAfslut;

    int aText = 0;
    int bText = 0;
    int cText = 0;

    double aPris = 0;
    double bPris = 0;
    double cPris = 0;



    @FXML
    private void eButtonAction(ActionEvent e){

        if (e.getSource() == btnA) {
            aText++;
            lblA.setText(String.valueOf(aText));
            aPris = aPris + 1;
            prisA.setText(String.valueOf(aPris));

        }

        if (e.getSource() == btnB) {
            bText++;
            lblB.setText(String.valueOf(bText));
            bPris = bPris + 1.5;
            prisB.setText(String.valueOf(bPris));
        }

        if (e.getSource() == btnC) {
            cText++;
            lblC.setText(String.valueOf(cText));
            cPris = cPris + 3;
            prisC.setText(String.valueOf(cPris));

        }

        if (e.getSource() == btnAfslut){
            lblTotal.setText("Antal flasker du har smidt \ni pantmaskinen: " + String.valueOf(aText + bText + cText)+
            " med en \nsamlet pris på: " + String.valueOf(aPris + bPris + cPris) + " kr.");
        }


    }
}
