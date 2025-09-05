import java.util.*;

class RecentCounter {
    Queue<Integer> q;

    public RecentCounter() {
        q = new LinkedList<>();
    }

    public int ping(int t) {
        q.add(t);  // add current request
        // remove all older requests outside [t-3000, t]
        while (q.peek() < t - 3000) {
            q.poll();
        }
        return q.size(); // remaining = recent requests
    }
}
