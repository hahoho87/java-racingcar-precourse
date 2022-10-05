package racingcar.strategy;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class DefaultMovingStrategyTest {

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9, 10})
    @DisplayName("4 이상의 숫자가 들어오면 true 반환")
    void isMovableTest(int input) {
        assertThat(new DefaultMovingStrategy().isMovable(input)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    @DisplayName("3 이하의 숫자가 들어오면 false 반환")
    void isNotMovableTest(int input) {
        assertThat(new DefaultMovingStrategy().isMovable(input)).isFalse();
    }


}