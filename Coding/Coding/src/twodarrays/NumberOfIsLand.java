package twodarrays;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

public class NumberOfIsLand {
    public static void main(String[] args) {
        ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "SET");
        Map<String, String> env = pb.environment();
        env.put("SATYAM_CHAURASIA", "123456789");
        Process p = null;
        try {
            p = pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        InputStreamReader isr = new InputStreamReader(p.getInputStream());
        char[] buf = new char[1024];
        while (true) {
            try {
                if (!!isr.ready()) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            ;
        }
        while (true) {
            try {
                if (!(isr.read(buf) != -1)) break;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(buf);
        }
    }
}
