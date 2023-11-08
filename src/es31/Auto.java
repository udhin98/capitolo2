package es31;
//cilindrata, marca, targa, modello
public class Auto {
    private int cilindrata;
    private  String marca;
    private String targa;
    private String modello;
    public Auto (int cilindrata, String marca, String targa, String modello) {
        this.cilindrata = cilindrata;
        this.marca = marca;
        this.targa = targa;
        this.modello = modello;
    }

    public int getCilindrata() {
        return cilindrata;
    }

    public void setCilindrata(int cilindrata) {
        this.cilindrata = cilindrata;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTarga() {
        return targa;
    }

    public void setTarga(String targa) {
        this.targa = targa;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "cilindrata=" + cilindrata +
                ", marca='" + marca + '\'' +
                ", targa='" + targa + '\'' +
                ", modello='" + modello + '\'' +
                '}';
    }
}
