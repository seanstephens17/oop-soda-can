package oop;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "\n*** SodaCan App ***" );
        App app = new App();
        app.start();
    }

    public void start() {
        SodaCan sc1 = new SodaCan( 10 , 5 );
        //TODO
        // See question P8.5


        System.out.println("SodaCan Height: " + SodaCan.getHeight());
        System.out.println("SodaCan Radius: " + SodaCan.getRadius());


    }
}
