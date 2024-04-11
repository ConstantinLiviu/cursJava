public class ClasaGenerica2 <Generic2>{

    Generic2 salariu;

    public <Generic2> void verificareSold(Generic2 sumaParam) {
        System.out.println("soldul disponibil este: " + sumaParam);
    }

    public ClasaGenerica2(Generic2 salariuParam) {
        this.salariu = salariuParam;
    }
}
