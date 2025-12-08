package I_O.Buffers;

import java.io.*;

public class BufferedIOStream {
    public static void main(String[] args) throws IOException {

        // BufferedInputStream - reads chunks of bytes
        BufferedInputStream in = null;
        try {
            in = new BufferedInputStream(new FileInputStream("I_O/Buffers/source.txt"));
            int data;
            while ((data = in.read()) != -1) {  // Reads from buffer
                System.out.print((char) data);
            }
        } finally {
            if (in != null) in.close();
        }

        // BufferedOutputStream - writes chunks of bytes
        BufferedOutputStream out = null;
        try {
            out = new BufferedOutputStream(new FileOutputStream("dest.txt"));
            String text = "Hello";
            for (int i = 0; i < text.length(); i++) {
                out.write(text.charAt(i));  // Writes to buffer
            }
        } finally {
            if (out != null) out.close();  // Flushes buffer on close
        }
    }
}


