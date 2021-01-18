package org;

public class Test {


    public static void main(String[] args) {
        sum(5);
    }

    /**
     * Calculates averrage
     * @param a int nmber
     * @param b number
     * @return
     */
    public double methodSum(int a, int b){
        return  (a + b) * 2.0;
    }

    public static void sum(int n){

        int sum3 = 0;
        for (int i = 1; i <= n; i++){
            sum3 += i;
        }
        System.out.println(sum3);
    }
}
