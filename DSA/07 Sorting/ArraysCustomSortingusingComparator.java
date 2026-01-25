import java.util.*;

// A class to represent a point
class Point {
    int x, y;
    Point(int i, int j) {
        x = i;
        y = j;
    }
}

// Custom Comparator to sort by x value
class MySort implements Comparator<Point> {
    public int compare(Point a, Point b) {
        return a.x - b.x;
    }
}

// Main driver class (must be public and match file name)
public class ArraysCustomSortingusingComparator {
    public static void main(String[] args) {
        Point[] arr = {
                new Point(10, 20),
                new Point(3, 12),
                new Point(5, 7)
        };

        Arrays.sort(arr, new MySort());

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].x + " " + arr[i].y);
        }
    }
}
