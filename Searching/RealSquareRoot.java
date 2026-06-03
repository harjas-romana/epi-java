package Searching;

public class RealSquareRoot {

    public static double squareRoot(double x) {
        // Setup boundaries based on the Zero-to-One trap
        double left = x < 1.0 ? 0.0 : 1.0;
        double right = x < 1.0 ? 1.0 : x;

        // Define our precision tolerance (10^-6)
        double tolerance = 0.000001;

        // QUESTION 1: What is the condition to keep shrinking the window?
        while ((right - left) > tolerance) {

            // QUESTION 2: Calculate the midpoint
            double mid = left + ((right - left) / 2);
            double midSquared = mid * mid;

            // QUESTION 3: What condition means our guess is too small?
            if (midSquared < x) {
                left = mid; // Steer right
            } else {
                right = mid; // Steer left
            }
        }

        // QUESTION 4: What do we return when the window is small enough?
        return left;
    }
}
