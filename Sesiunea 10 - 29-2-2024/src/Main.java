public class Main {
    public static void main(String[] args) {

        // instantiere obiect in baza clasei
        Floare magnolie = new Floare(8,"rosu");
        // instantiere folosind al doilea constructor;
        Floare lalea = new Floare(5);

        magnolie.metodaCareIntoarceUnNumarIntreg();
        lalea.metodaCareIntoarceNimic();



        //  metode stringuri
        String animal = "Leu     ";
        System.out.println(animal.trim());



        // EXERCITII:
        // Contract:
        Contract angelaS = new Contract("Angela Stoian", "XCOM Solutions", true, 5200);
        Contract mihaiM = new Contract("Mihai Minea", "Impex SRL", false, 3200);

        // Om:
        Om ionI = new Om(47, "Ion Ionescu", "Sofer", 1.82);
        Om emiliaS = new Om(25, "Emilia Stroie", "Manager", 1.65);

        // Student:
        Student mimiF = new Student(2,"Mimi Florescu", false, true);
        Student anaC = new Student(3,"Ana Calin", true, false);


    }
}