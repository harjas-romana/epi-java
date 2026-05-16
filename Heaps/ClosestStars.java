package Heaps;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class ClosestStars {

    public static class Star implements Comparable<Star> {

        double x, y, z;

        Star(double x, double y, double z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public double distance() {
            return Math.sqrt(x * x + y * y + z * z);
        }

        @Override
        public int compareTo(Star rhs) {
            return Double.compare(rhs.distance(), this.distance());
        }
    }

    public static List<Star> closeStarsCode(Iterator<Star> sequence, int k) {

        PriorityQueue<Star> minHeap = new PriorityQueue<>();

        while (sequence.hasNext()) {

            minHeap.add(sequence.next());

            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        return new ArrayList<>(minHeap);
    }
}
