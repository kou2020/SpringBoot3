package com.bjpowernode.Lession01_Feature.pk4;

import org.junit.Test;

/**
 * @author shang
 * @date 2023-04-12-11:27
 */
public class TestSealed {
    @Test
    public void test01() {
        SomeServuce servuce = new SomeServuceImpl();
        servuce.doThing();
    }
}
