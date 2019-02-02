package helpers;

public class Drawler
{
    public static void draw()
    {
        int width = 72;
        int heigth = 20;

        for(int i=0; i<width; i++)
            System.out.print("#");

        for(int x = 0; x<heigth; x++)
        {
            System.out.println("");
            System.out.print("#");
            for (int i = 0; i < width-2; i++) {
                System.out.print(" ");
            }
            System.out.print("#");
        }
        System.out.println("");

        for(int i=0; i<width; i++)
            System.out.print("#");
    }
}
