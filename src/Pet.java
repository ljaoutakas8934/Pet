public abstract class Pet
{
    private String myName;
    public Pet (String name)
    {
        this.myName = name;
    }
    public String getMyName()
    {
        return this.myName;
    }

    public abstract String speak();

}
