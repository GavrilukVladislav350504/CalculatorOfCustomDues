package sample.logicalPack;

/**
 * Created by Влад on 31.10.2015.
 */
public class logicJurDiz_3to5 extends logicAbstaract{

    @Override
    public double logic(double costAuto, double valueAuto, double costAutoResult) {
        if (valueAuto <= 1000)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 1.2)
                costAutoResult = valueAuto * 1.2;
        }
        if (valueAuto > 1000 && valueAuto <=1500)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 1.45)
                costAutoResult = valueAuto * 1.45;
        }
        if (valueAuto > 1500 && valueAuto <=1800)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 1.5)
                costAutoResult = valueAuto * 1.5;
        }
        if (valueAuto > 1800 && valueAuto <=2300)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 2.15)
                costAutoResult = valueAuto * 2.15;
        }
        if (valueAuto > 2300 && valueAuto <=3000)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 2.15)
                costAutoResult = valueAuto * 2.15;
        }
        if (valueAuto > 3000)
        {
            costAutoResult = costAuto * 0.35;
            if (costAutoResult < valueAuto * 2.8)
                costAutoResult = valueAuto * 2.8;
        }
        return costAutoResult;
    }
}
