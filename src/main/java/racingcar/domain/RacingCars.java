package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RacingCars {
	private final List<RacingCar> racingCars;

	private RacingCars(List<RacingCar> racingCars) {
		this.racingCars = racingCars;
	}

	public static RacingCars of(String names) {
		List<RacingCar> racingCars = new ArrayList<>();
		validateCarNames(names);
		String[] split = names.split(",");

		for (String name : split) {
			RacingCar racingCar = new RacingCar(name);
			if (racingCars.contains(racingCar)) {
				throw new IllegalArgumentException("중복된 이름이 존재합니다.");
			}
			racingCars.add(racingCar);
		}
		return new RacingCars(racingCars);
	}

	private static void validateCarNames(String carNames) {
		validateBlank(carNames);
		validateContainDelimiter(carNames);
	}


	private static void validateContainDelimiter(String carNames) {
		if (!carNames.contains(",")) {
			throw new IllegalArgumentException("자동차 이름은 쉼표(,)를 기준으로 구분해주세요.");
		}
	}

	private static void validateBlank(String carNames) {
		if (carNames == null || carNames.isEmpty()) {
			throw new IllegalArgumentException("입력값이 없습니다.");
		}
	}

	public List<RacingCar> getRacingCars() {
		return racingCars;
	}
}
