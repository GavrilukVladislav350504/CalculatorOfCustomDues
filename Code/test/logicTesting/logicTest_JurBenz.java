package logicTesting;

import org.junit.Test;
import sample.logicalPack.logicJurBenz_0to3;
import sample.logicalPack.logicJurBenz_3to5;
import sample.logicalPack.logicJurBenz_5to9;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Влад on 13.11.2015.
 */

/**
 * This class is created fot testing calculated part of logic for juridical users and benzine fuel.
 * This tests showed in :
 *      class "logicJurBenz_0to3" ===> method "logicJurBenz_0to3_Test"
 *      class "logicJurBenz_3to5" ===> method "logicJurBenz_3to5_Test"
 *      class "logicJurBenz_5to9" ===> method "logicJurBenz_5to9_Test"
 *
 *      Information for assertEquals from http://auto.tut.by/custom_dues
 */
public class logicTest_JurBenz {
    @Test
    public void logicJurBenz_0to3_Test(){
        logicJurBenz_0to3 jur_0to3 = new logicJurBenz_0to3();
        Long L;
        int i;
        double result1=jur_0to3.logic(500, 500);
        double result2=jur_0to3.logic(3214, 5435);
        double result3=jur_0to3.logic(4325,7547);
        double result4=jur_0to3.logic(764,9533);

        L = Math.round(result1);
        i = L.intValue();
        assertEquals(i,600);

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

    @Test
    public void logicJurBenz_3to5_Test(){
        logicJurBenz_3to5 jur_3to5 = new logicJurBenz_3to5();
        Long L;
        int i;
        double result1=jur_3to5.logic(500, 500);
        double result2=jur_3to5.logic(3214, 5435);
        double result3=jur_3to5.logic(4325,7547);
        double result4=jur_3to5.logic(764,9533);

        L = Math.round(result1);
        i = L.intValue();
        assertEquals(i,600);

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

    @Test
    public void logicJurBenz_5to9_Test(){
        logicJurBenz_5to9 jur_5to9 = new logicJurBenz_5to9();
        Long L;
        int i;
        double result1=jur_5to9.logic(500, 500);
        double result2=jur_5to9.logic(3214, 5435);
        double result3=jur_5to9.logic(4325,7547);
        double result4=jur_5to9.logic(764,9533);

        L = Math.round(result1);
        i = L.intValue();
        assertEquals(i,1250);

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
