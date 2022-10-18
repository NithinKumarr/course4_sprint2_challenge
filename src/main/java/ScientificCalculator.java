public class ScientificCalculator
{
    double ceilValue(float num) throws CalculatorException
    {
        if(num>0)
        {
            return Math.ceil(num);
        }
        else
        {
            CalculatorException obj = new  CalculatorException("to calculate ceil value we should take a positive number");
            throw obj;
        }
    }
    double floorValue(float num) throws CalculatorException
    {
        if (num > 0)
        {
            return Math.floor(num);
        }
        else
        {
            CalculatorException obj = new CalculatorException("to calculate floor value we should take a positive number");
            throw obj;
        }
    }
    public long power(int num1,int num2) throws CalculatorException
    {
        if(num1<num2)
        {
            CalculatorException obj = new CalculatorException("num1 should be greater than num2 to do power");
            throw obj;

        }
        else
        {
            return (long)Math.pow(num1,num2);
        }
    }
    public double squareRoot(int num) throws CalculatorException
    {
        if(num<=0)
        {
            CalculatorException obj = new CalculatorException("for taking square root num1 shouldn't be less than or equal to zero");
            throw obj;
        }
        else
        {
            return Math.sqrt(num);
        }
    }

    public static void main(String[] args)
    {
        ScientificCalculator obj = new ScientificCalculator();
        try
        {
            System.out.println(obj.ceilValue(-5.3f));
        }
        catch (CalculatorException e)
        {
            // throw new RuntimeException(e);
            System.out.println(e);
        }
        try
        {
            System.out.println(obj.floorValue(-5.3f));
        }
        catch(CalculatorException e)
        {
            // throw new RuntimeException(e);
            System.out.println(e);
        }
        try
        {
            System.out.println(obj.power(2,5));
        }
        catch(CalculatorException e)
        {
            //throw new RuntimeException(e);
            System.out.println(e);
        }
        try
        {
            System.out.println(obj.squareRoot(-5));
        }
        catch(CalculatorException e)
        {
            //throw new RuntimeException(e);
            System.out.println(e);
        }
    }
}