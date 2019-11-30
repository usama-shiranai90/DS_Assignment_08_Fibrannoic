package Task;
public class Recursion {

    public void series_result(double number){

//        for (int i =1 ; i <= number ; i++){
//              int temp = Fibonacci( i);
//              System.out.print(temp+"  ");
//        }
        System.out.print("\nFibonacci Series Less then" + number + " are :\n ");
        int previous=1;
        for (int i = 1 ; i  <=number ;++i){
            System.out.print(i  +  "  ");
            int sum = previous +i  ;
            i = previous;
            previous =  sum;
            if (i >= number){
                break;
            }
        }
    }

    public int Fibonacci(double number){

        if ( ! (number <= 2 )){
            return (  Fibonacci(number-1) +Fibonacci(number-2)  ) ;
        }
        else
            return 1;
    }

    }

