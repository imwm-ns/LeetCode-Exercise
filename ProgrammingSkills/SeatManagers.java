import java.util.TreeMap;

public class SeatManagers {
    public static void main(String[] args) {
        SeatManager seatManager = new SeatManager(5); // Initializes a SeatManager with 5 seats.
        seatManager.reserve();    // All seats are available, so return the lowest numbered seat, which is 1.
        seatManager.reserve();    // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
        seatManager.unreserve(2); // Unreserve seat 2, so now the available seats are [2,3,4,5].
        seatManager.reserve();    // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
        seatManager.reserve();    // The available seats are [3,4,5], so return the lowest of them, which is 3.
        seatManager.reserve();    // The available seats are [4,5], so return the lowest of them, which is 4.
        seatManager.reserve();    // The only available seat is seat 5, so return 5.
        seatManager.unreserve(5); // Unreserve seat 5, so now the available seats are [5].
        seatManager.unreserve(3);
        seatManager.showSeat();
    }
}

class SeatManager {
    TreeMap<Integer, Boolean> map;
    public SeatManager(int n) {
        map = new TreeMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, true);
        }
    }

    public int reserve() {
        return map.pollFirstEntry().getKey();
    }

    public void unreserve(int seatNumber) {
        map.put(seatNumber, true);
    }

    public void showSeat() {
        System.out.println(map);
    }
}