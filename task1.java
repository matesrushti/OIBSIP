import java.util.Random;
import java.util.Scanner;

class numbergame {
    Random rand = new Random();
    private int acno, inp;
    private int noOf = 10;

    public numbergame() {
        acno = rand.nextInt(10);
    }

    public void takeUserInput(int input) {
        this.inp = input;
    }

    public String iscorrectnumber() {
        return "your choice is correct";
    }

    public void noOfguesses() {

        if (inp == acno) {
            System.out.println(iscorrectnumber());
        } else if (inp > acno) {
            System.out.println("Your guess is greater than expected No");
        } else {
            System.out.println("Your guess is less than expected no.");
        }

    }

}

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        numbergame g = new numbergame();
        System.out.println("lets play a game ,  GUESS THE NUMBER");
        System.out.println("you will get 10 chances to guess the number ");
        for (int i = 0; i < 10; i++) {
            int choice = sc.nextInt();
            g.takeUserInput(choice);
            g.noOfguesses();

        }
    }

}