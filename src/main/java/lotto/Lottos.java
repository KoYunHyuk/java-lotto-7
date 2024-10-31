package lotto;

import java.util.List;

public class Lottos {
    List<Lotto> values;

    public Lottos(List<Lotto> values) {
        this.values = values;
    }

    public void searchAll(List<Integer> list, int bonus) {
        values.forEach(lotto -> lotto.search(list, bonus));
    }

}