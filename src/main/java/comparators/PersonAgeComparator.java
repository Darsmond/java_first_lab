package comparators;

import entities.Person;

public class PersonAgeComparator implements ObjectComparator<Person> {

    public int compare(Person a, Person b){

            if(a.getAge()> b.getAge())
                return 1;
            else if(a.getAge()< b.getAge())
                return -1;
            else
                return 0;
    }
}

