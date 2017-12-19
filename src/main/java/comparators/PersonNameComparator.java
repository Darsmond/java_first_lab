package comparators;

import entities.Person;

public class PersonNameComparator implements ObjectComparator<Person> {

    public int compare(Person a, Person b) {
        
    return a.getName().compareTo(b.getName());
    }
}
