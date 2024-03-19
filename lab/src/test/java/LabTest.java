import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LabTest {
    Lab lab;
    @Before
    public void setUp(){
        lab = new Lab();
    }
    /**
     * Message should not contain any 3-letter combinations from the original message.
     */
    @Test
    public void encryptTest1(){
        String original = "encrypt";
        String encrypted = lab.encrypt(original);
        for(int i = 0; i < original.length()-3; i++){
            String fragment = original.substring(i, i+3);
            if(encrypted.contains(fragment)){
                Assert.fail();
            }
        }
    }
    /**
     * Message should not contain any 3-letter combinations from the original message.
     */
    @Test
    public void encryptTest2(){
        String original = "this message is encrypted";
        String encrypted = lab.encrypt(original);
        for(int i = 0; i < original.length()-3; i++){
            String fragment = original.substring(i, i+3);
            if(encrypted.contains(fragment)){
                Assert.fail();
            }
        }
    }
    /**
     * Message should not contain any 3-letter combinations from the original message.
     */
    @Test
    public void encryptTest3(){
        String original = "teds secret password";
        String encrypted = lab.encrypt(original);
        for(int i = 0; i < original.length()-3; i++){
            String fragment = original.substring(i, i+3);
            if(encrypted.contains(fragment)){
                Assert.fail();
            }
        }
    }
    /**
     * Message should decrypt to the original message
     */
    @Test
    public void decryptTest1(){
        String original = "encrypt";
        String encrypted = lab.encrypt(original);
        String decrypted = lab.decrypt(encrypted);
        Assert.assertEquals(original, decrypted);
    }
    /**
     * Message should decrypt to the original message
     */
    @Test
    public void decryptTest2(){
        String original = "this message is encrypted";
        String encrypted = lab.encrypt(original);
        String decrypted = lab.decrypt(encrypted);
        Assert.assertEquals(original, decrypted);
    }
    /**
     * Message should decrypt to the original message
     */
    @Test
    public void decryptTest3(){
        String original = "teds secret password";
        String encrypted = lab.encrypt(original);
        String decrypted = lab.decrypt(encrypted);
        Assert.assertEquals(original, decrypted);
    }
}
