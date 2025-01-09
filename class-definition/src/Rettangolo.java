public class Rettangolo {
    private double altezza;
    private double larghezza;


    public Rettangolo(double altezza, double larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }


    public double calcolaArea() {
        return altezza * larghezza;
    }

    public double calcolaPerimetro() {
        return 2 * (altezza + larghezza);
    }

    //Metodo main per testare la classe rettangolo
    public static void main (String[] args) {
        Rettangolo rettangolo = new Rettangolo(10.7,15.78);
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea() + " m");
        System.out.println("Perimetro del rettangolo: " + rettangolo.calcolaPerimetro() + " m");
    }



}