package FamilyTree.model.Person.comparators;

import FamilyTree.model.Person.PersonElements;

import java.time.LocalDate;
import java.util.Comparator;

public class CompareByPersonAge<E extends PersonElements> implements Comparator<E> {

    @Override
    public int compare(E o1, E o2) {
        return Integer.compare(LocalDate.from(o1.getBurnData()).getYear(), LocalDate.from(o2.getBurnData()).getYear());
    }
}
