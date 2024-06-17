package TemaSesiunea31Plus32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//  -Given a list of Person objects with age and city attributes, filter out people younger than 18 or those who
//  live in the city "Metropolis", then return a list of names of the remaining people, sorted in reverse order.

        List<Person> persons = new ArrayList<>(Arrays.asList(new Person("George", 17, "Bucharest"),
                new Person("Alice", 28, "Metropolis"), new Person("Michael", 73, "Los Angeles"), new Person("Jane",
                        12, "Metropolis"), new Person("Alex", 21, "London"), new Person("Sandra", 31, "Metropolis")));

        System.out.println(persons.stream().filter(person -> person.getAge()>18 && !"Metropolis"
                .equals(person.getCity())).map(Person::getName)
                .sorted((name1, name2) -> name2.compareTo(name1))
                .collect(Collectors.toList()));



//  -Using https://www.w3schools.com/sql/sql_insert.asp, write sql scripts to insert/select/update/delete elements
//  from a table with name Product and fields: name, price, tva. (1 script for every command:
//  insert/select/update/delete)

    // INSERT
        // INSERT INTO Product(name,price,tva) VALUES ("Camasa", 52, 10.4)

    // SELECT
        // SELECT name FROM Product WHERE name = 'Camasa';
    // UPDATE
        // UPDATE Product SET price = 35 WHERE name = "Camasa"
    // DELETE
        // DELETE FROM Product WHERE name = "Camasa"

    }
}
