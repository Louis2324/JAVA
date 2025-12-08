package I_O.Basic;

import java.io.*;

public class FileReaderWriter {
    public static void main(String[] args) throws IOException {

        // FileReader - read one character at a time
        FileReader reader = null;
        try {
            reader = new FileReader("I_O/Basic/source.txt");
            int data;
            while ((data = reader.read()) != -1) {  // Reads single character
                System.out.print((char) data);
            }
        } finally {
            if (reader != null) reader.close();
        }

        // FileWriter - write one character at a time
        FileWriter writer = null;
        try {
            writer = new FileWriter("dest.txt");
            String text = "Hello";
            for (int i = 0; i < text.length(); i++) {
                writer.write(text.charAt(i));  // Write single character
            }
        } finally {
            if (writer != null) writer.close();
        }
    }
}
