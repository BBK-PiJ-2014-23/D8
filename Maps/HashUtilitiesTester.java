import java.util.*;

public class HashUtilitiesTester {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a string and I will calculate its hash code");
        String str = sc.nextLine();
        int hash = str.hashCode();
        int smallHash = HashUtilities.shortHash(hash);
        System.out.println("0 < " + smallHash + " < 1000");
    }
}