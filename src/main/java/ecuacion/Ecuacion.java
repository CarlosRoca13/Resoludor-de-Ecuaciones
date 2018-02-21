package ecuacion;

import java.util.ArrayList;
import java.util.Scanner;

public class Ecuacion {
    public static void main(String [] args){
        boolean continua = true;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Cálculo de ecuaciones lineales y cuadráticas");
        System.out.println("      Estructura: ax^2 + bx + c = 0");
        System.out.println();
        while(continua){
            System.out.print("Introduce valor \"a\"(0 si es lineal): ");
            double a = Double.parseDouble(entrada.next());

            System.out.print("Introduce valor \"b\": ");
            double b = Double.parseDouble(entrada.next());

            System.out.print("Introduce valor \"c\": ");
            double c = Double.parseDouble(entrada.next());

            Ecuacion ec = new Ecuacion();
            ec.mostrarEcuacion(a,b,c);

            System.out.print("Pulsa n para terminar o otro para terminar ");
            char resp = entrada.next().charAt(0);
            System.out.println();
            if(resp == 'n' || resp == 'N'){
                continua = false;
            }
        }
        System.out.println("Adios.");

        System.exit(0);
    }

    public void mostrarEcuacion(double a, double b, double c){

        if(a==0){
            double resultado;
            EcuacionLineal ecuacionLineal = new EcuacionLineal( b, c);
            System.out.println("Calculamos la ecuación lineal: ");
            System.out.println("     ("+b+"x) + ("+c+") = 0");
            System.out.println();
            resultado = ecuacionLineal.resuelveLineal();
            System.out.println("     x = "+resultado);
            System.out.println();
        }
        else{
            EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(a, b, c);
            ArrayList<Complejo> resultados = ecuacionCuadratica.resuelveCuadratico();

            System.out.println("Calculamos la ecuación cuadratica: ");
            System.out.println("     ("+a+")x^2 + ("+b+")x + ("+c+") = 0");

            double real1 = resultados.get(0).getReal();
            double real2 = resultados.get(1).getReal();

            double imaginario1 = resultados.get(0).getImaginario();
            double imaginario2 = resultados.get(1).getImaginario();
            if (imaginario1 == 0){
                System.out.println();
                System.out.println("     x1 = " + real2);
                System.out.println("     x2 = " + real2);
                System.out.println();
            }
            else{
                System.out.println();
                System.out.println("     x1 = " + real1 + " + (" + imaginario1 + ")i");
                System.out.println("     x2 = " + real2 + " + (" + imaginario2 + ")i");
                System.out.println();
            }
        }

    }
}
