import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {

        List<String> list = new ArrayList(Arrays.asList("NORTH", "SOUTH", "EAST", "WEST"));
        List<String> list2 = new ArrayList(Arrays.asList("NORTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"));
        List<String> list3 = new ArrayList(Arrays.asList("NORTH", "NORTH", "EAST", "EAST", "NORTH", "WEST", "SOUTH", "WEST", "WEST"));
        List<String> list4 = new ArrayList(Arrays.asList("NORTH", "NORTH", "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "SOUTH", "WEST", "WEST"));

        List<String> result = Assorted.wildWest(list);
        List<String> result2 = Assorted.wildWest(list2);
        List<String> result3 = Assorted.wildWest(list3);
        List<String> result4 = Assorted.wildWest(list4);

        System.out.println("Result 1: " + result);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 3: " + result4);
    }
}
