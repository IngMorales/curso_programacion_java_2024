package ejercicios1;
public class CompraConDescuento {
    /*
    Enunciado: Imagina que estás comprando tres productos en una tienda. 
    El precio del primer producto es de $45,000, el segundo de $32,500 y el tercero de $12,750. 
    Tienes un descuento del 10% en el total de la compra. Calcula el costo total de la compra, 
    el descuento aplicado y el precio final a pagar.
    */
    public static void main(String[] args) {
        double producto1 = 45000;
        double producto2 = 32500;
        double producto3 = 12750;
        
        double totalCompra = producto1+producto2+producto3;
        double descuento = totalCompra*0.10;
        double totalConDescuento = totalCompra-descuento;
        
        System.out.println("Costo total de la compra: $"+totalCompra);
        System.out.println("Descuento aplicado: $"+descuento);
        System.out.println("Precio final a pagar: $"+totalConDescuento);
        
    }
    
}
