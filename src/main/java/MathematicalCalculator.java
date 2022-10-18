public class MathematicalCalculator
{
    float Add(float a,float b)
    {
        float c = a+b;
        return c;
    }
    float Sub(float a,float b)
    {
        float c = a+b;
        return c;
    }
    float Mul(float a,float b)
    {
        float c = a+b;
        return c;
    }
    int Div(int a,int b) throws CalculatorException
    {

        if (b == 0)
        {
            throw new CalculatorException("value of denominator should be greater than zero");
        }
        else
        {
            return a/b;
        }
    }

    public static void main(String[] args)
    {
        MathematicalCalculator obj = new MathematicalCalculator();
        int c = 20,d =0;
        try
        {
            // if(d!=0)
            {
                System.out.println(obj.Div(c, d));
            }
           /* else
            {
                throw  new CalculatorException("value of denominator should be greater than zero");
            }*/
        }
        catch(CalculatorException e)
        {
            System.out.println(e);
        }

    }
}