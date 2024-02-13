public class Main {
    public static <bool> void main(String[] args) {

        // #1
        int l = 5;
        int L = 2;
        System.out.println(l - L);
        System.out.println(l + L);
        System.out.println(l * L);
        System.out.println(l / L);

        // #2
        int increment = 1;
        ++increment;
        System.out.println(increment);
        ++increment;
        System.out.println(increment);
        ++increment;
        System.out.println(increment);

        int decrement = 10;
        --decrement;
        System.out.println(decrement);
        --decrement;
        System.out.println(decrement);
        --decrement;
        System.out.println(decrement);

        int a = -increment;
        System.out.println(a);

        // #3
        int b = 5;
        if (b > 0) {
            System.out.println("pozitiv");
        } else {
            System.out.println("negativ");
        }

        boolean t = true;
        boolean f = false;

        System.out.println(!t);
        System.out.println(!f);

        //#4
        int numaratoare = 1;
        while (numaratoare<10) {
            numaratoare++;
            System.out.println(numaratoare);

        }
        while(numaratoare>1) {
            numaratoare--;
            System.out.println(numaratoare);
        }

    }
}