package sample;


public class SimplyCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public double getFirstNumber(){
        return this.firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

    public double getAdditionResult(){
        double sumA = firstNumber + secondNumber;
        return sumA;
    }

    public double getSubtractionResult(){
        double sumS = firstNumber - secondNumber;
        return sumS;
    }

    public double getMultiplicationResult(){
        double sumM = firstNumber * secondNumber;
        return sumM;
    }

    public double getDivisionResult(){
        double sumD = 0;
        if (secondNumber != 0) {
            sumD = firstNumber / secondNumber;
        }

        return sumD;
    }
}
