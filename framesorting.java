import java.util.*;

public class FrameSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of frames:");
        int n = sc.nextInt();

        List<int[]> frames = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter data for frame %d: ", i + 1);
            frames.add(new int[] {random.nextInt(1000) + 1, sc.nextInt()});
        }

        System.out.println("\nBefore Sorting:");
        frames.forEach(frame -> System.out.printf("seqNum: %d, Data: %d%n", frame[0], frame[1]));

        frames.sort(Comparator.comparingInt(frame -> frame[0]));

        System.out.println("\nAfter Sorting:");
        frames.forEach(frame -> System.out.printf("seqNum: %d, Data: %d%n", frame[0], frame[1]));
    }
}
