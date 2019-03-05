package com.niu.microcloud.config;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * Created by ami on 2019/3/5.
 */
public class TestHeader {

    public static void main(String[] args) {
        String auth = "mldnjava:hello";
        byte[] encode = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader = "Basic" + new String(encode);
        System.out.println(encode);
        System.out.println(new String(encode));
        System.out.println(authHeader);
    }
}
