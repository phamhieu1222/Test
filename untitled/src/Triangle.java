public class Triangle {
    public static String getTriangle(int a, int b, int c) {
        int[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        int x = sides[0], y = sides[1], z = sides[2];

        if (x + y <= z) {
            return "Khong phai tam giac";
        }

        if (x == y && y == z) {
            return "Tam giac deu";
        }
        if (x == y || y == z || x == z) {
            return "Tam giac can";
        }

        return "Tam giac thuong";
    }
}
