import java.util.*;
class Main{
    float n1;
    float n2;
    int choice;
    int s=0;
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your numbers:");
        n1=sc.nextFloat();
        n2=sc.nextFloat();
        System.out.println("What do you want to do? '1' for addition, '2' for subtraction, '3' for multiplication, '4' for division, '5' for perfect number of two, '6' for the power of n1 raised to n2");
        choice=sc.nextInt();

    }
    public void compute() {
        switch (choice) {
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                System.out.println(n1 / n2);
                break;
            case 5:
                for (int i = 1; i <= n1; i++) {
                    if (n1 % i == 0) {
                        s = s + i;
                    }
                }
                        if (s == n1) {
                            System.out.println(n1 + " is perfect.");
                        }
                    else {
                        System.out.println(n1 + " is not perfect.");
                    }
                for (int j = 1; j <= n2; j++) {
                    if (n2 % j == 0) {
                        s = s + j;
                    }
                }
                if (s == n2) {
                    System.out.println(n2 + " is perfect.");
                }
                else {
                    System.out.println(n2 + " is not perfect.");
                }


                break;
            case 6:
                System.out.println(Math.pow(n1,n2));
                break;
            default:
                System.out.println("Please enter properly.");

        }


    }
    public static void main(String [] Args){
        Main m1=new Main();
        m1.input();
        m1.compute();
    }

}
