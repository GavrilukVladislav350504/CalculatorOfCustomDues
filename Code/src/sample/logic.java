package sample;

import javafx.animation.FadeTransition;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 * Created by Влад on 30.09.2015.
 */
public class logic {

    public static double Jur3_diz(double valueAuto, double costAutoResult){

        if (valueAuto <= 1000) costAutoResult = valueAuto*2.5;
        if (valueAuto > 1000&&valueAuto <=1500) costAutoResult = valueAuto*2.7;
        if (valueAuto > 1500&&valueAuto <=1800) costAutoResult = valueAuto*2.9;
        if (valueAuto > 1800&&valueAuto <=2300) costAutoResult = valueAuto*4;
        if (valueAuto > 2300&&valueAuto <=3000) costAutoResult = valueAuto*4;
        if (valueAuto > 3000) costAutoResult = valueAuto*5.8;
        return costAutoResult;
    }
    public static double Jur2_diz(double costAuto,double valueAuto, double costAutoResult){

        if (valueAuto <= 1000)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 1.2)
                costAutoResult = valueAuto * 1.2;
        }
        if (valueAuto > 1000 && valueAuto <=1500)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 1.45)
                costAutoResult = valueAuto * 1.45;
        }
        if (valueAuto > 1500 && valueAuto <=1800)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 1.5)
                costAutoResult = valueAuto * 1.5;
        }
        if (valueAuto > 1800 && valueAuto <=2300)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 2.15)
                costAutoResult = valueAuto * 2.15;
        }
        if (valueAuto > 2300 && valueAuto <=3000)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 2.15)
                costAutoResult = valueAuto * 2.15;
        }
        if (valueAuto > 3000)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 2.8)
                costAutoResult = valueAuto * 2.8;
        }
        return costAutoResult;
    }
    public static double Jur1_diz(double costAuto,double valueAuto, double costAutoResult){

        if (valueAuto <= 1000)
        {
            costAutoResult = costAuto * 0.3;
            if (costAutoResult < valueAuto * 1.2)
                costAutoResult = valueAuto * 1.2;
        }
        if (valueAuto > 1000 && valueAuto <=1500)
        {
            costAutoResult = costAuto * 0.3;
            if (costAutoResult < valueAuto * 1.45)
                costAutoResult = valueAuto * 1.45;
        }
        if (valueAuto > 1500 && valueAuto <=1800)
        {
            costAutoResult = costAuto * 0.3;
            if (costAutoResult < valueAuto * 1.5)
                costAutoResult = valueAuto * 1.5;
        }
        if (valueAuto > 1800 && valueAuto <=2300)
        {
            costAutoResult = costAuto * 0.3;
            if (costAutoResult < valueAuto * 2.15)
                costAutoResult = valueAuto * 2.15;
        }
        if (valueAuto > 2300 && valueAuto <=3000)
        {
            costAutoResult = costAuto * 0.3;
            if (costAutoResult < valueAuto * 2.15)
                costAutoResult = valueAuto * 2.15;
        }
        if (valueAuto > 3000)
        {
            costAutoResult = costAuto * 0.3;
            if (costAutoResult < valueAuto * 2.8)
                costAutoResult = valueAuto * 2.8;
        }
        return costAutoResult;
    }

    public static double Jur3_benz(double valueAuto, double costAutoResult){

        if (valueAuto <= 1500) costAutoResult = valueAuto * 2.7;
        if (valueAuto > 1500 && valueAuto <= 2500) costAutoResult = valueAuto * 4;
        if (valueAuto > 2500) costAutoResult = valueAuto * 5.8;
        return costAutoResult;
    }
    public static double Jur2_benz(double costAuto,double valueAuto, double costAutoResult){

        if (valueAuto <= 1500)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 1.45)
                costAutoResult = valueAuto * 1.45;
        }
        if (valueAuto > 1500 && valueAuto <=2500)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 2.15)
                costAutoResult = valueAuto * 2.15;
        }
        if (valueAuto > 2500)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 2.8)
                costAutoResult = valueAuto * 2.8;
        }
        return costAutoResult;
    }
    public static double Jur1_benz(double costAuto,double valueAuto, double costAutoResult){

        if (valueAuto <= 1500)
        {
            costAutoResult = costAuto * 0.3;
            if (costAutoResult < valueAuto * 1.45)
                costAutoResult = valueAuto * 1.45;
        }
        if (valueAuto > 1500 && valueAuto <=2500)
        {
            costAutoResult = costAuto * 0.3;
            if (costAutoResult < valueAuto * 1.9)
                costAutoResult = valueAuto * 1.9;
        }
        if (valueAuto > 2500)
        {
            costAutoResult = costAuto * 0.3;
            if (costAutoResult < valueAuto * 2.8)
                costAutoResult = valueAuto * 2.8;
        }
        return costAutoResult;
    }

    public static double Fiz3(double valueAuto, double costAutoResult){

        if (valueAuto < 1000) costAutoResult = valueAuto*3;
        if (valueAuto > 1000&&valueAuto <1500) costAutoResult = valueAuto*3.2;
        if (valueAuto > 1500&&valueAuto <1800) costAutoResult = valueAuto*3.5;
        if (valueAuto > 1800&&valueAuto <2300) costAutoResult = valueAuto*4.8;
        if (valueAuto > 2300&&valueAuto <3000) costAutoResult = valueAuto*5;
        if (valueAuto > 3000) costAutoResult = valueAuto*5.7;
        return costAutoResult;
    }
    public static double Fiz2(double valueAuto, double costAutoResult){

        if (valueAuto < 1000) costAutoResult = valueAuto*1.5;
        if (valueAuto > 1000&&valueAuto <1500) costAutoResult = valueAuto*1.7;
        if (valueAuto > 1500&&valueAuto <1800) costAutoResult = valueAuto*2.5;
        if (valueAuto > 1800&&valueAuto <2300) costAutoResult = valueAuto*2.7;
        if (valueAuto > 2300&&valueAuto <3000) costAutoResult = valueAuto*3;
        if (valueAuto > 3000) costAutoResult = valueAuto*3.6;
        return costAutoResult;
    }
    public static double Fiz1(double costAuto,double valueAuto, double costAutoResult){

        if (costAuto < 8500)
        {
            costAutoResult = costAuto*0.54;
            if (costAutoResult < valueAuto*2.5)
                costAutoResult = valueAuto*2.5;
        }
        if (costAuto > 8500&&costAuto <16700)
        {
            costAutoResult = costAuto*0.48;
            if (costAutoResult < valueAuto*3.5)
                costAutoResult = valueAuto*3.5;
        }
        if (costAuto > 16700&&costAuto <42300)
        {
            costAutoResult = costAuto*0.48;
            if (costAutoResult < valueAuto*5.5)
                costAutoResult = valueAuto*5.5;
        }
        if (costAuto > 42300&&costAuto <84600)
        {
            costAutoResult = costAuto*0.48;
            if (costAutoResult < valueAuto*7.5)
                costAutoResult = valueAuto*7.5;
        }
        if (costAuto > 84600&&costAuto <165000)
        {
            costAutoResult = costAuto*0.48;
            if (costAutoResult < valueAuto*15)
                costAutoResult = valueAuto*15;
        }
        if (costAuto > 165000)
        {
            costAutoResult = costAuto*0.48;
            if (costAutoResult < valueAuto*20)
                costAutoResult = valueAuto*20;
        }
        return costAutoResult;
    }

    public static void lineSet(Rectangle line){

        FadeTransition ft = new FadeTransition(Duration.millis(200), line);
        ft.setToValue(1.0);
        ft.setAutoReverse(true);
        ft.play();

    }
    public static void lineDrop(Rectangle line){
        FadeTransition ft = new FadeTransition(Duration.millis(200), line);
        ft.setToValue(0.0);
        ft.setAutoReverse(true);
        ft.play();
    }

    public static boolean checkString(String string){
        try
        {
            Integer.parseInt(string);
        }
        catch (Exception e)
        {
            return false;
        }
        return true;
    }

}
