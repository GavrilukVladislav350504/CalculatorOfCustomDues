package sample.logicalPack;

/**
 * Created by ���� on 31.10.2015.
 */
public class logicJurDiz_0to3 implements   logicAbstaract {

    @Override
    public double logic(double costAuto, double valueAuto) {
        double costAutoResult=0;
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
}
