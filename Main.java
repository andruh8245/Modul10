import java.io.*;
import java.nio.charset.Charset;

public class Main {

    public static void main(String[] args) throws IOException {
        copyfile();
    }

    private static void copyfile () throws IOException {

        Reader fr = new FileReader("1.txt", Charset.forName("utf-8"));
        Writer fw = new FileWriter("2.txt", Charset.forName("utf-8"));

        char[] buffer = new char[1024];
        int length;

        while((length = fr.read(buffer)) > 0 ) {

            String word = new String(buffer);
            StringBuilder sb = new StringBuilder(word.subSequence(0,length));
            sb.reverse();
            fw.write(sb.toString().toCharArray(),0,length);

        }

        fr.close();
        fw.close();

    }
}
