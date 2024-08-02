package LeetCode;

public class Singleton {

    private static Singleton instance;

    private Singleton()
    {
        System.out.println("Restrict users to create objects");
    }

    public static Singleton getInstance()
    {
        if(instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}

class Test
{

    public static void main(String[] args) {
        Singleton single =Singleton.getInstance();
        Singleton single2 =Singleton.getInstance();
    }
}
