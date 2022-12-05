package bsu.soundrec.main;
import bsu.soundrec.music.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Music> album;

        album = fulling();
        printAlbum(album);

        album = albumSorting(album);
        printAlbum(album);

        int albumLength = calculateAlbumLength(album);
        System.out.println("The length of album is "+ albumLength + " seconds");

        List<Music> songsDurationInTheRange = searchSongs(100, 200, album);
        printAlbum(songsDurationInTheRange);
    }

    public static List<Music> fulling() {
        List<Music> album = new ArrayList<>();
        Music music = new Ringtone(200, "Gran Vals",
                "Call");
        album.add(music);
        music = new Song(208, "Whispers in the Dark",
                "Rock", "Skillet");
        album.add(music);
        music = new Symphony(1867, "Symphony №5",
                "Beethoven", 1804);
        album.add(music);
        music = new Song(150, "What a wonderful world",
                "Jazz", "Louis Armstrong");
        album.add(music);
        music = new Symphony(1636, "Symphony №5",
                "Chaikovsky", 1888);
        album.add(music);
        return album;
    }

    public static void printAlbum(List<Music> album){
        for(Music music : album){
            System.out.println(music);
        }
    }

    private static List<Music> albumSorting(List<Music> album) {
        System.out.print("Enter a queue of musical types from: " + "\n" +
                "Ringtone, Song, Symphony"  + "\n");

        String[] startTypes = {"Ringtone", "Song" , "Symphony"};
        ArrayList<String> typeOrder = new ArrayList<>();

        for (int i = 0; i < startTypes.length; i++){
            System.out.print(i+1 + " ");
            Scanner scan = new Scanner(System.in);
            String style = scan.nextLine();
            typeOrder.add(style);
        }

        List<Music> sortedAlbum = new ArrayList<>();
        for (String type : typeOrder){
            for (Music music : album){
                if (music.getClass().getSimpleName().equals(type)){
                    sortedAlbum.add(music);
                }
            }
        }
        return sortedAlbum;
    }

    private static int calculateAlbumLength(List<Music> album) {
        int duration = 0;
        for(Music song : album){
            duration += song.getDurationSecond();
        }
        return duration;
    }

    private static List<Music> searchSongs(int leftPoint, int rightPoint,
                                    List<Music>album){
        boolean key;
        List<Music> songsDurationInTheRange = new ArrayList<>();
        for (Music song : album){
            key = song.searchSongs(leftPoint, rightPoint);
            if (key){
                songsDurationInTheRange.add(song);
            }
        }
        return songsDurationInTheRange;
    }
}