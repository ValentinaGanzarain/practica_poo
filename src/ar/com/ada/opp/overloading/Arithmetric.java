package src.ar.com.ada.opp.overloading;

import src.pasov.Result;

public class Arithmetric {

    public int sum(int num1, int num2) {
        return num1+num2;
    }

    public int sum (Integer num1, int num2){
        return num1 + num2;
    }

    public int sum (int num1, Integer num2){
        return num1 + num2;
    }

    public int sum (Integer num1, Integer num2){
        return num1 + num2;
    }

    public double sum (double num1, double num2){
        return num1+num2;
    }

    public double sum (Double num1, double num2){
        return num1+num2;
    }

    public double sum (double num1, Double num2){
        return num1+num2;
    }

    public double sum(Result resultados, Double num1, Double num2){
        return num1+num2;
    }

}
