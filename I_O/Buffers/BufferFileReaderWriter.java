package I_O.Buffers;

import java.io.*;

public class BufferFileReaderWriter {
    public static void main(String[] args) throws IOException {

        // BufferedReader - reads chunks of characters
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("I_O/Buffers/source.txt"));
            String line;
            while ((line = reader.readLine()) != null) {  // Reads whole line
                System.out.println(line);
            }
        } finally {
            if (reader != null) reader.close();
        }

        // BufferedWriter - writes chunks of characters
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("dest.txt"));
            String text = "Hello";
            writer.write(text);  // Writes entire string
        } finally {
            if (writer != null) writer.close();  // Flushes buffer on close
        }
    }
}

