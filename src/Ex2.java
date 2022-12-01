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
}
