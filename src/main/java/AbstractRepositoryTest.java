import comparators.PersonAgeComparator;
import comparators.PersonNameComparator;
import entities.Person;
import org.joda.time.LocalDate;
import org.junit.Test;
import sorters.BubbleSorter;
import sorters.InsertionSorter;
import sorters.SelectionSorter;

public class AbstractRepositoryTest {

    PersonRepo<Person> testPersonRepo = new PersonRepo(new Person[1],0);
    Person person1 = new Person("Alexey",new LocalDate(2000,1,5));
    Person person2 = new Person("Andrey",new LocalDate(1990,11,14));
    Person person3 = new Person("Christian",new LocalDate(1985,12,31));

    @Test
    public void add() throws Exception {

        testPersonRepo.add(person1);
        String test = testPersonRepo.getRep()[0].getName();
        String test2 = "Alexey";
        System.out.println(test==test2);
    }

    @Test
    public void sort() throws Exception {

        testPersonRepo.add(person1);
        testPersonRepo.add(person2);
        testPersonRepo.sort(new BubbleSorter(), new PersonNameComparator());
        String test = testPersonRepo.getRep()[0].getName();
        String test2 = "Alexey";
        System.out.println(test==test2);
    }

    @Test
    public void anotherSort() throws Exception {

        testPersonRepo.add(person1);
        testPersonRepo.add(person2);
        testPersonRepo.add(person3);
        testPersonRepo.sort(new SelectionSorter(), new PersonNameComparator());
        String test = testPersonRepo.getRep()[2].getName();
        String test2 = "Christian";
        System.out.println(test==test2);
    }

    @Test
    public void thirdSort() throws Exception {

        testPersonRepo.add(person1);
        testPersonRepo.add(person2);
        testPersonRepo.add(person3);
        testPersonRepo.sort(new InsertionSorter(), new PersonNameComparator());
        String test = testPersonRepo.getRep()[2].getName();
        String test2 = "Christian";
        System.out.println(test==test2);
    }

    @Test
    public void forthSort() throws Exception {

        testPersonRepo.add(person1);
        testPersonRepo.add(person2);
        testPersonRepo.add(person3);
        testPersonRepo.sort(new SelectionSorter(), new PersonAgeComparator());
        int test = testPersonRepo.getRep()[2].getAge();
        int test2 = 31;
        System.out.println(test==test2);
    }

}