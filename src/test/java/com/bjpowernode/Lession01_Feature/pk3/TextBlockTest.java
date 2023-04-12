package com.bjpowernode.Lession01_Feature.pk3;

import org.junit.Test;

/**
 * @author shang
 * @date 2023-04-12-8:17
 */
public class TextBlockTest {
    @Test
    public void test01() {
        //�ı���
        String s1 = """
                hello,world
                """;
        System.out.println("s1 = " + s1);
    }

    @Test
    public void test02() {
        String s1 = """
                lisi
                """;
        String s2 = """
                lisi  
                """;
        String msg = """
                hello world
                """;
        String substring = msg.substring(0, 5);
        System.out.println("s1.equals(s2) = " + s1.equals(s2));
        System.out.println("s1==s2 = " + (s1 == s2));
        System.out.println("substring = " + substring);
    }

    @Test
    public void test03() {
        String msg = """
                <html>
                    <body>Java黄埔军校</body>
                </html>
                """;
        System.out.println(msg);
    }

    @Test
    public void test04() {
        String colors = """
                red
                gree
                blue
                """;
        colors = colors.indent(5);
        System.out.println(colors);
    }

    @Test
    public void test05() {
        String info = """
                Name:%s,
                Phone:%s,
                Age:%d
                """.formatted("李四", "13800000000", 30);
        System.out.println(info);
    }

    @Test
    public void test06() {
        String str = """
                Spring Boot还一个快速开发框架\
                基于\"Spring\"框架,创建Spring应用\
                内嵌Web服务器,以jar或war方式运行\
                """;
        System.out.println(str);
    }

    @Test
    public void test07() {
        var s1 = "hello";
        var i = 10;
        System.out.println("s1 = " + s1);
        System.out.println("i = " + i);
    }
}
