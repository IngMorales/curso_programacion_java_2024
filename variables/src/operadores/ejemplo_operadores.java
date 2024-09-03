package operadores;
public class ejemplo_operadores {
    public static void main(String[] args) {
        String estudiante1 = "Aldair";
        String estudiante2 = "Dayana";
        
        int edad_estudiante1 = 18;
        int edad_estudiante2 = 20;
        
        double nota1_estudiante1 = 4.2;
        double nota2_estudiante1 = 4.0;
        
        double nota1_estudiante2 = 4.5;
        double nota2_estudiante2 = 3.8;
        
        int suma_edad = edad_estudiante1+edad_estudiante2;
        int resta_edad = edad_estudiante1-edad_estudiante2;
        
        System.out.println("La suma de edad es: "+suma_edad);
        System.out.println("La resta de edad es: "+resta_edad);
        
        double prom_estudiante1 = (nota1_estudiante1+nota2_estudiante1)/2;
        
        System.out.println("El promedio de nota de: "+estudiante1+" es = "+prom_estudiante1);
        
        double mult_notas = nota1_estudiante1*nota2_estudiante1;
        
        System.out.println("La multiplicacion es: "+mult_notas);
        
        
        
    }
    
}
