import helpers.Drawler;
import helpers.SpacesAdder;

public class Main
{
    public static void main(String[] args)
    {
        int x = 125, y = 20;
        String text = new String();
        String newText = new String();

        text = "Wouldn't it be nice to take a walk on some pure white sand,";
        String text2 = "gaze at the horizon without living in fear?";

        newText = newText + SpacesAdder.getNewLine(text, x) + "\n";
        newText = newText + SpacesAdder.getNewLine(text2, x);

        System.out.print(newText);

    }
}



