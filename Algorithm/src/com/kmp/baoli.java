package com.kmp;

public class baoli {
    public static void main(String[] args) {
        String A = "abababaababacb";
        String B = "ababacb";



    }

    public static int bl(String A,String B){
        char[] A1 = A.toCharArray();
        char[] B1 = B.toCharArray();

        for (int i = 0; i < A1.length; i++) {
            for (int j = 0; j < B1.length; j++,i++) {
                if (A1[i] != B1[j]){
                    return -1;
                }
                if (j == B1.length){

                }

            }
        }

        return -1;

    }
}
