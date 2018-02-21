package ecuacion;

public class EcuacionLineal {
    double a;
    double b;

    public EcuacionLineal(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double resuelveLineal(){
        double calculo = (-b)/a;
        if (calculo == -0) calculo = 0;
        return calculo;
    }
}
