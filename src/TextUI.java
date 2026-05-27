import java.util.Scanner;

public class TextUI {

    private Scanner scanner = new Scanner(System.in);
    private MessagesApp app = new MessagesApp();

    public String promptText(String msg) {
        System.out.println(msg);
        return scanner.nextLine();
    }




}
