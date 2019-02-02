package helpers;

public class SpacesAdder
{
   // public static void addSpaces(String)

    public static String getNewLine(String text, int size)
    {
        String newText = new String();
        int length = text.length();
        int spaces = (size - length)/2;

        for(int i=0;i<spaces;i++)
        {
            newText = newText + " ";
        }
        newText = newText + text;

        return newText;
    }

}
