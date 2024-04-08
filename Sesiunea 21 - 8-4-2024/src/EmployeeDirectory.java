import java.util.HashMap;
import java.util.Map;

public class EmployeeDirectory {
    void displayEmployeeInfo(HashMap<String, String> hashMapParam) {
        for(Map.Entry<String, String> entry: hashMapParam.entrySet()) {
            System.out.println(entry.getKey() + ":" + " " + entry.getValue());
        }
    }
}
