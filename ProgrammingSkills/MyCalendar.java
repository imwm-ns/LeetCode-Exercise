import java.util.HashMap;

class MyCalendars {
    HashMap<Integer, Integer> calendar;
    public MyCalendars() {
        calendar = new HashMap<>();
    }

    public boolean book(int start, int end) {
        for (Integer val : calendar.keySet()) {
            if (val < end && calendar.get(val) > start) return false;
        }
        calendar.put(start, end);
        return true;
    }
}

public class MyCalendar {
    public static void main(String[] args) {
        MyCalendars myCalendar = new MyCalendars();
        myCalendar.book(10, 20); // return True
        myCalendar.book(15, 25); // return False, It can not be booked because time 15 is already booked by another event.
        myCalendar.book(20, 30); // return True, The event can be booked, as the first event takes every time less than 20, but not including 20.
    }
}
