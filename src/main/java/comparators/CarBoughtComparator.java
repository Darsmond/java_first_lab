package comparators;

import entities.Car;

public class CarBoughtComparator implements ObjectComparator<Car> {

    public int compare(Car a, Car b){

        return a.getBought().toDate().compareTo(b.getBought().toDate());
    }
}
