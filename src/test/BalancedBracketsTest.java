package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //Return True Tests
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void emptyBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyBracketsThenString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void stringThenBrackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void brackets(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    //Return False Tests

    @Test
    public void bracketsMissingCloseBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void bracketedIncorrectOrder(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void emptyBracketsMissingCloseBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void missingCloseBracket(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

}
