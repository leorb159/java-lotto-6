package lotto;

import java.util.Collections;
import java.util.List;

public class Lotto {
    private final List<Integer> numbers;

    public Lotto(List<Integer> numbers) {
        validate(numbers);
        this.numbers = numbers;
    }

    private void validate(List<Integer> numbers) {
        if (numbers.size() != 6) {
            throw new IllegalArgumentException();
        }
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }

    public int checkMatchCount(Lotto lotto) {
        int count = 0;
        for (int number : numbers) {
            if (lotto.contains(number)) {
                count++;
            }
        }
        return count;
    }

    public boolean contains(int number) {
        return numbers.contains(number);
    }
}
