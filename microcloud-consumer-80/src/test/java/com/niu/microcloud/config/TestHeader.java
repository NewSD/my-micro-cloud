package com.niu.microcloud.config;

import org.junit.Test;

import java.nio.charset.Charset;
import java.util.Base64;

/**
 * Created by ami on 2019/3/5.
 */
public class TestHeader {

    @Test
    public void authTest() {
        String auth = "mldnjava:hello";
        byte[] encode = Base64.getEncoder().encode(auth.getBytes(Charset.forName("US-ASCII")));
        String authHeader = "Basic" + new String(encode);
        System.out.println(encode);
        System.out.println(new String(encode));
        System.out.println(authHeader);
    }
}
