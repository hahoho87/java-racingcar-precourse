package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator implements NumberGenerator {
	private static final int MINIMUM_NUMBER = 0;
	private static final int MAXIMUM_NUMBER = 9;

	@Override
	public int generateNumber() {
		return Randoms.pickNumberInRange(MINIMUM_NUMBER, MAXIMUM_NUMBER);
	}
}
