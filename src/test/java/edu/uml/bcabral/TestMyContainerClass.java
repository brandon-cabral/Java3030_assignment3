package edu.uml.bcabral;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TestMyContainerClass {

    MyContainerClass list = new MyContainerClass();

    @Test
    public void testClass(){
        assertNotNull(list);
    }

}
