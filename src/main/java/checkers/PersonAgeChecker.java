package checkers;

import entities.Person;

public class PersonAgeChecker implements Checker<Person> {

    public boolean check(Person person, Object object) {

        int temp = (int) object;
        if (person.getAge() == temp) {
            return true;
        } else return false;
    }
}
