package sample;

/**
 * Created by Влад on 17.09.2015.
 */

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;

public class controllerInterface {

    @FXML
    private Label resultFiz,
                  resultJur;
    @FXML
    private TextField costFiz,
                      valueFiz,
                      costJur,
                      valueJur;
    @FXML
    private CheckBox checkOneFiz,
                     checkTwoFiz,
                     checkThreeFiz,
                     checkOneJur,
                     checkTwoJur,
                     checkThreeJur,
                     Dt,
                     Benz;
    @FXML
    private Rectangle lineFirstFiz,
                      lineSecondFiz,
                      lineThridFiz,
                      lineFirstJur,
                      lineSecondJur,
                      lineThridJur,
                      lineFourthJur;

    @FXML
    private void calcFiz(){

        boolean flagForAge;
        boolean flagForValue;
        boolean flagForCost;
        String costStrFiz=costFiz.getText();
        String valueStrFiz=valueFiz.getText();
        double costAutoResult=0;
        double costAuto=0;
        double valueAuto=0;

        if(checkOneFiz.isSelected()&&checkTwoFiz.isSelected()&&!checkThreeFiz.isSelected()||
                checkOneFiz.isSelected()&&!checkTwoFiz.isSelected()&&checkThreeFiz.isSelected()||
                !checkOneFiz.isSelected()&&checkTwoFiz.isSelected()&&checkThreeFiz.isSelected()||
                !checkOneFiz.isSelected()&&!checkTwoFiz.isSelected()&&!checkThreeFiz.isSelected()||
                checkOneFiz.isSelected()&&checkTwoFiz.isSelected()&&checkThreeFiz.isSelected())
            {
                logic.lineSet(lineFirstFiz);
                flagForAge=false;
            }
        else
            {
                logic.lineDrop(lineFirstFiz);
                flagForAge=true;
            }
        if(!logic.checkString(costStrFiz))
            {
                logic.lineSet(lineThridFiz);
                flagForCost=false;
            }
        else
            {
                logic.lineDrop(lineThridFiz);
                flagForCost=true;
                costAuto=Integer.parseInt(costStrFiz);
            }
        if(!logic.checkString(valueStrFiz))
            {
                logic.lineSet(lineSecondFiz);
                flagForValue=false;
            }
        else
            {
                logic.lineDrop(lineThridFiz);
                flagForValue=true;
                valueAuto=Integer.parseInt(valueStrFiz);
            }
        if(costAuto<=0)
            {
               logic.lineSet(lineThridFiz);
               flagForCost=false;
            }
        else
            {
               logic.lineDrop(lineThridFiz);
               flagForCost=true;
            }
        if(valueAuto<=0)
            {
                logic.lineSet(lineSecondFiz);
                flagForValue=false;
            }
        else
            {
                logic.lineDrop(lineSecondFiz);
                flagForValue=true;
            }



        if(checkOneFiz.isSelected()&&!checkTwoFiz.isSelected()&&!checkThreeFiz.isSelected())
            {
                costAutoResult=logic.Fiz1(costAuto,valueAuto, costAutoResult);
            }
        if(!checkOneFiz.isSelected()&&checkTwoFiz.isSelected()&&!checkThreeFiz.isSelected())
            {
                costAutoResult=logic.Fiz2(valueAuto, costAutoResult);
            }
        if(!checkOneFiz.isSelected()&&!checkTwoFiz.isSelected()&&checkThreeFiz.isSelected())
            {
                costAutoResult=logic.Fiz3(valueAuto, costAutoResult);
            }

        if(flagForAge&&flagForValue&&flagForCost)
        resultFiz.setText("Custom dues is "+Integer.toString((int) costAutoResult) +" euro");
    }

    @FXML
    private void calcJur(){

        boolean flagForAge;
        boolean flagForValue;
        boolean flagForCost;
        boolean flagForType;

        if(checkOneJur.isSelected()&&checkTwoJur.isSelected()&&!checkThreeJur.isSelected()||
                checkOneJur.isSelected()&&!checkTwoJur.isSelected()&&checkThreeJur.isSelected()||
                !checkOneJur.isSelected()&&checkTwoJur.isSelected()&&checkThreeJur.isSelected()||
                !checkOneJur.isSelected()&&!checkTwoJur.isSelected()&&!checkThreeJur.isSelected()||
                checkOneJur.isSelected()&&checkTwoJur.isSelected()&&checkThreeJur.isSelected())
            {
                logic.lineSet(lineFirstJur);
                flagForAge=false;
            }
            else
            {
                logic.lineDrop(lineFirstJur);
                flagForAge=true;
            }

        if(Dt.isSelected()&&Benz.isSelected()||
                !Dt.isSelected()&&!Benz.isSelected())
        {
            logic.lineSet(lineSecondJur);
            flagForType=false;
        }
        else
        {
            logic.lineDrop(lineSecondJur);
            flagForType=true;
        }

        String costStrJur=costJur.getText();
        String valueStrJur=valueJur.getText();
        double costAutoResult=0;
        double costAuto=0;
        double valueAuto=0;

        if(!logic.checkString(costStrJur))
        {
            logic.lineSet(lineFourthJur);
            flagForCost=false;
        }
        else
        {
            logic.lineDrop(lineFourthJur);
            flagForCost=true;
            costAuto=Integer.parseInt(costStrJur);
        }
        if(!logic.checkString(valueStrJur))
        {
            logic.lineSet(lineThridJur);
            flagForType=false;
        }
        else
        {
            logic.lineDrop(lineThridJur);
            flagForValue=true;
            valueAuto=Integer.parseInt(valueStrJur);
        }
        if(costAuto<=0)
        {
            logic.lineSet(lineFourthJur);
            flagForCost=false;
        }
        else
        {
            logic.lineDrop(lineFourthJur);
            flagForCost=true;
        }
        if(valueAuto<=0)
        {
            logic.lineSet(lineThridJur);
            flagForValue=false;
        }
        else
        {
            logic.lineDrop(lineThridJur);
            flagForValue=true;
        }
        if(Benz.isSelected())
        {
            if (checkOneJur.isSelected() && !checkTwoJur.isSelected() && !checkThreeJur.isSelected())
                {
                    costAutoResult=logic.Jur1_benz(costAuto,valueAuto,costAutoResult);
                }
            if (!checkOneJur.isSelected() && checkTwoJur.isSelected() && !checkThreeJur.isSelected())
                {
                    costAutoResult=logic.Jur2_benz(costAuto, valueAuto, costAutoResult);
                }
            if (!checkOneJur.isSelected() && !checkTwoJur.isSelected() && checkThreeJur.isSelected())
                {
                    costAutoResult=logic.Jur3_benz(valueAuto, costAutoResult);
                }
        }

        if (Dt.isSelected()) {
            if (checkOneJur.isSelected() && !checkTwoJur.isSelected() && !checkThreeJur.isSelected())
                {
                    costAutoResult=logic.Jur1_diz(costAuto, valueAuto, costAutoResult);
                }
            if (!checkOneJur.isSelected() && checkTwoJur.isSelected() && !checkThreeJur.isSelected())
                {
                    costAutoResult=logic.Jur2_diz(costAuto, valueAuto,costAutoResult);
                }

            if (!checkOneJur.isSelected() && !checkTwoJur.isSelected() && checkThreeJur.isSelected())
                {
                    costAutoResult=logic.Jur3_diz(valueAuto, costAutoResult);
                }
        }
        if(flagForAge&&flagForValue&&flagForCost&&flagForType)
        resultJur.setText("Custom dues is "+Integer.toString((int) costAutoResult) +" euro");

    }
}
