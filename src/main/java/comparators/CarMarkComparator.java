package comparators;

import entities.Car;

public class CarMarkComparator implements ObjectComparator<Car> {

    public int compare(Car a, Car b) {

        return a.getMark().compareTo(b.getMark());
    }
}
