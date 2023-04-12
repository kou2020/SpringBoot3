package com.bjpowernode.Lession01_Feature.pk4;

/**
 * @author shang
 * @date 2023-04-12-11:24
 */
public sealed interface SomeServuce permits SomeServuceImpl{
    void doThing();
}
