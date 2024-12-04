import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Operating System");
        Scanner scanner = new Scanner(System.in);
        String os = scanner.nextLine();
        scanner.close();

        Ifactory factory = GUIFactory.createFactory(os);

        if(factory != null){
            IButton button = factory.createButton();
            button.press();

            ITextBox textBox = factory.createTextBox();
            textBox.setText();
        }
    }
}