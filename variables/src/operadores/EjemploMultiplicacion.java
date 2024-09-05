package operadores;
public class EjemploMultiplicacion {
    public static void main(String[] args) {
        double salarioPorHora = 15000;
        int horasTrabajadas = 160;
        int horasExtras = 25;
        
        double salarioNormal = salarioPorHora*horasTrabajadas;
        double salarioHorasExtras = (salarioPorHora*2)*horasExtras;
        
        double salarioTotal = salarioNormal+salarioHorasExtras;
        
        System.out.println("El salario mensual total es: $ "+salarioTotal);
        System.out.println("Salario Normal: $ "+salarioNormal);
        System.out.println("Salario Horas Extras: $ "+salarioHorasExtras);
    }
    
}
