package sorters;

import comparators.ObjectComparator;

public interface Sorter<T> {
    T[] sort(T[] repository, ObjectComparator<T> comparator);
    }

