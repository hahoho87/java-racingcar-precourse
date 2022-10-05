# 자동차 경주 게임

## 진행 방법

* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.

## 과제 제출 과정

* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)

## 기능 요구사항

* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
* 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
* 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
* 자동차 경주 게임을 완료한 후 누가 우승했는지 알려준다.
* 우승자가 한 명 이상일 경우, 쉼표(,)를 이용하여 구분한다.
* 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 throw 하고, "[ERROR]" 로 시작하는 에러메시즈를 출력 후 그 부분부터 입력을 다시 받는다.
    * Exception 이 아닌 `IllegalArgumentException`, `IllegalStateException` 등과 같은 명확한 유형을 처리한다.

## 기능 목록
1. [ ] 사용자로부터 이름을 입력받아 자동차를 생성한다.
   * [x] 자동차 이름은 쉼표(,)를 기준으로 구분한다.
     * [x] 입력값에 쉼표가 없을 경우 예외처리한다.
     * [x] 입력값이 공백이거나 null 일 경우 예외처리한다.
   * [x] 자동차 이름은 중복될 수 없다.
     * [x] 입력값이 중복될 경우 예외처리한다.
2. [ ] 사용자로부터 이동 횟수를 입력받는다.
   * [ ] 입력값이 숫자가 아닐 경우 예외처리한다.
   * [ ] 입력값이 0이거나 0보다 작을 경우 예외처리한다.
3. [ ] 자동차를 생성하고 매 라운드 별로 이동시킨다.
    * [x] 자동차 이름은 5자 이하만 가능하다.
        * [x] 입력값이 5자를 초과할 경우 예외처리한다.
        * [x] 입력값이 없을 경우 예외처리한다.
    * [ ] 자동차 이름에 공백이 포함되어 있을 경우 공백을 제거한다.
    * [x] 모든 자동차의 초기 위치는 0이다.
    * [ ] 자동차는 전진 혹은 멈춤을 할 수 있다.
        * [ ] 자동차는 0에서 9 사이에서 random 값을 구한다.
        * [ ] random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
    * [ ] 매 라운드 별로 자동차의 위치를 출력한다.
      * [ ] 각 자동차의 이름을 출력 후 위치를 출력한다.
      * [ ] 자동차의 위치는 "-"로 표시한다.
4. [ ] 모든 라운드가 종료되면 우승자를 출력한다.
   * 가장 멀리 이동한 자동차가 우승자이다.
   * 우승자가 한 명 이상일 경우, 쉼표(,)를 이용하여 구분한다.
5. [ ] 에러 메시지 출력
   * [ ] 에러 메시지 앞에 `"[ERROR]"`를 출력한다.

## TODO

- 에러 메시지
  - 에러 메시지 관련 클래스 추출

