import java.util.Scanner;

public class Finobochi {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter number sequence: ");
        int input = scanner.nextInt();

//        The Rule is xn = xn−1 + xn−2
//
//        where:
//
//        xn is term number "n"
//        xn−1 is the previous term (n−1)
//        xn−2 is the term before that (n−2)
        int sum = 0;

        int array[] = new int[input + 3];
        array[0] = 0;
        array[1] =1;
        for (int i = 2; i<(input + 3); i++){

            array[i] = array[i -1] + array[i-2];
            sum = array[i];
            System.out.println("Number: " + (i-2) + " The sum of numbers is: " + array[i-2]);
        }
//        System.out.println("The sum of numbers = " + sum);
//
//        if(input%2 == 0){
//            System.out.println("Number is even");
//        }else {
//            System.out.println("Number is odd");
//        }

        int a =4;
        int b =5;
        System.out.println("a = " + a + " b = " + b);
        a = (a+b);
        b=a - b;
        a = a - b;
        System.out.println("b = " + b + " a = " + a);
    }
}
