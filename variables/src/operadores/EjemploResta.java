package operadores;
public class EjemploResta {
    public static void main(String[] args) {
        String nombrePersona = "Ing. Aldair";
        
        //Salario
        double salarioPresupuesto = 1500000;
        
        //Gastos
        double arriendo = 300000;
        double comida = 300000;
        double servicios = 120000;
        double otrosGastos = 150000;
        
        double restante = salarioPresupuesto - (arriendo+comida+servicios+otrosGastos);
        
        System.out.println(nombrePersona+" le quedo a final de mes "+restante+" pesos");
    }
    
}
