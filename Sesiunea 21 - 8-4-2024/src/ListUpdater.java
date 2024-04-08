import java.util.ArrayList;

public class ListUpdater {
    void updateList(ArrayList<Integer> arrayParam, int indexParam) {
         arrayParam.set(indexParam, arrayParam.get(indexParam)*2);
    }

}
