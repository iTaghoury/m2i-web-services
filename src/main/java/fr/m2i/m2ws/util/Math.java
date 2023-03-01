package fr.m2i.m2ws.util;

import fr.m2i.m2ws.exception.NegativeFactException;

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

    public static int fact(int n) throws NegativeFactException {
        if(n < 0) {
            throw new NegativeFactException("Pas de factorielle de nombre negatif");
        }
        return n <=1 ? 1 : n * fact(n-1);
    }
}
