public class Person {
    String name;
    Integer age;
    boolean equals() {
        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    // @Override
    public boolean equals(Person obj) {
        if (obj==null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        return (name.equals(obj.name) && name.equals(obj.age));
    }
}
