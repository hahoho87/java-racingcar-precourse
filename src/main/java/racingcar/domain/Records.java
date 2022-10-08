package racingcar.domain;

import java.util.List;

public class Records {
    private final List<Record> recordList;

    private Records(List<Record> recordList) {
        this.recordList = recordList;
    }

    public static Records of(List<Record> recordList) {
        return new Records(recordList);
    }

    public List<Record> getRecordList() {
        return recordList;
    }
}
