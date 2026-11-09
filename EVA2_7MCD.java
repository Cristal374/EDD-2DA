package edd_eva2;

public class EVA2_7MCD {

    public static void main(String[] args) {
        int divisor = 150;
        int dividendo = 5;
        int resu = mcd(dividendo, divisor);
        float division;

        division = (float) dividendo / divisor;

        System.out.println("El mcd es de: " + resu);
    }

    public static int mcd(int dividendo, int divisor) {
        if (divisor == 0) {
            return dividendo;
        }

        int residuo = dividendo % divisor;
        return mcd(divisor, residuo);
    }

    // llamada recursiva se usa el divisor hasta que llegue a 0
}
