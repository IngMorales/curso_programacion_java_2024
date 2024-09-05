package ejercicios1;

import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2, suma, resta, multiplicacion, division;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite número 1: ");
        num1 = scanner.nextDouble();
                
        System.out.print("Digite número 2: ");
        num2 = scanner.nextDouble();
        
        suma = num1+num2;
        resta = num1-num2;
        multiplicacion = num1*num2;
        division = num1/num2;
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
    
}
