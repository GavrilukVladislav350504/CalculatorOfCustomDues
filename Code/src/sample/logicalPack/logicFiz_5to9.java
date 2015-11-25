package sample.logicalPack;

/**
 * Created by Влад on 29.10.2015.
 */
public class logicFiz_5to9 implements logicAbstaract {
    @Override
    public double logic(double costAuto, double valueAuto) {
        double costAutoResult=0;
        if (valueAuto <= 1000) costAutoResult = valueAuto*3;
        if (valueAuto > 1000&&valueAuto <=1500) costAutoResult = valueAuto*3.2;
        if (valueAuto > 1500&&valueAuto <=1800) costAutoResult = valueAuto*3.5;
        if (valueAuto > 1800&&valueAuto <=2300) costAutoResult = valueAuto*4.8;
        if (valueAuto > 2300&&valueAuto <=3000) costAutoResult = valueAuto*5;
        if (valueAuto > 3000) costAutoResult = valueAuto*5.7;
        return costAutoResult;
    }
}
