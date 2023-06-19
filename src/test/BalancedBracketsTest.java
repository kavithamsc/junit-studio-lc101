package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }
    @Test
    public void  oneBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void twoBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void bracketsWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }
@Test
    public void stringBracketsReturnsTrue(){
    assertTrue(BalancedBrackets.hasBalancedBrackets(" "));
}
@Test
public void bracketsOfBracketsWithinBracketsReturnsTrue() {
    assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]"));
}
    @Test
    public void tripleBracketsWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]]"));
    }
    @Test
    public void twoTripleBracketsWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[]]][]"));
    }
    @Test
    public void launchCodeWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launchCode]"));
    }
    @Test
    public void numbersWithinBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[1,2,3,4]"));
    }
    @Test
    public void onlyOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void wordsWithOnlyOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Dog,Cat,Rat"));
    }
    @Test
    public void onlyCloseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void numbersWithOnlyCloseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("1,2,3]"));
    }
    @Test
    public void misMatchesBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void misMatchesWithinNumbersBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]1,2,3["));
    }
    @Test
    public void misMatchesWithinWordsBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]Dog,Cat,Rat["));
    }
}
