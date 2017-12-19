import checkers.Checker;

public class PersonRepo<Person> extends AbstractRepository<Person> {

    public PersonRepo(Person[] rep, int size) {

        this.rep = rep;
        this.size = size;
    }

    public int getSize() {

        return this.size;
    }

    public void setSize(int value) {

        this.size = value;
    }

    public Person[] getRep() {

        return this.rep;
    }

    public void setRep(Person[] value) {

        this.rep = value;
    }

    public void findPerson(Checker A, Object object) {

        for (int index=0; index <= rep.length-1; index++)
        {if(A.check(rep[index], object)){
            System.out.println("Found on index "+index);
            }
        }
    }
}
