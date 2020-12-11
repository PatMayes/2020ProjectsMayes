import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class Universe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Universe
{
    static Scanner in = new Scanner(System.in);
    public static  void main(String[] args) throws InterruptedException 
    {
        List<Animal> animals = new ArrayList<Animal>();

        System.out.println("Welcome to Guess Who\n");
        System.out.print("Building Space Ships");
        delayDots();
        System.out.print("Populating Galxy");
        populateAnimals(animals);
        delayDots();
        

        System.out.println("\nask your first question");
        System.out.println("Type help to find out what you can do.\n");
        String text = in.nextLine();
        String msg = "";
        while(!text.equals("quit"))
        {
            switch(text)
            {
                case "help" : 
                msg = "So far we can ask if a Character has the following Name,Jedi,Droid,HumanLike,Wookie,DarkSide,LightSide,BountyHunter,Smuggler,KesselSpeed,Empire,Rebel,Resistance,FirstOrder,Separatist,GalacticRepublic,Ewok,Fluffy,Slimey,LightsaberColor,Tall,Short,Pilot,Annoying,Cute,BandersFav,GotButtWhooped,InsideATauntaun,StillLiving,LostALimb,SpaceBallsCharacter \n"+
                "and ask for help.";
                break;
                case "Name" : 
                msg = Name(Characters);
                break;
                case "look up" :
                msg = lookUp(Characters);
                break;
                case "look around" :
                msg = lookAround(Charcters);
                break;
                case "listen" :
                msg = listen(Characters);
                break;
                case "look down":
                msg = lookDown(Characters);
                break;
                case "find by name" : 
                msg = findName(Characters);
                break;
                case "find by desc":
                msg = findDesc(Characters);
                break;
                case "find by flying"
                msg=findFlyingFeature(Characters);
                break;
                default : msg = "You flail helplessly with indecision.";
            }
            System.out.println("\n" + msg);
            delayDots(3);
            System.out.println("What would you like to do?\n");
            text = in.nextLine();
        }
    }
    
    public static String findDesc(List<Characters> aList){
        String msg="";
        System.out.println("what is the Description");
        String descToLookUp= in.nextLine();
        for(Animal a: aList){
            if(a.getDesc().contains(descToLookUp)){
            msg +=a.getName()+"\n       "+ a.getDesc() +"\n";
            }
        }
        return msg;
    }
    public static String findFlyingFeature(List<Animal> aList){
        String msg="";
        System.out.println("How does this animal fly does it glide how does it fly");
        String FlyDescToLookUp= in.nextLine();
        for(Animal a: aList)
        {
           if(ainstancof Flying)
            {
             Flying f= (Flying) a;
            if (f.fly().contains(flyDescToLookUp)){
            msg +=a.getName()+"\n       "+ f.fly() +"\n";
            }}
        }
        return msg;
    }
    public static String findName(List<Characters> aList){
        String msg="";
        System.out.println("what is the name?");
        String nameToLookUp= in.nextLine();
        for(Animal a: aList){
            if(a.getName().equals(nameToLookUp)){
            msg +=a.getName()+"\n       "+ a.getDesc() +"\n";
            }
        }
        return msg;
    }
    
    public static String visitCages(List<Animal> animals)
    {
        String msg = "";
        for(Animal a : animals)
        {
            msg += a.getName() + ": \n       " + a.getDesc() + "\n";
        }
        return msg;
    }

    public static String listen(List<Animal> animals)
    {
        String msg = "";
        for(Animal a : animals)
        {
            msg += a.getName() + ": \n       " 
            + a.makeNoise() + "\n";
        }
        return msg;
    }
    
    public static String lookDown(List<Animal> animals)
    {
        String msg = "";

        for(Animal a : animals)
        {
            if(a instanceof swimming) 
            {
                swimming f = (swimming) a;
                msg += a.getName() + ": \n       " 
                + f.swim() + "\n";
            }
        }
        return msg;
    }
    
    public static String lookAround(List<Animal> animals)
    {
        String msg = "";

        for(Animal a : animals)
        {
            if(a instanceof Walk) 
            {
                Walk w = (Walk) a;
                msg += a.getName() + ": \n       " 
                + w.Walk() + "\n";
            }
        }
        return msg;

    }

    public static String lookUp(List<Animal> animals)
    {
        String msg = "";

        for(Animal a : animals)
        {
            if(a instanceof Flying) 
            {
                Flying f = (Flying) a;
                msg += a.getName() + ": \n       " 
                + f.fly() + "\n";
            }
        }
        return msg;

    }
    
    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    public static void delayDots(int dotAmount) throws InterruptedException 
    {
        for (int i=0; i<dotAmount; i++) {
            TimeUnit.SECONDS.sleep(1);
            System.out.print(".");
        }
        System.out.println();
    }

    /**
     * This prints an ellipses with 1 second between each period
     * It then moves to the next line.
     */
    public static void delayDots() throws InterruptedException 
    {
        delayDots(0);
    }

    /**
     * This is where we will all collaborate.
     * Construct your animal and add it to the List
     * @param animals the list containing all the zoo animals
     */
    public static void populateCharacters(List<Characters> Characters)
    {
        Characters.add(new Duck());
 
        
    }
}