import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassworkDay4 {
    public static int kcal;
    public static <Int> void main(String[] args) throws NoSuchMethodException {
        // A1
        for(int i = 1; i < 101; i++){
            System.out.println(i);
        }

        // A2
        for(int i = 2; i < 100;){
            System.out.println(i);
            i=i+2;
        }
/*
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
                evenCounter(numberOne+1,numberTwo);
            }
        }else {
            if(numberOne % 2 == 0){
                evenCounter(numberTwo+2,numberOne);
            }else{
                evenCounter(numberTwo+1,numberOne);
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

        // A5
        String[] myArray = {"3","5","34","8","27","54","9","23","9","0"};
        Scanner sa5 = new Scanner(System.in);
        System.out.println("Enter a Number and the Computer will say if it's in the array or not: ");
        String searchN = sa5.nextLine();
        for(int i = 0; i < myArray.length;){

            if(myArray[i].equals(searchN)){
                System.out.println("Found your number "+ searchN + " on index "+ i);
                break;
            }else{
                i++;
                if(i== myArray.length-1){
                    System.out.println("Sorry, nothing forund");
                    break;
                }
            }
        }
        // A6
        int[] myArray2 = new int[10];
        for(int i = 0; i < 10; i++){
            myArray2[i] = i+(1*10);
        }
        for(int j = 0;j < myArray2.length; j++){
            System.out.println(myArray2[j]);
        }

        // A7
        int[] myArray7 = new int[10];
        Scanner sa7 = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            System.out.print("Enter Integer #"+i+" for filling the array:");
            myArray7[i] = Integer.parseInt(sa7.nextLine());
        }

        for(int r = 9; r > -1; r--){
            System.out.print(myArray7[r]+", ");

        } */
        // A8
        String[] meals = {"BREAKFAST","LUNCH","DINNER"};
        int[][] mealNamesArr = new int[3][];
        String[] foodPortion = {"1dl  milk", "1 slice of bread", "100 gr chicken breast", "200gr salad"};
        int[] kcalPerPortion = {62, 74, 165, 33};

        int[] breakfast = {2,3,0,0};
        int[] lunch = {0,1,2,1};
        int[] dinner = {2,3,0,0};
        mealNamesArr[0]= breakfast;
        mealNamesArr[1]= lunch;
        mealNamesArr[2]= dinner;

        for (int m = 0; m < meals.length; m++){
            kcal = 0;
            System.out.println(meals[m]);
            mealList(mealNamesArr[m], foodPortion, kcalPerPortion);
            System.out.println("kcal for this meal: "+ kcal);
        }
    }

    //methode for A8
    public  static void mealList(int[] mealType, String[] fP, int[] kcalPP){
        for(int i = 0; i < mealType.length; i++){
            if (mealType[i] != 0){
                System.out.println(mealType[i]+"x "+fP[i]);
                kcal = kcal + kcalPP[i];
            }
        }
    }

    //methode for A3
    public static void evenCounter(int start, int end){
        for(int i = start; i< end; i = i+2){
            System.out.println(i);
        }
    }

}
