package org;

public class Test {


    public static void main(String[] args) {
        sum(5);
    }

    public static void sum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
