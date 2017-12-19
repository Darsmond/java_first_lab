import comparators.ObjectComparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sorters.Sorter;

import java.util.Arrays;

abstract public class AbstractRepository<T> implements Repository<T> {

    public int size;
    public T[] rep;
    public final Logger logger = LogManager.getLogger(AbstractRepository.class);

    public static <T> T convertInstanceOfObject(Object o, Class<T> clazz) {
        try {
            return clazz.cast(o);
        } catch (ClassCastException e) {
            return null;
        }
    }

    public void add(T element) {

        if (size < rep.length) {
            rep[size] = element;
            size++;
            logger.trace("Size of array is appropriate");
        } else if (size >= rep.length) {
            T[] plus;
            plus = Arrays.copyOf(rep, size + 1);
            rep = plus;
            rep[size] = element;
            size++;
            logger.trace("Size of array had grown.");
        }
    }

    public T[] sort(Sorter sorter, ObjectComparator comparator) {

        sorter.sort(rep, comparator);
        return rep;
    }

    public void find(int ind) {
        System.out.println(rep[ind].toString());
    }

    public void delete(int i) {

        rep[i]=null;
        for (int index = i; index<rep.length-1; index++){
            rep[index]=rep[index+1];
        }
        rep = Arrays.copyOfRange(rep,0,rep.length-1);
    }
}




