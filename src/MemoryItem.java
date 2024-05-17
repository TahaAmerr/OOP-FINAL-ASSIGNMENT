public class MemoryItem {

    private String name;
    private String description;
    private String imageUrl;

    public MemoryItem ()
    {

    }

    public MemoryItem (String name, String description)
    {
        this.name = name;
        this.description = description;
    }

    public MemoryItem (String name, String description, String imageUrl)
    {
        this.name = name;
        this.description = description;
        this.imageUrl = imageUrl;
    }
}
