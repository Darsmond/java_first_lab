package sorters;

import comparators.ObjectComparator;

public class BubbleSorter<T> implements Sorter<T> {

    public T[] sort(T[] repository, ObjectComparator<T> comparator) {
        for (int a = 1; a < repository.length; a++) {
            for (int b = 0; b < repository.length - a; b++) {
                if (comparator.compare(repository[b], repository[b + 1]) > 0) {
                    T temp = repository[b];
                    repository[b] = repository[b + 1];
                    repository[b + 1] = temp;
                }
            }
        }
        return repository;
    }
}

