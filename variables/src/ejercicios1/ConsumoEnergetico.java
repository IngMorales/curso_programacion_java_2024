package ejercicios1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsumoEnergetico {
    /*Enunciado: En una casa se consumen tres electrodomésticos: una nevera, 
    un televisor y una lavadora. La nevera consume 200 W/hora, 
    el televisor 150 W/hora y la lavadora 500 W/hora. 
    Cada electrodoméstico se utiliza un número determinado de horas al día. 
    Calcula cuánta energía total consumen en un mes, considerando 
    un mes de 30 días, y el costo total si el costo de la electricidad es 
    de $600 por kWh.*/
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        double horasNevera, horasTelevisor, horasLavadora, consumoNevera, 
                consumoTelevisor, consumoLavadora, consumoTotalNevera, consumoTotalTelevisor,
                consumoTotalLavadora, consumoTotalMes, costoKWh, costoTotal;
        
        System.out.println("Ingresa horas de uso de la Nevera: ");
        horasNevera = Double.parseDouble(buffer.readLine());
        
        System.out.println("Ingresa horas de uso del televisor: ");
        horasTelevisor = Double.parseDouble(buffer.readLine());
        
        System.out.println("Ingresa horas de uso de la Lavadora: ");
        horasLavadora = Double.parseDouble(buffer.readLine());
        
        consumoNevera = 200; // W/h
        consumoTelevisor = 150; // W/h
        consumoLavadora = 500; // W/h
        
        consumoTotalNevera = (consumoNevera*horasNevera*30)/1000;
        consumoTotalTelevisor = (consumoTelevisor*horasTelevisor*30)/1000;
        consumoTotalLavadora = (consumoLavadora*horasLavadora*30)/1000;
        
        consumoTotalMes = consumoTotalNevera+consumoTotalTelevisor+consumoTotalLavadora;
        
        System.out.println("Ingresa el costo del kWh: ");
        costoKWh = Double.parseDouble(buffer.readLine());
        
        costoTotal = consumoTotalMes*costoKWh;
        
        System.out.println("Consumo total en kWh en un mes: "+consumoTotalMes+" kWh");
        System.out.println("Costo total de la electricidad en el mes: $ "+costoTotal);
        
        
    }
    
}
