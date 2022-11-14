import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a = 0;
        may(a);
        may(a);
        may(a);
    }

    public static void may(int a) {
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




