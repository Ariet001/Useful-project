import java.util.Scanner;

class Main {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt(), reversed = 0;
                while(num != 0) {
                    int digit = num % 10;
                    reversed = reversed * 10 + digit;
                    num /= 10;
                }

                System.out.println(reversed);
            }
        }

