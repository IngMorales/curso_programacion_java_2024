package variables;
public class conceptos_variables {
    public static void main(String[] args) {
        
        //Datos Primitivos
        int edad = 30;
        float peso = 85.5f;
        double temperatura = 36.7;
        char vocalA = 'A';
        boolean esMayor = true;
        boolean esMenor = false;
        byte cantidadBaldes = 125;
        short salario = 32767;
        long poblacion = 780000000000000L;
        
        //NO Primitivos
        String nombre = "Ing. Aldair";
        int[] edades = {30, 45, 50, 23, 15, 18};
        String[] nombres = {"Aldair", "Dayana", "Anthonella", "Pepito", "Ana", "Manual"};
        
        System.out.println(nombres[1]+" tiene una edad de: "+edades[4]+" años");
        
    }
    
}
