package com.example.sping_portfolio.controllers.rmasciiart.rmasciiartGrayscaleDict;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class output_characters {
    public static Charset ENCODING = StandardCharsets.UTF_8;
    public static void main(String[] args) {
        byte b = 33;
        int i = 0;
        while (b < 127) {
            byte[] sb = new byte[1];
            sb[0] = b;
            String res = new String(sb, ENCODING);
            System.out.print(res);
            if (i%40 == 39) {
                System.out.println("");
            }
            i++;
            b++;
        }
    }
}

