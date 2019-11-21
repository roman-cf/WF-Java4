import java.util.Scanner;

public class ClassworkDay4 {
    public static void main(String[] args) {
        // A1
        for(int i = 1; i < 101; i++){
            System.out.println(i);
        }

        // A2
        for(int i = 2; i < 100;){
            System.out.println(i);
            i=i+2;
        }

        // A3
        Scanner sa3 = new Scanner(System.in);
        System.out.print("Enter two numbers with space between: ");
        String twoNumbers = sa3.nextLine();
        int indexDiv = twoNumbers.indexOf(" ");
        int numberOne = Integer.parseInt(twoNumbers.substring(0,indexDiv));
        int numberTwo = Integer.parseInt(twoNumbers.substring(indexDiv+1));

        if (numberOne<numberTwo){
            if(numberOne % 2 == 0){
                evenCounter(numberOne+2,numberTwo);
            }else{
                evenCounter(numberOne+3,numberTwo);
            }
        }else {
            if(numberOne % 2 == 0){
                evenCounter(numberTwo+2,numberOne);
            }else{
                evenCounter(numberTwo+3,numberOne);
            }
        }

        // A4
        Scanner sa4 = new Scanner(System.in);
        System.out.println("Enter the end of a sum starting with 1: ");
        int nInt = Integer.parseInt(sa4.nextLine());
        int sum=0;
        for(int i = 1; i<nInt+1; i++){
            System.out.println(sum + " + " + i + " = " + (sum+i));
            sum = sum + i;
        }
        System.out.println(sum);


    }

    //methode for A3
    public static void evenCounter(int start, int end){
        for(int i = start; i< end; i = i+2){
            System.out.println(i);
        }
    }
}
