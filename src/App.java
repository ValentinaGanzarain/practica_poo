package src;
import src.ar.com.ada.opp.instantiation.Person;
import src.ar.com.ada.opp.overloading.Arithmetric;
import src.pasov.ArithmeticUno;
import src.pasov.Result;


public class App {
    public static void main(String[] args) {

        /*Person persona1 = new Person();
        System.out.println("La persona se llama " + persona1.getName() + " " + persona1.getLastName());

        Person persona2 = new Person("Caro");
        System.out.println("La persona se llama " + persona2.getName() + " " + persona2.getLastName());

        Person persona3 = new Person("Sol", "Garcia");
        System.out.println("La persona se llama " + persona3.getName() + " " + persona3.getLastName());


        Arithmetric sumas = new Arithmetric();

        sumas.sum(1,2);
        sumas.sum(2.2,4.5);

        Integer numI = 3;
        Double numD = 4.5;

        sumas.sum(numI,5);
        sumas.sum(numD,7.5);

        System.out.println("El resultado int+int es: " + " " + sumas.sum(1,2));
        System.out.println("El resultado double+double es: " + " " + sumas.sum(2.2,4.5));
        System.out.println("El resultado Integer+Integer es: " + " " +  sumas.sum(numI,5));
        System.out.println("El resultado Double+Double es: " + " " +  sumas.sum(numD,7.5));*/


        Result resultados = new Result();
        ArithmeticUno cuentas = new ArithmeticUno();

        double num1 = 27.5;
        double num2 = 22.4;

        cuentas.sum(resultados, num1, num2);
        System.out.println("Suma= " + resultados.getResultSum());

        cuentas.subtraction(resultados, num1, num2);
        System.out.println("Resta= " + resultados.getResultSubtraction());

        cuentas.multiplication(resultados, num1, num2);
        System.out.println("Multiplicacion= " + resultados.getMultiplication());

        cuentas.division(resultados, num1, num2);
        System.out.println("Division= " + resultados.getDivision());


    }
}