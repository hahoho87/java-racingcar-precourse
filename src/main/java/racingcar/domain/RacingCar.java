package racingcar.domain;

import java.util.Objects;

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

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		RacingCar racingCar = (RacingCar)o;

		return Objects.equals(name, racingCar.name);
	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}
}
