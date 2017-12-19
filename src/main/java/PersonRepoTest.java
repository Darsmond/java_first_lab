import checkers.PersonAgeChecker;
import checkers.PersonNameChecker;
import entities.Person;
import org.joda.time.LocalDate;
import org.junit.Test;

public class PersonRepoTest {

    PersonRepo<Person> testPersonRepo = new PersonRepo(new Person[1],0);
    Person person1 = new Person("Alexey",new LocalDate(2000,1,5));
    Person person2 = new Person("Andrey",new LocalDate(1990,11,14));
    Person person3 = new Person("Christian",new LocalDate(1985,12,31));

    @Test
    public void findPerson() throws Exception {
        testPersonRepo.add(person1);
        testPersonRepo.findPerson(new PersonAgeChecker(), new Integer(18));
    }

    @Test
    public void findAnotherPerson() throws Exception {
        testPersonRepo.add(person1);
        testPersonRepo.findPerson(new PersonNameChecker(), new String("Christian"));
    }
}