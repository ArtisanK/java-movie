package domain;

import java.time.LocalDateTime;

import static utils.DateTimeUtils.format;

public class PlaySchedule {
    private final LocalDateTime startDateTime;
    private int capacity;

    public PlaySchedule(LocalDateTime startDateTime, int capacity) {
        this.startDateTime = startDateTime;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "시작시간: " + format(startDateTime) + " 예약가능인원: " + capacity + "\n";
    }

    public String toString(boolean simple) {
        return "시작시간: " + format(startDateTime) + "\n";
    }

    public LocalDateTime getStartDateTime() {
        return this.startDateTime;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
