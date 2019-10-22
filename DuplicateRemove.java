import java.util.*;
import java.util.stream.Collectors;

/**
 * Remove duplicates from int array
 * First we move array to set (where dupes suppressed), then move set to array
 * Oct 2019 EvgenyT
 */

public class DuplicateRemove {
    public static void main(String[] args) {
        // Array with 2 dupes
        int[] intArray = {1,2,2,3};
        // Move array to set, LinkedHasSet preserve order
        Set<Integer> intSet = new LinkedHashSet<>();
        intSet.addAll(Arrays.stream(intArray).boxed().collect(Collectors.toList()));
        // Move set to array
        intArray = intSet.stream().mapToInt(i->i).toArray();
        // Print result: 1,2,3
        System.out.println(Arrays.toString(intArray));
    }
}
