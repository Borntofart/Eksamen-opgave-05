import java.util.ArrayList;

public class menu {

    private TextUI ui = new TextUI();
    private MessagesApp app = new MessagesApp();

    public void start() {
        boolean running = true;

        while (running) {
            System.out.println();
            System.out.println("-Menu-");
            System.out.println("1. tilføj besked");
            System.out.println("2. se beskeder");
            System.out.println("3. afslut");

            String valg = ui.promptText ("Vælg: ");

            switch (valg) {
                case "1":
                    String besked = ui.promptText("Skriv din besked: ");
                    app.add(besked);
                    break;
                case "2":
                    ArrayList<String> alle = app.listAllMessages();
                    int i = 0;
                    while (i < alle.size()) {
                        System.out.println(alle.get(i));
                        i++;
                    }
                    break;
                case "3":
                    running = false;
                    break;
            }
        }
    }





}
