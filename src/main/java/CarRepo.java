import checkers.Checker;

public class CarRepo<Car> extends AbstractRepository<Car> {

    public CarRepo(Car[] rep, int size) {

        this.rep = rep;
        this.size = size;
    }

    public int getSize() {

        return this.size;
    }

    public Car[] getRep() {

        return this.rep;
    }

    public void findCar(Checker A, Object object) {

        for (int index=0; index <= rep.length-1; index++)
        {if(A.check(rep[index], object)){
            System.out.println("Found on index "+index);
            }
            else logger.debug("Not found");
        }
    }
}
