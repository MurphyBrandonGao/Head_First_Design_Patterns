package Java_IO;

import java.io.*;

/**
 * @author Dell
 * @create 2019-05-19 11:04
 */
public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("test.txt")
                )
        );

        while ((c = in.read()) >= 0) {
            System.out.println(c);
        }

        in.close();
    }
}
