package com.company;

public class Main {

    public static void main(String[] args) {
        double num[] = {-1.1, 1.2, 1.3, -1.4, 1.5, 1.6, -1.7, 1.8, 1.9, -2.1, 2.2, 2.3, -2.4, 2.5, 2.6};
        double result = 0.0;
        for (int i = 0; i < num.length ; i++) {
            if (num[i] < 0){

                continue;

            }
            for (double num2: num){
                result += num2;
            }
            System.out.println(result / num.length);
        }
    }
}