package bsu.soundrec.music;

public class Ringtone extends bsu.soundrec.main.Music{
    private String alarmClockOrCall;

    public Ringtone() {
    }

    public Ringtone(int durationSecond, String name, String alarmClockOrCall) {
        super(durationSecond, name);
        this.alarmClockOrCall = alarmClockOrCall;
    }

    @Override
    public String toString() {
        return "Ringtone{" +
                "alarmClockOrCall='" + alarmClockOrCall + '\'' +
                ", durationSecond=" + durationSecond +
                ", name='" + name + '\'' +
                '}';
    }
}
