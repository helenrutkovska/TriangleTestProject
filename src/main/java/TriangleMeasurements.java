public class TriangleMeasurements {
    public static boolean checkSides(int a, int b, int c) throws Exception {
        if ((a > 0) && (b > 0) && (c > 0)) {
            return ((a + b > c) && (a + c > b) && (b + c > a));
        } else {
            throw new Exception("The sides of a triangle cannot be equal or less then 0");
        }
    }
    public static double measureTriangleSquare(int a, int b, int c) {
        int x = (a + b + c) / 2;
        double S = Math.sqrt(x*(x-a)*(x-b)*(x-c));
        return S;
    }
}
