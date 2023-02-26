
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoGarciaArmenterosPedro2223 miVehiculoGarciaArmenterosPedro2223;
        int stockActual;
        
        miVehiculoGarciaArmenterosPedro2223 = new VehiculoGarciaArmenterosPedro2223("Seat",18000,100);
        stockActual = operativaVehiculosGarciaArmenterosPedro2223(miVehiculoGarciaArmenterosPedro2223, 50); 
        System.out.println("El stock actual es"+ stockActual );
    }

    public static int operativaVehiculosGarciaArmenterosPedro2223(VehiculoGarciaArmenterosPedro2223 miVehiculoGarciaArmenterosPedro2223, Integer cantidad) {
        int stockActual;
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoGarciaArmenterosPedro2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoGarciaArmenterosPedro2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
        stockActual = miVehiculoGarciaArmenterosPedro2223.obtenerStock();
        return stockActual;
    }

}
    
