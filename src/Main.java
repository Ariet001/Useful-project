import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int a = 0;
        may(a);

    }
      public static void may(int a){
        Scanner sc = new Scanner(System.in);
    int num = sc.nextInt(), reversed = 0;
                while(num !=0)

    {
        int digit = num % 10;
        reversed = reversed * 10 + digit;
        num /= 10;
    }

                System.out.println(reversed);
      }
}


