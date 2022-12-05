package bsu.soundrec.main;

public abstract class Music {
    protected int durationSecond;
    protected String name;

    public void setDurationSecond(int durationSecond) {
        this.durationSecond = durationSecond;
    }
    public int getDurationSecond() {
        return durationSecond;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public Music() {

    }
    public Music(int durationSecond, String name) {
        this.durationSecond = durationSecond;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Music{" +
                "durationSecond=" + durationSecond +
                ", name='" + name + '\'' +
                '}';
    }

    public boolean searchSongs (int leftPoint, int rightPoint){
        boolean key = false;
        if (leftPoint <= durationSecond && durationSecond <= rightPoint){
            key = true;
        }
        return key;
    }
}
