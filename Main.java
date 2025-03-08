import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        int inputNumber = scn.nextInt();

        System.out.println(inputNumber + " sayısı ASAL" + (primeNumberFounder(inputNumber,inputNumber/2) ? "DIR" : " DEĞİLDİR"));
    }

    static boolean primeNumberFounder(int number, int divisor) {
        if (number < 2) {
            return false;
        }
        if (divisor == 1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return primeNumberFounder(number, divisor - 1);
    }
}

