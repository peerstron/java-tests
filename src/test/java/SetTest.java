import org.example.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    @Test
    void checkIfAPersonnelSetContainsAnEmployee() {
        Person employee1 = new Person("Joshua");
        Person employee2 = new Person("Amina");

        Set<Person> personnelSet = new HashSet<>();
        personnelSet.add(employee1);

        // test to see if employee is in the set
        Assertions.assertTrue(personnelSet.contains(employee1), ()-> String.format("Personnel file for " + employee1.getName() + " was not found"));
    }
}
