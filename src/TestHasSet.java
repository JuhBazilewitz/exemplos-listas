import java.util.HashSet;
import java.util.Set;

public class TestHasSet {

    public static void main(String[] args) {

        boolean[] ba = new boolean[5];
        Set s = new HashSet();
        ba[0] = s.add("a");
        ba[0] = s.add(new Integer(42));
        ba[0] = s.add("b");
        ba[0] = s.add("a");
        ba[0] = s.add(new Object());
        for(int x = 0; x < ba.length; x++) {
            System.out.println(ba[x] + " ");
            System.out.println("\n");
            for(Object o : s) {
                System.out.println(o + " ");
            }
        }
    }

}
