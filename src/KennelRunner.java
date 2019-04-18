public class KennelRunner
{

    public static void main(String [] args)
    {
        Cat c = new Cat( "c ");
        Dog d= new Dog("d ");
        LoudDog ld= new LoudDog("1d ");

        Pet [] pa = {c,d,ld};
        Kennel Pa = new Kennel (pa);
        Pa.allSpeak();
    }

}
