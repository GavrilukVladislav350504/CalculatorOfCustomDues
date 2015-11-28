package logicTesting;

import org.junit.Test;
import sample.logicalPack.logicJurDiz_0to3;
import sample.logicalPack.logicJurDiz_3to5;
import sample.logicalPack.logicJurDiz_5to9;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Влад on 13.11.2015.
 */

/**
 * This class is created fot testing calculated part of logic for juridical users and diesel fuel.
 * This tests showed in :
 *      class "logicJurDiz_0to3" ===> method "logicJurDiz_0to3_Test"
 *      class "logicJurDiz_3to5" ===> method "logicJurDiz_3to5_Test"
 *      class "logicJurDiz_5to9" ===> method "logicJurDiz_5to9_Test"
 *
 *      Information for assertEquals from http://auto.tut.by/custom_dues
*/
public class logicTest_JurDiz {
    @Test(timeout = 1000)
    public void logicJurDiz_0to3_Test(){
        logicJurDiz_0to3 jur_0to3 = new logicJurDiz_0to3();
        Long L;
        int i;
        double result1=jur_0to3.logic(500, 500);
        double result2=jur_0to3.logic(3214, 5435);
        double result3=jur_0to3.logic(4325,7547);
        double result4=jur_0to3.logic(764,9533);

        L = Math.round(result1);
        i = L.intValue();
        assertEquals(i,725);

        L = Math.round(result2);
        i = L.intValue();
        assertEquals(i,15218);

        L = Math.round(result3);
        i = L.intValue();
        assertEquals(i,21132);

        L = Math.round(result4);
        i = L.intValue();
        assertEquals(i,26692);
    }

    @Test(timeout = 1000)
    public void logicJurDiz_3to5_Test(){
        logicJurDiz_3to5 jur_3to5 = new logicJurDiz_3to5();
        Long L;
        int i;
        double result1=jur_3to5.logic(500, 500);
        double result2=jur_3to5.logic(3214, 5435);
        double result3=jur_3to5.logic(4325,7547);
        double result4=jur_3to5.logic(764,9533);

        L = Math.round(result1);
        i = L.intValue();
        assertEquals(i,725);

        L = Math.round(result2);
        i = L.intValue();
        assertEquals(i,15218);

        L = Math.round(result3);
        i = L.intValue();
        assertEquals(i,21132);

        L = Math.round(result4);
        i = L.intValue();
        assertEquals(i,26692);
    }

    @Test(timeout = 1000)
    public void logicJurDiz_5to9_Test(){
        logicJurDiz_5to9 jur_5to9 = new logicJurDiz_5to9();
        Long L;
        int i;
        double result1=jur_5to9.logic(500, 500);
        double result2=jur_5to9.logic(3214, 5435);
        double result3=jur_5to9.logic(4325,7547);
        double result4=jur_5to9.logic(764,9533);

        L = Math.round(result1);
        i = L.intValue();
        assertEquals(i,1350);

        L = Math.round(result2);
        i = L.intValue();
        assertEquals(i,31523);

        L = Math.round(result3);
        i = L.intValue();
        assertEquals(i,43773);

        L = Math.round(result4);
        i = L.intValue();
        assertEquals(i,55291);
    }
}
