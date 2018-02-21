package ecuacion;

public class Complejo {
    double real;
    double imaginario;

    public Complejo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }

    public Complejo(double real){
        this.real = real;
        this.imaginario = 0;
    }

    public double getReal(){
        return real;
    }

    public double getImaginario() {
        return imaginario;
    }
}
