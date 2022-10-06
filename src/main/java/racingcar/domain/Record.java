package racingcar.domain;

public class Record {

	private final String name;
	private final int position;

	private Record(String name, int position) {
		this.name = name;
		this.position = position;
	}

	public static Record from(RacingCar racingCar) {
		return new Record(racingCar.getName(), racingCar.getPosition());
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}
}
