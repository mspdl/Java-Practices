package certification_10;

import static java.lang.Math.*;
import static java.lang.System.out;

public class Matematica {
    
    static double raiz = 81;
    
    static void calculaRaiz(){
        out.println("Raiz quadrada de " + raiz + " é " + sqrt(raiz));
    }
    
    static void exibeValorDePi(){
        out.println(PI);
    }
    
    public static void main(String[] args) {
        calculaRaiz();
        exibeValorDePi();
    }
    
}
