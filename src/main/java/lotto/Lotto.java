package lotto;

import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또 번호는 6개여야 합니다.");
        }
    }

    // TODO: 추가 기능 구현
    public List<Integer> getNumbers() {
        return this.numbers;
    }

    public void search(List<Integer> intList, int bonus) {
        int count = 0;

        for (int i = 0; i < intList.size(); i++) {
            if (numbers.contains(intList.get(i))) {
                count++;
            }
        }

        System.out.println("\ncount : " + count);

        if (count >= 5 && numbers.contains(bonus)) {
            // Enum - 5개 hit, 보너스볼 hit (+1)
        }
    }
}
