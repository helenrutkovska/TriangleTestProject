import org.junit.Assert;
import org.junit.Test;


public class TriangleTestProject {
    public static String expected = "The sides of a triangle cannot be equal or less then 0";

    @Test
    public void trianglePositiveTest() throws Exception {
        Assert.assertTrue(TriangleMeasurements.checkSides(5, 3, 6));
    }

    @Test
    public void triangleEqualSidesPositiveTest() throws Exception {
        Assert.assertTrue(TriangleMeasurements.checkSides(3, 3, 3));
    }

    @Test
    public void triangle2SidesEqualNegativeTest() {
        try {
            Assert.assertFalse(TriangleMeasurements.checkSides(1, 1, 2));
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void triangleSideZeroNegativeTest() {
        try {
            TriangleMeasurements.checkSides(0, 5, 7);
        } catch (Exception e) {
            String actual = e.getMessage();
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void triangleAllSidesZeroNegativeTest() {
        try {
            TriangleMeasurements.checkSides(0, 0, 0);
        } catch (Exception e) {
            String actual = e.getMessage();
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void triangleNegativeSideNegativeTest() {
        try {
            TriangleMeasurements.checkSides(3, 3, -5);
        } catch (Exception e) {
            String actual = e.getMessage();
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void triangleAllNegativeSidesNegativeTest() {
        try {
            TriangleMeasurements.checkSides(-5, -6, -12);
        } catch (Exception e) {
            String actual = e.getMessage();
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void triangleNegativeSideZeroSideNegativeTest() {
        try {
            TriangleMeasurements.checkSides(0, -15, -25);
        } catch (Exception e) {
            String actual = e.getMessage();
            Assert.assertEquals(expected, actual);
        }
    }
}
