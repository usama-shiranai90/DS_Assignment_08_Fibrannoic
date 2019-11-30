package Task;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Recursion testing = new Recursion();
        System.out.println("Enter number upto which Fibonacci series : ");
        double number = new Scanner(System.in).nextDouble();
        System.out.println("Fibonacci series upto " + number + " numbers : ");
        testing.series_result(number);



    }

}





    // 1 2 3 5 8 13 ....

//    public static void fibrannoic(int number){
//        int temp  =1 ;
//        for (int i  =1; i <= number ; i++){
//            System.out.print(i + "  ");
//           int sum   = i+ temp; // 4
//           i = temp ;// 2
//           temp = sum; // 4
//
//        }



