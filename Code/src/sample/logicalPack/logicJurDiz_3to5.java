package sample.logicalPack;

/**
 * Created by Влад on 31.10.2015.
 */
public class logicJurDiz_3to5 implements logicAbstaract{

    @Override
    public double logic(double costAuto, double valueAuto) {
        double costAutoResult=0;
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
}
