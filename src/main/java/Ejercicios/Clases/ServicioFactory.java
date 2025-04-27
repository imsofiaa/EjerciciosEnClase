package Ejercicios.Clases;

public class ServicioFactory {
    
     public ServicioLimpieza crearServicio(String tipoServicio, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, String extra){
        switch(tipoServicio){
            case "hogar":
                return new ServicioHogar(Boolean.parseBoolean(extra),direccionCliente,duracionHoras,tarifaHora,incluyeMateriales,nombreCliente);
            case "oficina":
                return new ServicioOficina(Integer.parseInt(extra),direccionCliente,duracionHoras,tarifaHora,incluyeMateriales,nombreCliente);
            case "industrial":
                
                // double multiplicadorRiesgo, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente
                
                return new ServicioIndustrial(Double.parseDouble(extra),direccionCliente,duracionHoras,tarifaHora,incluyeMateriales,nombreCliente);
            default:
                throw new IllegalArgumentException("Tipo de servicio invalido");
        }
    }
} 