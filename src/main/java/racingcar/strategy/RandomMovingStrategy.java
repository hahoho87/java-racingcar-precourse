package racingcar.strategy;

public class RandomMovingStrategy implements MovingStrategy {

        private static final int MOVING_CONDITION = 4;

        @Override
        public boolean isMovable(int input) {
            return input >= MOVING_CONDITION;
        }
}
