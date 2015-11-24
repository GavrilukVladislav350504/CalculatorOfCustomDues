package sample;

/**
 * Created by Влад on 17.09.2015.
 */

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
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
    private Rectangle lineFirstFiz,
                      lineSecondFiz,
                      lineThridFiz,
                      lineFirstJur,
                      lineSecondJur,
                      lineThridJur,
                      lineFourthJur;

    @FXML
    private void calcFiz(){

        boolean flagForAge=false;
        boolean flagForValue=false;
        boolean flagForCost=false;
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

        if(!checkingErrors.checkString(costStrFiz))
            {
                checkingErrors.lineSet(lineThridFiz,flagForCost);
            }
        else
            {
                checkingErrors.lineDrop(lineThridFiz,flagForCost);
                costAuto=Integer.parseInt(costStrFiz);
            }
        if(!checkingErrors.checkString(valueStrFiz))
            {
                checkingErrors.lineSet(lineSecondFiz,flagForValue);
            }
        else
            {
                checkingErrors.lineDrop(lineThridFiz,flagForValue);
                valueAuto=Integer.parseInt(valueStrFiz);
            }
        if(costAuto<=0)
            {
               checkingErrors.lineSet(lineThridFiz,flagForCost);
            }
        else
            {
               checkingErrors.lineDrop(lineThridFiz,flagForCost);
            }
        if(valueAuto<=0)
            {
                checkingErrors.lineSet(lineSecondFiz,flagForValue);
            }
        else
            {
                checkingErrors.lineDrop(lineSecondFiz,flagForValue);
            }



        if(checkOneFiz.isSelected()&&!checkTwoFiz.isSelected()&&!checkThreeFiz.isSelected())
            {
                logicAbstaract start1=new logicFiz_0to3();
                costAutoResult=start1.logic(costAuto,valueAuto, costAutoResult);
            }
        if(!checkOneFiz.isSelected()&&checkTwoFiz.isSelected()&&!checkThreeFiz.isSelected())
            {
                logicAbstaract start2=new logicFiz_3to5();
                costAutoResult=start2.logic(costAuto, valueAuto, costAutoResult);
            }
        if(!checkOneFiz.isSelected()&&!checkTwoFiz.isSelected()&&checkThreeFiz.isSelected())
            {
                logicAbstaract start3=new logicFiz_5to9();
                costAutoResult=start3.logic(costAuto, valueAuto, costAutoResult);
            }

        if(!flagForAge&&!flagForValue&&!flagForCost)
        resultFiz.setText("Custom dues is "+Integer.toString((int) costAutoResult) +" euro");
    }

    @FXML
    private void calcJur(){

        boolean flagForAge = false;
        boolean flagForValue = false;
        boolean flagForCost = false;
        boolean flagForType = false;

        if(checkOneJur.isSelected()&&checkTwoJur.isSelected()&&!checkThreeJur.isSelected()||
                checkOneJur.isSelected()&&!checkTwoJur.isSelected()&&checkThreeJur.isSelected()||
                !checkOneJur.isSelected()&&checkTwoJur.isSelected()&&checkThreeJur.isSelected()||
                !checkOneJur.isSelected()&&!checkTwoJur.isSelected()&&!checkThreeJur.isSelected()||
                checkOneJur.isSelected()&&checkTwoJur.isSelected()&&checkThreeJur.isSelected())


        if(Dt.isSelected()&&Benz.isSelected()||
                !Dt.isSelected()&&!Benz.isSelected())
        {
            checkingErrors.lineSet(lineSecondJur,flagForType);
        }
        else
        {
            checkingErrors.lineDrop(lineSecondJur,flagForType);
        }

        String costStrJur=costJur.getText();
        String valueStrJur=valueJur.getText();
        double costAutoResult=0;
        double costAuto=0;
        double valueAuto=0;

        if(!checkingErrors.checkString(costStrJur))
        {
            checkingErrors.lineSet(lineFourthJur,flagForCost);
        }
        else
        {
            checkingErrors.lineDrop(lineFourthJur,flagForCost);
            costAuto=Integer.parseInt(costStrJur);
        }
        if(!checkingErrors.checkString(valueStrJur))
        {
            checkingErrors.lineSet(lineThridJur,flagForType);
        }
        else
        {
            checkingErrors.lineDrop(lineThridJur,flagForValue);
            valueAuto=Integer.parseInt(valueStrJur);
        }
        if(costAuto<=0)
        {
            checkingErrors.lineSet(lineFourthJur,flagForCost);
        }
        else
        {
            checkingErrors.lineDrop(lineFourthJur,flagForCost);
        }
        if(valueAuto<=0)
        {
            checkingErrors.lineSet(lineThridJur,flagForValue);
        }
        else
        {
            checkingErrors.lineDrop(lineThridJur,flagForValue);
        }
        if(Benz.isSelected())
        {
            if (checkOneJur.isSelected() && !checkTwoJur.isSelected() && !checkThreeJur.isSelected())
                {
                    logicAbstaract start1=new logicJurBenz_0to3();
                    costAutoResult=start1.logic(costAuto,valueAuto,costAutoResult);
                }
            if (!checkOneJur.isSelected() && checkTwoJur.isSelected() && !checkThreeJur.isSelected())
                {
                    logicAbstaract start2=new logicJurBenz_3to5();
                    costAutoResult=start2.logic(costAuto,valueAuto,costAutoResult);
                }
            if (!checkOneJur.isSelected() && !checkTwoJur.isSelected() && checkThreeJur.isSelected())
                {
                    logicAbstaract start3=new logicJurBenz_5to9();
                    costAutoResult= start3.logic(costAuto,valueAuto,costAutoResult);
                }
        }

        if (Dt.isSelected()) {
            if (checkOneJur.isSelected() && !checkTwoJur.isSelected() && !checkThreeJur.isSelected())
                {
                    logicAbstaract start1=new logicJurDiz_0to3();
                    costAutoResult=start1.logic(costAuto,valueAuto,costAutoResult);
                }
            if (!checkOneJur.isSelected() && checkTwoJur.isSelected() && !checkThreeJur.isSelected())
                {
                    logicAbstaract start1=new logicJurDiz_3to5();
                    costAutoResult=start1.logic(costAuto,valueAuto,costAutoResult);
                }

            if (!checkOneJur.isSelected() && !checkTwoJur.isSelected() && checkThreeJur.isSelected())
                {
                    logicAbstaract start1=new logicJurDiz_5to9();
                    costAutoResult=start1.logic(costAuto,valueAuto,costAutoResult);
                }
        }
        if(!flagForAge&&!flagForValue&&!flagForCost&&!flagForType)
        resultJur.setText("Custom dues is "+Integer.toString((int) costAutoResult) +" euro");

    }
}
