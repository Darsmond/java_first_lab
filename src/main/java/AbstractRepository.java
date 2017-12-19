import comparators.ObjectComparator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import sorters.Sorter;

import java.util.Arrays;

abstract public class AbstractRepository<T> implements Repository<T> {

    public int size;
    public T[] rep;
    public final Logger logger = LogManager.getLogger(AbstractRepository.class);

    public void add(T element) {

        if (size < rep.length) {
            rep[size] = element;
            size++;
            logger.trace("Size of array is appropriate");
        } else if (size >= rep.length) {
            T[] plus;
            //for (int i = 0; i < rep.length; i++) {
            //    plus[i] = rep[i];

            //}
            plus = Arrays.copyOf(rep,size+1);
            rep = plus;
            rep[size] = element;
            size++;
            logger.trace("Size of array had grown.");
        }
    }

    public T[] sort(Sorter sorter, ObjectComparator comparator){
        
        sorter.sort(rep, comparator);
        return rep;
    }
}
