package Java_IO;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Dell
 * @create 2019-05-19 10:51
 */
public class LowerCaseInputStream extends FilterInputStream {

    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c : Character.toLowerCase(c));
    }

    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len);
        for (int i = 0; i < offset + result; i++) {
            b[i] = (byte) Character.toLowerCase(b[i]);
        }
        return result;
    }
}
