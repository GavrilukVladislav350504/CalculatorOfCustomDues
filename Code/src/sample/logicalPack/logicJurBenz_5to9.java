package sample.logicalPack;

/**
 * Created by ���� on 31.10.2015.
 */
public class logicJurBenz_5to9 extends logicAbstaract {
    @Override
    public double logic(double a, double valueAuto, double costAutoResult) {
        if (valueAuto <= 1500) costAutoResult = valueAuto * 2.7;
        if (valueAuto > 1500 && valueAuto <= 2500) costAutoResult = valueAuto * 4;
        if (valueAuto > 2500) costAutoResult = valueAuto * 5.8;
        return costAutoResult;
    }
}
