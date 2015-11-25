package sample;

import javafx.animation.FadeTransition;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

/**
 * Created by Влад on 30.09.2015.
 */
public class checkingErrors {

    public static boolean lineSet(Rectangle line){
        FadeTransition ft = new FadeTransition(Duration.millis(200), line);
        ft.setToValue(1.0);
        ft.setAutoReverse(true);
        ft.play();
        return false;
    }
    public static boolean lineDrop(Rectangle line){
        FadeTransition ft = new FadeTransition(Duration.millis(200), line);
        ft.setToValue(0.0);
        ft.setAutoReverse(true);
        ft.play();
        return true;
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
