package java;

public class Singleton {
    private static Singleton setInstance;
    private Singleton(){}

    public static Singleton GetInstance()
    {
        if(setInstance == null) {
            synchronized(Singleton.class)
            {
                if(setInstance == null)
                    setInstance = new Singleton();
            }
        }
        return setInstance;
    }
}
