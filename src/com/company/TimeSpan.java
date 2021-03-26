package com.company;

public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (minutes > 59) {
            throw new IllegalArgumentException("Минут может быть максимум 59");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    public void add(TimeSpan timeSpan) {
        hours += timeSpan.hours;
        int tmpMinutes = minutes += timeSpan.minutes;
        if (tmpMinutes == 60) {
            hours += 1;
            minutes = 0;
        } else if (tmpMinutes > 60) {
            hours += 1;
            minutes = tmpMinutes - 60;
        } else {
            minutes = tmpMinutes;
        }
    }

    public void sub(TimeSpan timeSpan) {
        int tmpMinutes = hours * 60 + minutes;
        int subMinutes = timeSpan.hours * 60 + timeSpan.minutes;
        int diffMinutes = tmpMinutes - subMinutes;
        hours = (int) diffMinutes / 60;
        minutes = Math.max(diffMinutes - (hours * 60), 0);
    }

    public void mult(double times) {
        int tmpMinutes = hours * 60 + minutes;
        int diffMinutes = (int) (tmpMinutes * times);
        hours = diffMinutes / 60;
        minutes = Math.max(diffMinutes - (hours * 60), 0);
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }


}
