package arrays_and_sorting.homework5;

public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(degree(2, 18));
        System.out.println(recDegree(2, 18));
    }

    public static int degree(int val, int deg) {
        int f = 1;
        for (int a = 1; a <= deg; a++) {
            f *= val;
        }
        return f;
    }

    public static int recDegree(int val, int deg) {
        if (deg == 1)
            return val;
        else
            return recDegree(val, deg - 1) * val;
    }
}
