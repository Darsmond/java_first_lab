package checkers;

import entities.Person;

public class PersonNameChecker implements Checker<Person> {

    public boolean check(Person person, Object object) {

        if (person.getName().equals(object)){
            return true;
        } else return false;
    }

}
