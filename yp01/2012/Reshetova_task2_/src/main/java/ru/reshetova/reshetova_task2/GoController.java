package ru.reshetova.reshetova_task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class GoController {

    @FXML
    private TextField chTextField;

    @FXML
    private Button go;

    @FXML
    private Label result;

    @FXML
    void GoButtonOnAction(ActionEvent event) {
        int a=Integer.parseInt(chTextField.getText().toString());
        int b=a/10;
        int c= a %10;
        String des;
        switch(b){
            case 2:
                des="двадцать";
                break;
            case 3:
                des="тридцать";
                break;
            case 4:
                des="сорок";
                break;
            case 5:
                des="пятьдесят";
                break;
            case 6:
                des="шестьдесят";
                break;
            default:
                des="ошибка, неверный диапозон";
                break;
        }
        if(b>=2&& b<=6)
            switch (c){
                case 0:
                    des+=" лет";
                    break;
                case 1:
                    des+=" один год";
                    break;
                case 2:
                    des+=" два года";
                    break;
                case 3:
                    des+=" три года";
                    break;
                case 4:
                    des+=" четыре года";
                    break;
                case 5:
                    des+=" пять лет";
                    break;
                case 6:
                    des+=" шесть лет";
                    break;
                case 7:
                    des+=" семь лет";
                    break;
                case 8:
                    des+=" восемь лет";
                    break;
                case 9:
                    des+=" девять лет";
                    break;
                default:
                    break;

            }
        result.setText("возраст: "+des);

    }

}

