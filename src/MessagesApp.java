import java.util.ArrayList;

public class MessagesApp {
    //opretter arrayliste
    ArrayList<String> messages = new ArrayList<>();


    //metoder
    public void add(String message) {
        messages.add(message);
    }

    public ArrayList<String> listAllMessages() {
        return messages;
    }

}
