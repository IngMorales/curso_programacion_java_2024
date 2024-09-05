package ejercicios1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        double numero, resultado;
        int potencia;
        
        System.out.println("Digite el número: ");
        numero = Double.parseDouble(reader.readLine());
        
        System.out.println("Digite la potencia: ");
        potencia = Integer.parseInt(reader.readLine());
        
        resultado = Math.pow(numero, potencia);
        
        System.out.println("El resultado de "
                +numero+" elevado a la "+potencia+" es: "+resultado);
        
    }
    
}
