package bsu.soundrec.music;

public class Song extends bsu.soundrec.main.Music{
    private String genre;
    private String groupOrAuthor;

    public Song() {
    }

    public Song(int durationSecond, String name, String genre, String groupOrAuthor) {
        super(durationSecond, name);
        this.genre = genre;
        this.groupOrAuthor = groupOrAuthor;
    }

    @Override
    public String toString() {
        return "Song{" +
                "genre='" + genre + '\'' +
                ", groupOrAuthor='" + groupOrAuthor + '\'' +
                ", durationSecond=" + durationSecond +
                ", name='" + name + '\'' +
                '}';
    }
}
