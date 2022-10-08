package racingcar.domain;

import java.util.Objects;

public class CurrentPosition {
    private int value;

    public CurrentPosition(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("위치는 0보다 작을 수 없습니다.");
        }
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void increasePosition() {
        value++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CurrentPosition that = (CurrentPosition) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
