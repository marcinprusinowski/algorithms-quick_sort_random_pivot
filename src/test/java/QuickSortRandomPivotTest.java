import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


class QuickSortRandomPivotTest {

    @Test
    public void shouldReturnSortedArray(){
        List<Integer> numbers = new ArrayList<>(List.of(1,5,6,132,5,13412,3213));
        List<Integer> expected = new ArrayList<>(List.of(1, 5, 5, 6, 132, 3213, 13412));
        QuickSortRandomPivot quickSort = new QuickSortRandomPivot(numbers);

        numbers = quickSort.sort();

        Assertions.assertIterableEquals(expected , numbers);
    }

}