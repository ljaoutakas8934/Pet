import java.util.ArrayList;
public class Kennel
{
    ArrayList<Pet> kennel;

    public Kennel (Pet [] petArray)
    {
        kennel = new ArrayList<>();
        for (Pet a : petArray)
        {
            kennel.add(a);
        }
    }

    public void allSpeak()
    {
        for (Pet a : kennel)
        {
            System.out.println(a.getMyName() + a.speak());
        }
    }
}
