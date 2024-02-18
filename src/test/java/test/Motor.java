package test;

public class Motor {
    public int numeroCilindros;
    public String tipo;
    public int registro; 

    int getRegistro() {
        return registro;
    }

    public void cambiarRegistro(int nuevoRegistro) {
        this.registro = nuevoRegistro;
    }

    public void asignarTipo(String nuevoTipo) {
        if ("electricidad".equals(nuevoTipo) || "gasolina".equals(nuevoTipo)) {
            this.tipo = nuevoTipo;
        } else {
            System.out.println("Tipo de motor no valido. No se ha modificado el tipo de motor.");
        }
    }
}
