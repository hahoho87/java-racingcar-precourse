package racingcar.view;

import racingcar.domain.*;

import java.util.List;

public class OutputView {

    public static final String ERROR_MESSAGE_PREFIX = "[ERROR] ";

    public void printErrorMessage(String errorMessage) {
        System.out.println(ERROR_MESSAGE_PREFIX + errorMessage);
    }
    public void printResult(Result result) {
        System.out.println("실행 결과");
        List<Records> recordsList = result.getRecordsList();
        for (Records records : recordsList) {
            System.out.println();
            printRoundDistance(records);
        }
    }

    public void printWinners(Winners winners) {
        StringBuilder sb = new StringBuilder();
        List<String> names = winners.getNames();
        sb.append("최종 우승자 : ");
        sb.append(String.join(",", names));
        System.out.println(sb);
    }

    private void printRoundDistance(Records records) {
        List<Record> recordList = records.getRecordList();
        for (Record record : recordList) {
            printRoundDistance(record.getName(), record.getPosition());
        }
    }

    private void printRoundDistance(String carName, CurrentPosition currentLocation) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < currentLocation.getValue(); i++) {
            sb.append("-");
        }
        System.out.println(carName + " : " + sb);
    }

}
