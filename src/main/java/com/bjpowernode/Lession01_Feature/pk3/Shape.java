package com.bjpowernode.Lession01_Feature.pk3;

/**
 * @author shang
 * @date 2023-04-12-10:40
 */
public sealed class Shape permits Circle,Square,Rectang {
    private Integer width;
    private Integer height;
    public void draw(){
        System.out.println("画一个图形Shape");
    }
}
