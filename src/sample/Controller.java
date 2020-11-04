package sample;

import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.awt.*;

public class Controller {
    public TextField t_height;
    public TextField t_weight;
    public Label lab_bmi;
    public Label lab_descr;



    public void displayBMI(){
        double height;
        double weight;
        double bmi;
        String description;

        height =Double.parseDouble( t_height.getText());
        weight =Double.parseDouble(t_weight.getText());

        bmi = height*height;
        bmi =  weight/bmi;

        lab_bmi.setText("BMI = " +bmi);

        description = lab_descr.getText();
        if (bmi <18.5){
           description = "Under Weight";

        }else if(bmi > 18.5 && bmi<25){
            description = "Normal";

        }else if(bmi>25) {
            description ="Over Weight";
        }

        lab_descr.setText("You are: "+description);





        }




    }

