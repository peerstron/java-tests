import org.example.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameTest {


    @Test
    void nameStartsWithVowelTest() {

        Person person = new Person("Ampong");

        Assertions.assertTrue(person.getName().startsWith("A"));
    }
}
