public class LuzInteligente {

    private String idLuz;
    private int nivelBrillo;
    private boolean encendida;

    public LuzInteligente(String idLuz) {
        this.idLuz = idLuz;
        this.nivelBrillo = 0;
        this.encendida = false;
    }

    public String getIdLuz() {
        return idLuz;
    }

    public int getNivelBrillo() {
        return nivelBrillo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public void ajustarBrillo(int nuevoNivel) {
        if (this.encendida == true) {
            if (nuevoNivel >= 0 && nuevoNivel <= 100) {
                this.nivelBrillo = nuevoNivel;
                System.out.println("-> Brillo ajustado correctamente.");
            } else {
                System.out.println("Error: El brillo debe estar entre 0 y 100.");
            }
        } else {
            System.out.println("Error: No se puede ajustar el brillo porque la luz esta apagada.");
        }
    }

    public void mostrarEstado(){
        System.out.println("Sensor ID: " + idLuz + " | Encendida: " + encendida + "  | Nivel Brillo: " + nivelBrillo);
    }
}
