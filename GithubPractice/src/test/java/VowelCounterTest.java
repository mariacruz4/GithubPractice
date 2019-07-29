import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCounterTest {
    VowelCounter vowel;

    @Before
    public void setUp(){
        vowel = new VowelCounter();
    }

    @Test
    public void shouldCountVowels(){

        assertEquals(4, vowel.vowel("w3resources"));
        assertEquals(3, vowel.vowel("Maria"));
        assertEquals(3, vowel.vowel("Bootcamp"));
        assertEquals(2, vowel.vowel("Rose"));

    }

}
