package Ejercicios.Clases;

public class Test {
    public static void main(String[] args) {
        // Ejercicio 1
        
        System.out.println("---Ejercicio 1---");
        
        ServicioLimpieza hogar = new ServicioHogar(true,"Javier Prado 123", 1.5 , 30.0 ,true,"Andre");
        System.out.println("Precio Servicio Hogar: S/" + hogar.calcularPrecioFinal());
        
        ServicioLimpieza oficina = new ServicioOficina(7 ,"Centro Empleabilidad", 5.0 , 40.0 ,true,"Universidad de Lima");
        System.out.println("Precio Servicio Oficina: S/" + oficina.calcularPrecioFinal());
        
        ServicioLimpieza industrial = new ServicioIndustrial(2.0 , "Separadora 123", 3.0 , 60.0 ,true, "Industria SAC");
        System.out.println("Precio Servicio Industrial: S/" + industrial.calcularPrecioFinal());
        
        // Ejercicio 2
        
        System.out.println("---Ejercicio 2---");
        
        DescuentoClienteFrecuente descuentoCF = new DescuentoClienteFrecuente();
        DescuentoCompania descuentoCom = new DescuentoCompania();
        
        double precioBaseH = hogar.calcularPrecioFinal();
        System.out.println("Precio Base de Servicio Hogar: " + precioBaseH);
        
        double descuentoCFHogar = descuentoCF.aplicarDescuento(precioBaseH);
        System.out.println("Precio final con descuento por ser cliente frecuente: " + descuentoCFHogar);
        
        double precioBaseI = industrial.calcularPrecioFinal();
        System.out.println("Precio Base Servicio Industria: " + precioBaseI);
        double descuentoCIndustrial = descuentoCom.aplicarDescuento(precioBaseI);
        System.out.println("Precio final con descuento por campaña: " + descuentoCIndustrial);
        
        // Ejercicio 3
        
        System.out.println("---Ejercicio 3---");
        
        hogar = new ConAromatizante(hogar);
        System.out.println( hogar.getDescripcion() + hogar.calcularPrecioFinal());
        
        hogar = new ConDesinfeccion(hogar);
        System.out.println( hogar.getDescripcion() + hogar.calcularPrecioFinal());
        
        // Ejercicio 4
        
        System.out.println("---Ejercicio 4---");
        
        ServicioFactory ind = new ServicioFactory();
        
        // String tipoServicio, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, String extra
        
        ServicioLimpieza crearInd = ind.crearServicio("industrial", "Av. La Molina", 3.0, 45.0, true, "Ariel", "2.2");
        System.out.println(crearInd.getDescripcion()+ "su precio final es: " + crearInd.calcularPrecioFinal());
        
    }
}