import java.util.Scanner;

public class CoolGitHubTask {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);

        String input;

        System.out.println("Do you want me to say it? y or n? ");
        input = in.nextLine();

        if (input.equals ("y")) {
            System.out.println("Then i'll say it: THIS IS A COOL APP!");
        } else {
            System.out.println(" **** :( **** ");
        }
    }
}
