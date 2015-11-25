package sample;

/**
 * Created by Влад on 17.09.2015.
 */

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.shape.Rectangle;
import sample.logicalPack.*;

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
    private RadioButton checkOneFiz,
                        checkTwoFiz,
                        checkThreeFiz,
                        checkOneJur,
                        checkTwoJur,
                        checkThreeJur,
                        Dt,
                        Benz;
    @FXML
    private Rectangle lineSecondFiz;
    @FXML
    private Rectangle lineThridFiz;
    @FXML
    private Rectangle lineThridJur;
    @FXML
    private Rectangle lineFourthJur;

    @FXML
    private void calcFiz(){

        boolean flagForValue;
        boolean flagForCost;

        String costStrFiz=costFiz.getText();
        String valueStrFiz=valueFiz.getText();
        double costAutoResult=0;
        double costAuto=0;
        double valueAuto=0;

        if(!checkingErrors.checkString(costStrFiz))
            {
                flagForCost=checkingErrors.lineSet(lineThridFiz);
            }
        else
            {
                flagForCost=checkingErrors.lineDrop(lineThridFiz);
                costAuto=Integer.parseInt(costStrFiz);
            }
        if(!checkingErrors.checkString(valueStrFiz))
            {
                flagForValue=checkingErrors.lineSet(lineSecondFiz);
            }
        else
            {
                flagForValue=checkingErrors.lineDrop(lineThridFiz);
                valueAuto=Integer.parseInt(valueStrFiz);
            }
        if(costAuto<=0)
            {
               flagForCost=checkingErrors.lineSet(lineThridFiz);
            }
        else
            {
               flagForCost=checkingErrors.lineDrop(lineThridFiz);
            }
        if(valueAuto<=0)
            {
                flagForValue=checkingErrors.lineSet(lineSecondFiz);
            }
        else
            {
                flagForValue=checkingErrors.lineDrop(lineSecondFiz);
            }



        if(checkOneFiz.isSelected()&&!checkTwoFiz.isSelected()&&!checkThreeFiz.isSelected())
            {
                logicFiz_0to3 start1=new logicFiz_0to3();
                costAutoResult=start1.logic(costAuto,valueAuto);
            }
        if(!checkOneFiz.isSelected()&&checkTwoFiz.isSelected()&&!checkThreeFiz.isSelected())
            {
                logicFiz_3to5 start2=new logicFiz_3to5();
                costAutoResult=start2.logic(costAuto, valueAuto);
            }
        if(!checkOneFiz.isSelected()&&!checkTwoFiz.isSelected()&&checkThreeFiz.isSelected())
            {
                logicFiz_5to9 start3=new logicFiz_5to9();
                costAutoResult=start3.logic(costAuto, valueAuto);
            }

        if(flagForValue&&flagForCost)
        resultFiz.setText("Custom dues is "+Integer.toString((int) costAutoResult) +" euro");
    }

    @FXML
    private void calcJur(){

        boolean flagForValue;
        boolean flagForCost;
        String costStrJur=costJur.getText();
        String valueStrJur=valueJur.getText();
        double costAutoResult=0;
        double costAuto=0;
        double valueAuto=0;

        if(!checkingErrors.checkString(costStrJur))
        {
            checkingErrors.lineSet(lineFourthJur);
        }
        else
        {
            checkingErrors.lineDrop(lineFourthJur);
            costAuto=Integer.parseInt(costStrJur);
        }
        if(!checkingErrors.checkString(valueStrJur))
        {
            flagForValue=checkingErrors.lineSet(lineThridJur);
        }
        else
        {
            flagForValue=checkingErrors.lineDrop(lineThridJur);
            valueAuto=Integer.parseInt(valueStrJur);
        }
        if(costAuto<=0)
        {
            flagForCost=checkingErrors.lineSet(lineFourthJur);
        }
        else
        {
            flagForCost=checkingErrors.lineDrop(lineFourthJur);
        }
        if(valueAuto<=0)
        {
            flagForValue=checkingErrors.lineSet(lineThridJur);
        }
        else
        {
            flagForValue=checkingErrors.lineDrop(lineThridJur);
        }
        if(Benz.isSelected())
        {
            if (checkOneJur.isSelected() && !checkTwoJur.isSelected() && !checkThreeJur.isSelected())
                {
                    logicJurBenz_0to3 start = new logicJurBenz_0to3();
                    costAutoResult=start.logic(costAuto,valueAuto);
                }
            if (!checkOneJur.isSelected() && checkTwoJur.isSelected() && !checkThreeJur.isSelected())
                {
                    logicJurBenz_3to5 start = new logicJurBenz_3to5();
                    costAutoResult=start.logic(costAuto,valueAuto);
                }
            if (!checkOneJur.isSelected() && !checkTwoJur.isSelected() && checkThreeJur.isSelected())
                {
                    logicJurBenz_5to9 start = new logicJurBenz_5to9();
                    costAutoResult=start.logic(costAuto,valueAuto);
                }
        }

        if (Dt.isSelected()) {
            if (checkOneJur.isSelected() && !checkTwoJur.isSelected() && !checkThreeJur.isSelected())
                {
                    logicJurDiz_0to3 start = new logicJurDiz_0to3();
                    costAutoResult=start.logic(costAuto,valueAuto);
                }
            if (!checkOneJur.isSelected() && checkTwoJur.isSelected() && !checkThreeJur.isSelected())
                {
                    logicJurDiz_3to5 start1=new logicJurDiz_3to5();
                    costAutoResult=start1.logic(costAuto,valueAuto);
                }

            if (!checkOneJur.isSelected() && !checkTwoJur.isSelected() && checkThreeJur.isSelected())
                {
                    logicJurDiz_5to9 start1=new logicJurDiz_5to9();
                    costAutoResult=start1.logic(costAuto,valueAuto);
                }
        }
        if(flagForValue&&flagForCost)
        resultJur.setText("Custom dues is "+Integer.toString((int) costAutoResult) +" euro");

    }
}
