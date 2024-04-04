import java.util.List;

public class ListRetriever {
//    -Create a class named ListRetriever. Inside this class, create a method named retrieveElement which
    //                takes a List of Strings and an integer index as parameters and returns the element at the specified
//                index from the list.
    String retrieveElement(List<String> listParam, int indexParam) {
        System.out.println(listParam.get(indexParam));
        return listParam.get(indexParam);
    }
}
