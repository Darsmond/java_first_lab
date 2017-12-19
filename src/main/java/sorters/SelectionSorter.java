package sorters;

import comparators.ObjectComparator;

public class SelectionSorter<T> implements Sorter<T> {

    public T[] sort(T[] repository, ObjectComparator<T> comparator) {
        for (int min = 0; min < repository.length - 1; min++) {
            int least = min;
            for (int j = min + 1; j < repository.length; j++) {
                if (comparator.compare(repository[least], repository[j])>0) {
                    least = j;
                }
            }
            T tmp = repository[min];
            repository[min] = repository[least];
            repository[least] = tmp;
        }
        return repository;
    }
}
