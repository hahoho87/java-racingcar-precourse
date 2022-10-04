package racingcar.domain;

public class RacingCar {

	private static final int STARTING_POSITION = 0;

	private final String name;
	private final int currentPosition;

	public RacingCar(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException("자동차 이름은 공백일 수 없습니다.");
		}
		if (name.length() > 5) {
			throw new IllegalArgumentException("자동차 이름은 5자를 초과할 수 없습니다.");
		}
		this.name = name;
		this.currentPosition = STARTING_POSITION;
	}

	public int getPosition() {
		return currentPosition;
	}

	public String getName() {
		return name;
	}
}
