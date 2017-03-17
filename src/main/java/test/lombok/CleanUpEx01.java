package test.lombok;

import lombok.Cleanup;

import java.io.*;

/**
 * Created by kruart on 17.03.2017.
 *
 * @Cleanup: It is a easy way to cleanup the resources.
 * It actually ensures, the resources close() method will be called in finally block of try.
 * Only Local variable :
 * Calling close method for resources. if you have another method name, then call you need value=thatMehtodName (like exit)
 * No need try catch.
 */
public class CleanUpEx01 {
    public static void main(String[] args) throws IOException {
        //Program arguments: D:\t.txt  D:\tt.txt
        @Cleanup InputStream in = new FileInputStream(args[0]);
        @Cleanup OutputStream out = new FileOutputStream(args[1]);
        byte[] b = new byte[10000];
        int r;
        while ((r = in.read(b)) != -1) {
            out.write(b, 0, r);
        }
    }
}
