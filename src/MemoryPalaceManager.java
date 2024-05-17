import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemoryPalaceManager {

    private List<MemoryPalace> palace = new ArrayList<>();
    int counter = 0;
    Scanner scanner = new Scanner(System.in);
    private String choice;
    private MemoryPalace memoryPalace;

    public MemoryPalaceManager ()
    {

    }

    public void createPalace ()
    {
        System.out.println("YOU'RE CREATING A PALACE...");
        System.out.println();
        System.out.println("Enter Name of Palace:");
        String first = scanner.nextLine();

        memoryPalace = new MemoryPalace(first);
        palace.add(counter++, memoryPalace);

        System.out.println("YOU'RE NOW IN YOUR PALACE");

        if ((memoryPalace.getRooms()).isEmpty())
        {
            System.out.println("Wanna create your first room?");
            choice = scanner.nextLine();

            if (choice.equals("YES") || choice.equals("yes") || choice.equals("Yes"))
            {
                memoryPalace.addRoom();
            }

            if (choice.equals("NO") || choice.equals("no") || choice.equals("No"))
            {
                return;
            }
        }

        else
        {
            viewPalace();

            System.out.println("Wanna create another room?");
            choice = scanner.nextLine();

            if (choice.equals("YES") || choice.equals("yes") || choice.equals("Yes"))
            {
                memoryPalace.addRoom();
            }

            if (choice.equals("NO") || choice.equals("no") || choice.equals("No"))
            {
                viewPalace();
            }

            else
                System.out.println("Enter valid choice (yes/no)");
        }




    }

    public void viewPalace ()
    {
        System.out.println("YOU'RE VIEWING YOUR PALACE...");

        for(Room a: memoryPalace.getRooms())
        {
            System.out.println(a);
        }


    }
}
