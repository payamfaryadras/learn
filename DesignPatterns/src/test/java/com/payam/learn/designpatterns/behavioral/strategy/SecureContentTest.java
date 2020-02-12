package com.payam.learn.designpatterns.behavioral.strategy;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.Md5Crypt;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import static org.junit.Assert.*;

public class SecureContentTest {

    private SecureContent  secureContent;
    private static final String content="p@ssword";
    @Before
    public void setUp()  {

        secureContent  = new SecureContent(content);
    }

    @Test
    public void CONTENT_HASH_BY_MD5(){

        Assert.assertEquals( DigestUtils.md5Hex(content)
                , Hex.encodeHexString(secureContent.hashContent(new MD5Hash())));
    }
    @Test
    public void CONTENT_HASH_BY_SHA256(){
        Assert.assertEquals( DigestUtils.sha256Hex(content)
                , Hex.encodeHexString(secureContent.hashContent(new SHA256())));
    }
    @Test(expected = java.lang.NullPointerException.class)
    public void GET_ERROR_WHEN_CONTENT_IS_NULL(){
        secureContent  = new SecureContent(null);

    }
}