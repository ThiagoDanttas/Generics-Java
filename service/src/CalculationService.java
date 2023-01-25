import java.util.ArrayList;
import java.util.List;

public class CalculationService<T>  {

    private final List<T> list = new ArrayList<>();

    public static <T extends Comparable<? super T>> T max(List<T> list) { // Observação
        if(list.isEmpty()) throw new IllegalStateException("List can't be empty");
        T max = list.get(0);
        for(T item: list) {
            if(item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }
}
