import helpers.Helper;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class Main {
    public static void main(String[] args) {
        int width = 215;
        String newText = "";


//        URL url = Main.class.getResource("lycris.txt");
//        String fileText = Helper.readFromFile(url.getPath());

        String filePath = "/Users/ellay/Desktop/lycris.txt";
        String fileText = Helper.readFromFile(filePath);


        String[] text = fileText.split("\n");


        if (checkSize(text, width)) {
            for (String t : text) {
                newText = newText + Helper.getNewLine(t, width) + "\n";
            }

            System.out.print(newText);
        } else {
            System.out.print("Text has a line or more which is/are wider than your width\nChange width parameter or text");
        }
    }

    private static boolean checkSize(String[] text, int width) {
        int maxSize = 0;
        for (String t : text) {
            if (maxSize < t.length()) {
                maxSize = t.length();
            }
        }

        return maxSize <= width;
    }

}



