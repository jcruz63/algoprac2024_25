package algoexpert.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarCipherEncryptorTest {

    @Test
    public void testCase1(){
        String sample = "xyz";
        String encrpted = "zab";
        int key = 2;

        assertEquals(encrpted, CaesarCipherEncryptor.caesarCypherEncryptor(sample, key));
    }

    @Test
    public void testCase2(){
        String sample = "ovmqkwtujqmfkao";
        String encrpted = "ovmqkwtujqmfkao";
        int key = 52;

        assertEquals(encrpted, CaesarCipherEncryptor.caesarCypherEncryptor(sample, key));
    }


}