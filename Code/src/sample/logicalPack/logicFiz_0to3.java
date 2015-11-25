package sample.logicalPack;

/**
 * Created by Влад on 29.10.2015.
 */
public class logicFiz_0to3 implements logicAbstaract {
    @Override
    public double logic(double costAuto, double valueAuto) {
        double costAutoResult = 0;
        if (costAuto <= 8500)
        {
            costAutoResult = costAuto*0.54;
            if (costAutoResult < valueAuto*2.5)
                costAutoResult = valueAuto*2.5;
        }
        if (costAuto > 8500&&costAuto <=16700)
        {
            costAutoResult = costAuto*0.48;
            if (costAutoResult < valueAuto*3.5)
                costAutoResult = valueAuto*3.5;
        }
        if (costAuto > 16700&&costAuto <=42300)
        {
            costAutoResult = costAuto*0.48;
            if (costAutoResult < valueAuto*5.5)
                costAutoResult = valueAuto*5.5;
        }
        if (costAuto > 42300&&costAuto <=84600)
        {
            costAutoResult = costAuto*0.48;
            if (costAutoResult < valueAuto*7.5)
                costAutoResult = valueAuto*7.5;
        }
        if (costAuto > 84600&&costAuto <=165000)
        {
            costAutoResult = costAuto*0.48;
            if (costAutoResult < valueAuto*15)
                costAutoResult = valueAuto*15;
        }
        if (costAuto > 165000)
        {
            costAutoResult = costAuto*0.48;
            if (costAutoResult < valueAuto*20)
                costAutoResult = valueAuto*20;
        }
        return costAutoResult;
    }

}
