package sample.logicalPack;

/**
 * Created by Влад on 31.10.2015.
 */
public class logicJurDiz_5to9 implements logicAbstaract {
    @Override
    public double logic(double a, double valueAuto) {
        double costAutoResult=0;
        if (valueAuto <= 1500) costAutoResult = valueAuto * 2.7;
        if (valueAuto > 1500 && valueAuto <= 2500) costAutoResult = valueAuto * 4;
        if (valueAuto > 2500) costAutoResult = valueAuto * 5.8;
        return costAutoResult;
    }
}

