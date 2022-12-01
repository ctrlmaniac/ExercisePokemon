import java.util.ArrayList;

import models.Pokemon;

public class Ex2 {
    public static int[] convertFromList2Array(ArrayList<Pokemon> lista) {
        int[] array = new int[lista.size()];

        for (int i = 0; i < lista.size(); i++) {
            Pokemon p = lista.get(i);

            array[i] = p.getId();
        }

        return array;
    }

    public static int multipyOrDivide(int id) {
        return (id % 2 == 0) ? id * 2 : id / 3;
    }
}
