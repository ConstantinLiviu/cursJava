public class Main {
    public static void main(String[] args) {
        // Dependinte ses 34
//        <dependency>
//			<groupId>com.github.gavlyukovskiy</groupId>
//			<artifactId>datasource-proxy-spring-boot-starter</artifactId>
//			<version>1.9.1</version>
//		</dependency>
//                --->in application.properties
//        server.error.include-stacktrace=never
//        logging.level.net.ttddyy.dsproxy.listener=debug


        // Create a generic class ListWrapper<T> that holds an field ArrayList<T>. Implement methods to add an item,
        // get an item by index, and get the size of the list.

        ListWrapper<Integer> listaNumere = new ListWrapper<>();
        listaNumere.addItem(5);
        listaNumere.addItem(2);
        listaNumere.addItem(230);

        listaNumere.getItemByIndex(0);
        System.out.println(listaNumere.getItemByIndex(2));
//        listaNumere.getItemByIndex(8);

        System.out.println(listaNumere.getListSize());
    }
}