package Practice2;

public class Problem3 {
    static void main() {
        Time time1 = new Time(10, 0, 0);
        Time time2 = new Time(5, 5, 5);
        System.out.printf("%-35s %s\n", "Time1:", time1.toUniversal());
        System.out.printf("%-35s %s\n", "Time2", time2.toUniversal());

        time1.add(time2);
        System.out.printf("%-35s %s\n", "Time1 after adding Time2 to it:", time1.toUniversal());
    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        if (!(hour >= 0 && hour <= 23)) {
            throw new IllegalArgumentException("Invalid argument: hour must be between 0 and 23");
        }
        if (!(minute >= 0 && minute <= 59)) {
            throw new IllegalArgumentException("Invalid argument: minute must be between 0 and 59");
        }
        if (!(second >= 0 && second <= 59)) {
            throw new IllegalArgumentException("Invalid argument: second must be between 0 and 59");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public String toStandard() {
        int universalHour;
        String timeFrame;

        if (hour == 12) {
            universalHour = hour;
            timeFrame = "PM";
        } else if (hour > 12) {
            universalHour = hour - 12;
            timeFrame = "PM";
        } else {
            universalHour = hour;
            timeFrame = "AM";
        }

        return String.format("%02d:%02d:%02d %s", universalHour, minute, second, timeFrame);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void add(Time time) {
        second += time.getSecond();
        minute += time.getMinute();
        hour += time.getHour();

        minute += second / 60;
        second %= 60;
        hour += minute / 60;
        minute %= 60;
        hour = (hour > 23) ? hour - 24 : hour;
    }
}
