import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    public void testEquilateral() {
        assertEquals("Tam giac deu", Triangle.getTriangle(5, 5, 5));
    }

    @Test
    public void testIsosceles() {
        assertEquals("Tam giac can", Triangle.getTriangle(5, 5, 7));
    }

    @Test
    public void testScalene() {
        assertEquals("Tam giac thuong", Triangle.getTriangle(6, 7, 8));
    }

    @Test
    public void testNotTriangle() {
        assertEquals("Khong phai tam giac", Triangle.getTriangle(1, 2, 3));
    }
}
