import java.util.Scanner;

public class Menu
{
    int choice;
    MemoryPalaceManager mpm = new MemoryPalaceManager();

    Scanner scanner = new Scanner (System.in);

    public Menu ()
    {
        do
        {
            System.out.println("MENU");
            System.out.println("1. Create New Palace");
            System.out.println("2. Load Palace");
            System.out.println("3. Take Quiz");
            System.out.println("4. View Progress");
            System.out.println("5. Press 12 to EXIT");

            System.out.println("Enter your choice");
            choice = scanner.nextInt();

            switch(choice)
            {
                case 1:
                    mpm.createPalace();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 12:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
        }
        while (choice!=12);
    }
        public static void main (String args[])
        {
            Menu menu = new Menu ();
            if(menu.choice == 12)
                return;
        }

}