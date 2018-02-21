package ecuacion;

import java.util.ArrayList;



public class EcuacionCuadratica {
    double a;
    double b;
    double c;

    public EcuacionCuadratica(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public ArrayList<Complejo> resuelveCuadratico(){
        ArrayList<Complejo> resultados = new ArrayList<Complejo>();



        double raiz = b*b-4*a*c;
        double calculo;
        if(raiz >= 0){
            calculo = ((-b)+Math.sqrt(raiz))/(2*a);
            if(calculo == -0) calculo = 0;
            resultados.add(new Complejo(calculo));
            calculo = ((-b)-Math.sqrt(raiz))/(2*a);
            if(calculo == -0) calculo = 0;
            resultados.add(new Complejo(calculo));
        }
        else{
            raiz = -raiz;
            calculo = (-b)/(2*a);
            if(calculo == -0) calculo = 0;
            resultados.add(new Complejo(calculo,+Math.sqrt(raiz)/(2*a)));
            resultados.add(new Complejo(calculo,-Math.sqrt(raiz)/(2*a)));
        }


        return resultados;
    }
}
