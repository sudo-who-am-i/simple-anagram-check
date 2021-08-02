import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void testEmptyArg1() {
        Assertions.assertFalse(Main.isAnagram2("", "asdddc"));
        Assertions.assertFalse(Main.isAnagram2(null, "asdddc"));
    }

    @Test
    public void testEmptyArg2() {
        Assertions.assertFalse(Main.isAnagram2("asdddc", ""));
        Assertions.assertFalse(Main.isAnagram2("asdddc", null));
    }

    @Test
    public void testOneSymbolString() {
        Assertions.assertTrue(Main.isAnagram2("a", "a"));
    }

    @Test
    public void testFirstStringIsShorter() {
        Assertions.assertFalse(Main.isAnagram2("a", "aaaa"));
    }

    @Test
    public void testSecondStringIsLonger() {
        Assertions.assertTrue(Main.isAnagram2("aaaaa", "a"));
    }

    @Test
    public void testCorrectInput() {
        Assertions.assertTrue(Main.isAnagram2("abcdf", "fdcba"));
    }

    @Test
    public void testCorrectInputRepeating() {
        Assertions.assertTrue(Main.isAnagram2("aaaabcc", "abacaca"));
    }

    @Test
    public void testCorrectInputRepeatingShorter() {
        Assertions.assertTrue(Main.isAnagram2("aaaabcc", "abac"));
    }

    @Test
    public void testCorrectInputSymbols() {
        Assertions.assertTrue(Main.isAnagram2("123=+", "1+2=3"));
    }

    @Test
    public void testCorrectComplexInput1() {
        var input1 = "William Shakespeare";
        var input2 = "I am a weakish speller";
        Assertions.assertTrue(Main.isAnagram2(input1, input2));
    }

    @Test
    public void testCorrectComplexInput2() {
        var input1 = "aaaaaacccccdeeeeeghiiiiiiillllmmnnnnnnnnnooooppqrrstttttuuuuu";
        var input2 = "Annulo cingitur, tenui, plano, nusquam coherente, ad eclipticam inclinato";
        Assertions.assertTrue(Main.isAnagram2(input1, input2));
    }

    @Test
    public void testIncorrectComplexInput1() {
        var input1 = "aaaaaacccccdeeeeeghiiiiiiillllmmnnnnnnnnnooooppqrrstttttuuuuu";
        var input2 = "Annulo cingitur, tenui, plano, nusquam coherente, ad eclipticam inclinatoo";
        Assertions.assertFalse(Main.isAnagram2(input1, input2));
    }

    @Test
    public void testIncorrectComplexInput2() {
        var input1 = "aaaaaacccccdeeeeeghiiiiiiillllmmnnnnnnnnnooooppqrrstttttuuuuu";
        var input2 = "Aannulo cingitur, tenui, plano, nusquam coherente, ad eclipticam inclinato";
        Assertions.assertFalse(Main.isAnagram2(input1, input2));
    }

    @Test
    public void testIncorrectComplexInput3() {
        var input1 = "aaaaaacccccdeeeeeghiiiiiiillllmmnnnnnnnnnooooppqrrstttttuuuuuz";
        var input2 = "Annulo cingitur, tenui, plano, nusquam coherente, ad eclipticam inclinatozz";
        Assertions.assertFalse(Main.isAnagram2(input1, input2));
    }
}