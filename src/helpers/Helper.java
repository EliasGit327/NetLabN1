package helpers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Helper
{

    public static String getNewLine(String text, int size)
    {
        String newText = "";
        int length = text.length();
        int spaces = (size - length)/2;

        for(int i=0;i<spaces;i++)
        {
            newText = newText + " ";
        }
        newText = newText + text;

        return newText;
    }

    public static String readFromFile(String filePath)
    {
        StringBuilder contentBuilder = new StringBuilder();
        try (Stream<String> stream = Files.lines( Paths.get(filePath), StandardCharsets.UTF_8))
        {
            stream.forEach(s -> contentBuilder.append(s).append("\n"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return contentBuilder.toString();
    }

}
