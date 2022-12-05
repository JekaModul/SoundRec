package bsu.soundrec.music;

public class Symphony extends bsu.soundrec.main.Music{
    private String composer;
    private int yearCreate;

    public Symphony() {
    }

    public Symphony(int durationSecond, String name, String composer, int yearCreate) {
        super(durationSecond, name);
        this.composer = composer;
        this.yearCreate = yearCreate;
    }

    @Override
    public String toString() {
        return "Symphony{" +
                "composer='" + composer + '\'' +
                ", yearCreate=" + yearCreate +
                ", durationSecond=" + durationSecond +
                ", name='" + name + '\'' +
                '}';
    }
}

