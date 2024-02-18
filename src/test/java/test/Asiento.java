package test;

public class Asiento {
    public String color;
    public double precio;
    public int registro;

    void cambiarColor(String nuevoColor) {
        String[] coloresPermitidos = {"Rojo", "Verde", "Amarillo", "Negro", "Blanco"};
        for (String colorPermitido : coloresPermitidos) {
            if (colorPermitido.equals(nuevoColor)) {
                this.color = nuevoColor;
                return; 
            }
        }
        System.out.println("El color proporcionado no es valido. El color de asiento no ha cambiado.");
    }
}
