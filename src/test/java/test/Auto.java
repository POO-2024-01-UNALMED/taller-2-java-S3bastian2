package test;

public class Auto {
    public String modelo;
    public double precio;
    public Asiento asiento;
    public String marca;
    public Motor motor;
    public int registro; 
    public static int cantidadCreados;

    public int cantidadAsientos() {
        int contador = 0;
        for (Asiento asiento : asientos) {
            if (asiento != null) {
                contador++;
            }
        } 
        return contador;       
    }

    public String verificarIntegridad() {
        int registroMotor = motor.getRegistro();
        if (registro != registroMotor) {
            return "Las piezas no son originales";
        }
        for (Asiento asiento : asientos) {
            if (asiento != null && asiento.getRegistro() != registro) {
                return "Las piezas no son originales";
            }
        }
        return "El auto es original";
    }

}
