package I_O.Basic;

import java.io.*;

public class IOStream {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        try {
            in = new FileInputStream("I_O/Basic/source.txt");
            int data;
            while ((data = in.read()) != -1) {
                System.out.print((char) data);
            }
        } finally {
            if (in != null) in.close();
        }

        // OutputStream - write one byte at a time
        FileOutputStream out = null;
        try {
            out = new FileOutputStream("dest.txt");
            String text = "Hello";
            for (int i = 0; i < text.length(); i++) {
                out.write(text.charAt(i));  // Write single byte
            }
        } finally {
            if (out != null) out.close();
        }
    }
}

