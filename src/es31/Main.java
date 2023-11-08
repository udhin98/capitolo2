package es31;

public class Main {
    public static void main(String[] args) {
        Auto miaAuto = new Auto(2000, "Fiat", "BA123CD", "Punto");
        System.out.println("Cilindrata: " + miaAuto.getCilindrata());
        System.out.println("Marca: " + miaAuto.getTarga());
        System.out.println("Targa: " + miaAuto.getMarca());
        System.out.println("Modello: " + miaAuto.getModello());

        miaAuto.setCilindrata(5000);
        miaAuto.setMarca("Audi");
        miaAuto.setTarga("RM456XD");
        miaAuto.setModello("A4");

        System.out.println("Cilindrata aggiornata: " + miaAuto.getCilindrata());
        System.out.println("Marca aggiornata: " + miaAuto.getTarga());
        System.out.println("Targa aggiornata: " + miaAuto.getMarca());
        System.out.println("Modello aggiornata: " + miaAuto.getModello());
    }
}
