package cn.mldn.util;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class StringUnitTest 
    extends TestCase
{
   
    public StringUnitTest( String testName )
    {
        super( testName );
    }

   
    public static Test suite()
    {
        return new TestSuite( StringUnitTest.class );
    }

 
    public void testApp()
    {
        TestCase.assertEquals(StringUnit.initCap("name"), "Name");
    }
}
