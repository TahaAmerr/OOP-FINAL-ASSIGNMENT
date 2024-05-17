import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class MemoryPalace {

    private List<Room> rooms = new ArrayList<>();
    private String name = new String();
    private Scanner scanner = new Scanner(System.in);
    private String choice;
    private String choice1;
    private String choice2;
    private String choice3;
    private int counter = 0;
    private int index = 0;
    private Room room;

    public MemoryPalace (String name)
    {
        this.name = name;
    }
    public MemoryPalace ()
    {

    }

    public void addRoom ()
    {
        System.out.println("YOU'RE CREATING A ROOM...");
        System.out.println();
        System.out.println("Enter name:");
        String first = scanner.nextLine();

        System.out.println("Enter description:");
        String second = scanner.nextLine();

        room = new Room(first, second);
        
        rooms.add(counter++, room);

        viewRooms();



    }

    public void viewRooms()
    {
        for (Room a: rooms)
        System.out.println(a);

        System.out.println("Want to open any room's door?");
        choice = scanner.nextLine();

        if (choice.equals("YES") || choice.equals("yes") || choice.equals("Yes"))
        {
            System.out.println("Enter name of room:");
            choice1 = scanner.nextLine();

            for (Room b: rooms) {
                if (((rooms.get(index++)).getName()).equals(choice1)) {

                    System.out.println("Opening the door...");

                    if ((room.getItems()).isEmpty())
                    {
                        System.out.println("Wanna create your first memory item?");
                        choice2 = scanner.nextLine();

                        if (choice2.equals("YES") || choice2.equals("yes") || choice2.equals("Yes"))
                        {
                            room.addMemoryItem();
                        }

                        if (choice2.equals("NO") || choice2.equals("no") || choice2.equals("No"))
                        {
                            return;
                        }
                    }

                    else
                    {
                        room.viewItems();

                        System.out.println("Wanna create another Memory item?");
                        choice3 = scanner.nextLine();

                        if (choice3.equals("YES") || choice3.equals("yes") || choice3.equals("Yes"))
                        {
                            room.addMemoryItem();
                        }

                        if (choice3.equals("NO") || choice3.equals("no") || choice3.equals("No"))
                        {
                            room.viewItems();
                        }

                        else
                            System.out.println("Enter valid choice (yes/no)");
                    }

                    room.addMemoryItem();

                }
            }
            }

        if (choice.equals("NO") || choice.equals("no") || choice.equals("No"))
        {
            return;
        }
        }

    public String getName() {
        return name;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}


