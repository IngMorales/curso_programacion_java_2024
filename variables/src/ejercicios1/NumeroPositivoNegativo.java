package ejercicios1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumeroPositivoNegativo { 
    /*
    Enunciado: Crea un programa en Java que pida al usuario un número 
    y determine si el número es positivo, negativo o cero, utilizando 
    condicionales if, else if y else.
    */
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int numero;
        
        System.out.println("Ingresa un numero: ");
        numero = Integer.parseInt(buffer.readLine());
        
        if (numero > 0) {
            System.out.println("El numero es positivo");
        }else if(numero < 0){
            System.out.println("El numero es negativo");
        }else{
            System.out.println("El numero es cero");
        }
        
    }
}