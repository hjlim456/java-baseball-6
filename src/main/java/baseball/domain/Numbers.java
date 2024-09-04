package baseball.domain;

import java.util.List;

public record Numbers(List<Integer> numbers) {
    public List<Integer> getNumbers() {
        return numbers;
    }
}
