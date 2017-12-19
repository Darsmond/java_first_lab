import comparators.CarBoughtComparator;
import entities.Car;
import entities.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joda.time.LocalDate;
import sorters.BubbleSorter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class Application {

    private static final Logger logger = LogManager.getLogger(Application.class);
    static Properties prop = new Properties();
    static OutputStream output = null;

    public static void main(String args[]) throws IOException {

        logger.trace("Entering application");

        try {
            output = new FileOutputStream("config.properties");
            prop.setProperty("Name","Ars");
            prop.store(output,null);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        Person person1 = new Person("Xenomorf", new LocalDate(2010,11,4));
        Person person2 = new Person("Denis",new LocalDate(2015,11,5));
        Person person3 = new Person("Ars",new LocalDate(1941,10,17));

        Car car1 = new Car("Ford", new LocalDate(2017,11,1));
        Car car2 = new Car("Hyundai",new LocalDate(2010,5,11));
        Car car3 = new Car("Subaru",new LocalDate(2002,2,27));

        CarRepo<Car> carRepo = new CarRepo(new Car[1],0);
        carRepo.add(car1);
        carRepo.add(car3);
        carRepo.add(car2);

        PersonRepo<Person> personRepo = new PersonRepo(new Person[1],0);
        personRepo.add(person1);
        personRepo.add(person2);
        personRepo.add(person3);

        String test10 = personRepo.getRep()[0].getName();
        String test11 = personRepo.getRep()[1].getName();
        String test12 = personRepo.getRep()[2].getName();
        System.out.println(test10);
        System.out.println(test11);
        System.out.println(test12);

        carRepo.sort(new BubbleSorter(), new CarBoughtComparator());

//        String test7 = carRepo.getRep()[0].getMark();
//        String test8 = carRepo.getRep()[1].getMark();
//        String test9 = carRepo.getRep()[2].getMark();
//
//        System.out.println(test7);
//        System.out.println(test8);
//        System.out.println(test9);

        //personRepo.find(2);

        Configurator configurator = new Configurator();
        String Name = configurator.getPropValues();
        //personRepo.findPerson(new checkers.PersonNameChecker(), Name);
        personRepo.delete(1);

        String test13 = personRepo.getRep()[0].getName();
        String test14 = personRepo.getRep()[1].getName();
        //String test15 = personRepo.getRep()[2].getName();
        System.out.println(test13);
        System.out.println(test14);
        //System.out.println(test15);

    }
}