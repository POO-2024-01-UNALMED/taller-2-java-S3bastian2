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

    public void asignarTipo(String tipo) {
        if (tipo.equals("electrico") || tipo.equals("gasolina")) {
            this.tipo = tipo;
        }
    }
    
}
