import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;


public class Magic8Ball {
    
    public static void main(String[] args) {

        System.out.println("Enter a question for the Magic 8-Ball...");

        String userQuestion = getUserQuestion();

        int randNumber = new Random().nextInt(4);

        if(randNumber == 0){
            System.out.println("Yes");
        }if (randNumber == 1){
            System.out.println("No");
        }if(randNumber == 2){
            System.out.println("Never in a million years...");
        }if(randNumber == 3){
            System.out.println("Perhaps...");
        }

    }
    /**
     * @return The user's response as a String
     */
    public static String getUserQuestion(){
        Scanner scanner = new Scanner(System.in);
        String question = scanner.nextLine();
        return question;
    }

}




