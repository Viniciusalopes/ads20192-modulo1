package classes;

public class Carro {

    // Atributos
    private String placa = "";
    private String modelo = "";
    private String cor = "";
    private int anoDoModelo = 0;

    // Get
    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAnoDoModelo() {
        return anoDoModelo;
    }

    // Set
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAnoDoModelo(int anoDoModelo) {
        this.anoDoModelo = anoDoModelo;
    }

}
