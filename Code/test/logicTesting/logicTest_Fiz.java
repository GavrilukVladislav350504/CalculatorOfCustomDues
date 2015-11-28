package logicTesting;

import org.junit.Test;
import sample.logicalPack.*;
import static  junit.framework.Assert.*;

/**
 * Created by Влад on 07.11.2015.
 */

/**
 * This class is created fot testing calculated part of logic for physical users.
 * This tests showed in :
 *      class "logicFiz_0to3" ===> method "logicFiz_0to3_Test"
 *      class "logicFiz_3to5" ===> method "logicFiz_3to5_Test"
 *      class "logicFiz_5to9" ===> method "logicFiz_5to9_Test"
 *
 *      Information for assertEquals from http://auto.tut.by/custom_dues
 */
public class logicTest_Fiz {

    @Test(timeout = 1000)
    public void logicFiz_0to3_Test(){
        logicFiz_0to3 fiz_0to3 = new logicFiz_0to3();
        Long L;
        int i;
        double result1=fiz_0to3.logic(500, 500);
        double result2=fiz_0to3.logic(3214, 5435);
        double result3=fiz_0to3.logic(4325,7547);
        double result4=fiz_0to3.logic(764,9533);

        L = Math.round(result1);
        i = Integer.valueOf(L.intValue());
        assertEquals(i,1250);

        L = Math.round(result2);
        i = Integer.valueOf(L.intValue());
        assertEquals(i,13588);

        L = Math.round(result3);
        i = Integer.valueOf(L.intValue());
        assertEquals(i,18868);

        L = Math.round(result4);
        i = Integer.valueOf(L.intValue());
        assertEquals(i,23833);
    }

    @Test(timeout = 1000)
    public void logicFiz_3to5_Test(){
        logicFiz_3to5 fiz_3to5 = new logicFiz_3to5();
        Long L;
        int i;
        double result1=fiz_3to5.logic(500, 500);
        double result2=fiz_3to5.logic(3214, 5435);
        double result3=fiz_3to5.logic(4325,7547);
        double result4=fiz_3to5.logic(764,9533);

        L = Math.round(result1);
        i = Integer.valueOf(L.intValue());
        assertEquals(i,750);

        L = Math.round(result2);
        i = Integer.valueOf(L.intValue());
        assertEquals(i,19566);

        L = Math.round(result3);
        i = Integer.valueOf(L.intValue());
        assertEquals(i,27169);

        L = Math.round(result4);
        i = Integer.valueOf(L.intValue());
        assertEquals(i,34319);
    }

    @Test(timeout = 1000)
    public void logicFiz_5to9_Test(){
        logicFiz_5to9 fiz_5to9 = new logicFiz_5to9();
        Long L;
        int i;
        double result1=fiz_5to9.logic(500, 500);
        double result2=fiz_5to9.logic(3214, 5435);
        double result3=fiz_5to9.logic(4325,7547);
        double result4=fiz_5to9.logic(764,9533);

        L = Math.round(result1);
        i = Integer.valueOf(L.intValue());
        assertEquals(i,1500);

        L = Math.round(result2);
        i = Integer.valueOf(L.intValue());
        assertEquals(i,30980);

        L = Math.round(result3);
        i = Integer.valueOf(L.intValue());
        assertEquals(i,43018);

        L = Math.round(result4);
        i = Integer.valueOf(L.intValue());
        assertEquals(i,54338);
    }
}
