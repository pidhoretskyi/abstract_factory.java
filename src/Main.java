import Factories.EasyFactory;
import Factories.GUIFactory;
import Factories.HardFactory;
import Factories.MiddleFactory;
import Bird.Bird;
import ScrollHandler.ScrollHandler;

import java.util.Scanner;

/**
 * Created by pidho on 02.04.2018.
 */
public class Main {
    public static void main(String [] args){
        System.out.print("Program started!\n");
        Scanner in = new Scanner(System.in);
        String choise;
        do {
            System.out.print("Please, choose difficulty level(hard, middle, easy):");
            choise = in.nextLine();
            GUIFactory factory;
            if (choise.compareTo("hard") == 0) {
                factory = new HardFactory();
            } else if (choise.compareTo("middle") == 0) {
                factory = new MiddleFactory();
            } else if (choise.compareTo("easy") == 0) {
                factory = new EasyFactory();
            } else {
                System.out.print("Wrong parameter, try again.");
                return;
            }
            Bird bird = factory.createBird(5, 10, 3, 3);
            ScrollHandler scroller = factory.createScrollHandler();
            System.out.print("Created bird level: ");
            System.out.print(bird.getBirdClass());
            System.out.print("\nCreated ScrollHandler level: ");
            System.out.print(scroller.getScrollHandlerClass());
            System.out.print("\nDo you want to try again? (y-yes, n-no): ");
            choise = in.nextLine();
            if(choise.compareTo("y")!=0){
                break;
            }
        }while(true);

    }
}
