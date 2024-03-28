public class Pantofi extends GenericPantofi implements Incaltaminte{

//    String de
    @Override
    public boolean areToc() {
        if(denumire.contains("de femei")) {
            return true;
        }
        return false;
    };
    @Override
    public boolean deFemeiDeBarbati() {
return false;
    };
}
