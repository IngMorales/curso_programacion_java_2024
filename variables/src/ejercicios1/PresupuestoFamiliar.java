package ejercicios1;

import java.util.Scanner;

public class PresupuestoFamiliar {
    /*
    Enunciado: Imagina que tienes un presupuesto mensual de $2,000,000 
    y un préstamo de $500,000 que pagas en cuotas de $50,000 mensuales. 
    Además, tu sueldo mensual aumenta en un 5% cada año, y quieres 
    calcular cuánto tendrás después de 1 año. El ejercicio involucra 
    la suma del sueldo mensual, la resta de las cuotas del préstamo, 
    la multiplicación del sueldo anual y la potencia para calcular 
    el aumento del sueldo al final del año.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double presupuestoMensual, cuotaPrestamo, presupuestoAnual, 
                presupuestoNeto, porcentajeAumento, aumentoFinal;
        
        System.out.print("Ingresa tu presupuesto mensual: ");
        presupuestoMensual = scanner.nextDouble();
        
        System.out.print("Ingresa la cuota mensual del prestamo: ");
        cuotaPrestamo = scanner.nextDouble();
        
        presupuestoNeto = presupuestoMensual - cuotaPrestamo;
        presupuestoAnual = presupuestoNeto*12;
        
        System.out.print("ingresa porcentaje de aumento anual de sueldo: ");
        porcentajeAumento = scanner.nextDouble()/100;
        
        aumentoFinal = Math.pow(1+porcentajeAumento, 1)*presupuestoMensual;
        
        System.out.println("Presupuesto mensual neto: $"+presupuestoNeto);
        System.out.println("Presupuesto anual neto: $"+presupuestoAnual);
        System.out.println("Sueldo mensual despues de un año con aumento: $"+aumentoFinal);
        
    }
    
}
