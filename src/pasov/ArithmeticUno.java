package src.pasov;

public class ArithmeticUno {

    public void sum(Result x, double a, double b){
        double suma = a+b;
        x.setResultSum(suma);
    }
    public void subtraction(Result x, double a, double b){
        x.setResultSubtraction(a-b);
    }
    public void multiplication(Result x, double a, double b){
        x.setMultiplication(a*b);
    }
    public void division(Result x, double a, double b){
        x.setDivision(a/b);
    }

}
