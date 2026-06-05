package task;
import java.util.*;

public class Arraylists {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> playlist = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter song " + i + ": ");
            String song = scanner.nextLine();
            playlist.add(song);
        }

        System.out.println(playlist.get(1));

        System.out.println(playlist.remove(1));

        System.out.println( playlist.contains("Animal"));

        System.out.println(playlist.size());
        System.out.println(playlist.isEmpty());

        System.out.println("\nSongs in Playlist :");
        playlist.forEach(System.out::println);

        scanner.close();
    }
}