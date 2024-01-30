public class OverLoading {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        double x = 1.2;
        double y = 4.0;
        int result1 = minfun(a, b, c);
        double result2 = minfun(x, y);

        System.out.println("Min = " + result1);
        System.out.println("Min = " + result2);
    }

    public static int minfun(int n1, int n2, int n3) {
        int min;
        int temp = n1 < n2 ? n1: n2;
        min = n3 < temp ? n3 : temp;
        return min;
    }

    public static double minfun(double n1, double n2) {
        double min;
        if (n1 > n2)
            min = n2;
        else
            min = n1;
       return min;
    }
}