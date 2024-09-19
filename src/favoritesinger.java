import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class favoritesinger {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        HashMap<Long, Long> singerCount = new HashMap<>();
        for(long i = 0 ; i < n ; i++){
            long singer = sc.nextLong();
            singerCount.put(singer, singerCount.getOrDefault(singer, 0L) + 1);
        }
        long maxSongs = Collections.max(singerCount.values());
        long favouriteSingersCount = 0;
        for (long count : singerCount.values()) {
            if (count == maxSongs) {
                favouriteSingersCount++;
            }
        }
        System.out.println(favouriteSingersCount);

    }
}
