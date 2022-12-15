import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 9");
        int number = input.nextInt();

        while (!(number >= 0 && number <= 9)) {
            System.err.println("Invalid entry, please re-enter");
            System.err.println("Please enter a number between 0 and 9");
            number = input.nextInt();
        }
        numberToWords(number);
    }


    public static void numberToWords(int number) {

        String numberToWords = "";

        if (number >= 0 && number <= 9) {

            numberToWords = (number == 0) ? "zero" : (number == 1) ? "one" : (number == 2) ? "two" : (number == 3) ? "three" : (number == 4) ? "four" : (number == 5) ? "five" : (number == 6) ? "six" : (number == 7) ? "seven" : (number == 8) ? "eight" : "nine";

        } else {
            numberToWords = "Invalid";
        }
        System.out.println(numberToWords);
    }

}
