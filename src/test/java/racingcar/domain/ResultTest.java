package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ResultTest {

	@Test
	@DisplayName("레이싱카의 현재 위치와 이름을 저장하는 Result 객체를 생성한다")
	void createResultTest() {
		String name = "haha";
		RacingCar racingCar = new RacingCar(name);
		Result result = Result.from(racingCar);
		assertThat(result.getName()).isEqualTo(name);
		assertThat(result.getPosition()).isZero();
	}


}