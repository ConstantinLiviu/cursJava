public class MetodeGenerice {

    public <A> A citeste(A parametru) {
        System.out.println(parametru.getClass());
        return parametru;
    }

    public <B> void scrie(B param) {
        System.out.println("Am scris: " + param);
    }

    public <C, D> void enumerare(C param2, D param3) {
        System.out.println("Elementele sunt: " + param2 + " si " + param3 );
    }

    public <E, F> F caracteristici(E param4, F param5) {
        return param5;
    }

}
