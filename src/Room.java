import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Room {

    private List<MemoryItem> items = new ArrayList<>();
    private String name;
    private String description;
    private Scanner scanner = new Scanner(System.in);
    private String choice;
    MemoryItem memoryItem;
    
    public Room ()
    {

    }

    public Room (String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public void addMemoryItem ()
    {
        System.out.println("YOU'RE CREATING A MEMORY ITEM...");
        System.out.println();
        System.out.println("Enter name:");
        String first = scanner.nextLine();

        System.out.println("Enter description:");
        String second = scanner.nextLine();

        System.out.println("ADD imageURL?");
        choice = scanner.nextLine();



        if (choice.equals("YES") || choice.equals("yes") || choice.equals("Yes"))
        {
            System.out.println("Enter imageUrl:");
            String third = scanner.nextLine();

            memoryItem = new MemoryItem(first, second, third);
        }

        if (choice.equals("NO") || choice.equals("no") || choice.equals("No"))
        {
            memoryItem = new MemoryItem(first, second);
        }

        else
            System.out.println("Enter valid choice (yes/no)");


    }

    public void viewItems ()
    {
        System.out.println("YOU'RE VIEWING YOUR MEMORY ITEMS...");

        for(MemoryItem a: items)
        {
            System.out.println(a);
        }
    }

    public List<MemoryItem> getItems() {
        return items;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public String getChoice() {
        return choice;
    }
}
