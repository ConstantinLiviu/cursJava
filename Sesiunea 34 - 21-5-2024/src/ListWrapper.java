import java.util.ArrayList;

public class ListWrapper<T> {
    // Create a generic class ListWrapper<T> that holds a field ArrayList<T>. Implement methods to add an item,
    // get an item by index, and get the size of the list.

    ArrayList<T> list;

    ListWrapper() {
        this.list = new ArrayList<>();
    }

    public void addItem(T variableParam) {
        list.add(variableParam);
    }

    public T getItemByIndex(int indexParam) {
        if (indexParam < list.size() && indexParam>=0) return list.get(indexParam);
        throw new IndexOutOfBoundsException("Indexul nu este valid");
    }

    public int getListSize() {
        return list.size();
    }
}
