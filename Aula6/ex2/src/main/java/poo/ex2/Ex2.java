package poo.ex2;

import static java.lang.Math.pow;


public class Ex2 {

    public static void main(String[] args) {
        double total = 0;
        for (int i = 0; i < 64; i++){
            total += pow(2,i);
        }
        System.out.println(total);
    }
}
