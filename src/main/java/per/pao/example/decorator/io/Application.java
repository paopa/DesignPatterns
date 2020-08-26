package per.pao.example.decorator.io;

import per.pao.example.decorator.io.simple.LowerCaseInputStream;

import java.io.*;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        demo();
    }

    private static void demo() {
        int c;
        try (InputStream in = generateLowerCaseStream("DJ drop the BEAT!!!")) {

            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static InputStream generateLowerCaseStream(String s) {
        return new LowerCaseInputStream(new BufferedInputStream(new StringBufferInputStream(s)));
    }
}
