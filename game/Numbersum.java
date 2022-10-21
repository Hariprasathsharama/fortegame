import java.util.Scanner;

public class Numbersum {
   
    public static int getRandomInteger(int maximum, int minimum){
        return ((int) (Math.random()*(maximum - minimum))) + minimum;
    }
        public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int target=s.nextInt();
            System.out.println("First possibilty");
          
            while (true) {
                int firstNumber = (int)(getRandomInteger(1, 10));
                int secondNumber = (int)(getRandomInteger(1, 10));
                int thirdNumber= (int)(getRandomInteger(1, 10));
                int fourthNumber= (int)(getRandomInteger(1, 100));

                if (firstNumber + secondNumber + thirdNumber + fourthNumber == target){
                    System.out.println(firstNumber + " + " +secondNumber+ " + " +thirdNumber+ " + " +fourthNumber);
                    break;
                }
        }
        System.out.println("Second possibilty");
          
        while (true) {
            int firstNumber = (int)((Math.random())*101);
            int secondNumber = (int)((Math.random())*11);
            int thirdNumber= (int)((Math.random())*11);
            int fourthNumber= (int)((Math.random())*11);

            if (firstNumber + secondNumber + thirdNumber - fourthNumber == target){
                System.out.println(firstNumber + " + " +secondNumber+ " + " +thirdNumber+ " - " +fourthNumber);
                break;
            }
    }
    System.out.println("Third possibilty");
          
    while (true) {
        int firstNumber = (int)((Math.random())*101);
        int secondNumber = (int)((Math.random())*11);
        int thirdNumber= (int)((Math.random())*11);
        int fourthNumber= (int)((Math.random())*11);

        if (firstNumber + secondNumber - thirdNumber + fourthNumber == target){
            System.out.println(firstNumber + " + " +secondNumber+ " - " +thirdNumber+ " + " +fourthNumber);
            break;
        }
}

        }
    }