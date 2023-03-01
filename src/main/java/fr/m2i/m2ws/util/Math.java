package fr.m2i.m2ws.util;

public class Math {
    public static int add(int n1, int n2) {
        return n1+n2;
    }
    public static int sub(int n1, int n2) {
        return n1-n2;
    }
    public static int mult(int n1, int n2) {
        return n1*n2;
    }
    public static float div(int n1, int n2) {
        return (float) n1/ (float) n2;
    }

    public static int fact(int n) {
        return n <= 1 ? 1 : n * fact(n-1);
    }
}
