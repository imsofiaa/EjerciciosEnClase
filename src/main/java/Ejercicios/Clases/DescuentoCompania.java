package Ejercicios.Clases;

public class DescuentoCompania implements Descuento{

    private static final double PORCENTAJE_DESCUENTO = 0.20; //static final asegura que mas adelante esa constante no se le pueda cambiar el valor
    
    @Override
    public double aplicarDescuento(double monto) {
        return monto * (1 - PORCENTAJE_DESCUENTO);
    }
    
}
