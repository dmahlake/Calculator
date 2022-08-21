package com.dipuo.mahlake.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public int additionalOperator(int firstNumber, int secondNumber)
    {
        return firstNumber + secondNumber;
    }

    public  int subtractionOperator(int firstNumber, int secondNumber)
    {
        return firstNumber - secondNumber;
    }

    public String multiplicationOperator(int firstNumber, int secondNumber)
    {

        try{
            if (firstNumber == 0 || secondNumber == 0)
            {
                throw new ArithmeticException("Any number multiplied by zero equal zero please check you number");
            }
            return "Results = "+ (firstNumber * secondNumber);
        }catch (ArithmeticException ex)
        {
            return "Any number multiplied by zero equal zero please check you number";
        }
    }

    public String divisionOperator(int firstNumber, int secondNumber)
    {
        try{
           return "Results = "+ (firstNumber / secondNumber);
        }
        catch (ArithmeticException ex)
        {
            return "Dividing a number by zero is not possible";
        }
}


}
