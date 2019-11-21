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
                System.out.println("gerade");
            }
        }

        System.out.println(numberOne);
        System.out.println(numberTwo);

    }
}
