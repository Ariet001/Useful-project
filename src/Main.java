import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        may();
        may();
        may();
    }
    public static void may() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), reversed = 0;
        if (num>999 || num<-999) {
            System.out.println(0);
        }else{
            while (num != 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }
            System.out.println(reversed);
        }
    }
}