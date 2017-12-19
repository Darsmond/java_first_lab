package sorters;

import comparators.ObjectComparator;

public class InsertionSorter<T> implements Sorter<T> {
    
    public T[] sort(T[] repository, ObjectComparator<T> comparator) {
        for (int i = 1; i < repository.length; i++) {
            int j = i - 1;
            T insert = repository[i];
            while (j >= 0 && comparator.compare(repository[j], insert) > 0) {
                repository[j + 1] = repository[j];
                j--;
            }
            repository[j + 1] = insert;
        }
        return repository;
    }
}