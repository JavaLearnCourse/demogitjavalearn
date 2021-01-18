package org;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {

    @Test
    public void TestMethod(){
        org.Test t = new org.Test();
        Assert.assertEquals(4, t.methodSum(2,6));
    }
}
