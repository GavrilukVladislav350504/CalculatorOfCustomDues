package sample.logicalPack;

/**
 * Created by Влад on 29.10.2015.
 */
public class logicFiz_3to5 implements logicAbstaract {
    @Override
    public double logic(double costAuto, double valueAuto) {
        double costAutoResult = 0;
        if (valueAuto <= 1000) costAutoResult = valueAuto*1.5;
        if (valueAuto > 1000&&valueAuto <=1500) costAutoResult = valueAuto*1.7;
        if (valueAuto > 1500&&valueAuto <=1800) costAutoResult = valueAuto*2.5;
        if (valueAuto > 1800&&valueAuto <=2300) costAutoResult = valueAuto*2.7;
        if (valueAuto > 2300&&valueAuto <=3000) costAutoResult = valueAuto*3;
        if (valueAuto > 3000) costAutoResult = valueAuto*3.6;
        return costAutoResult;
    }
}
