import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Sequence {
    public static void main(String[] args) {

        List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(1, 0, 2, 3, 4, 5, 6, 20, 1));
        Sequence b = new Sequence();
        b.find(firstList, secondList);
    }

    public boolean find(List x, List y) {
        if (x.size() <= y.size()) {
            y.retainAll(x);
            if (x.size() == y.size()) {
                for (int j = 0; j <= x.size() - 1; j++) {
                    if (x.get(j) != y.get(j)) {
                        System.out.println("false");
                        return false;
                    }
                }
            }
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

}
