package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Result {

    private final List<Records> recordsList;

    private Result(List<Records> recordsList) {
        this.recordsList = recordsList;
    }

    public static Result createInitialResult() {
        return new Result(new ArrayList<>());
    }

    public List<Records> getRecordsList() {
        return recordsList;
    }

    public void add(Records records) {
        recordsList.add(records);
    }

    public void getWinner(int lastRaceNumber) {
        if (recordsList.size() < lastRaceNumber) {
            throw new IllegalArgumentException("결과가 제대로 기록되지 않았습니다.");
        }
        Records records = recordsList.get(lastRaceNumber - 1);
        records.getWinner();
    }

}
