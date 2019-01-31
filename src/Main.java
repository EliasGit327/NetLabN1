public class Main
{
    public static void main(String[] args)
    {
        int x = 100, y = 20, length, spaces;
        String text = new String();
        String newText = new String();

        text = "Wouldn't it be nice to take a walk on some pure white sand,";

        length = text.length();

        spaces = (x - length)/2;

        for(int i=0;i<spaces;i++)
        {
            newText = newText + " ";
        }
        newText = newText + text;

        System.out.println(spaces);
        System.out.print(newText);

    }
}
