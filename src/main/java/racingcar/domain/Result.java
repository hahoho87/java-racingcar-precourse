package racingcar.domain;

public class Result {

	private final String name;
	private final int position;

	private Result(String name, int position) {
		this.name = name;
		this.position = position;
	}

	public static Result from(RacingCar racingCar) {
		return new Result(racingCar.getName(), racingCar.getPosition());
	}

	public String getName() {
		return name;
	}

	public int getPosition() {
		return position;
	}
}
