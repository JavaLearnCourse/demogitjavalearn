package org;

public class Test {


    public static void main(String[] args) {

    }


    public double methodSum(int a, int b){
        return  (a + b) / 2.0;
    }

    public  void sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
