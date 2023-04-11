package com.bjpowernode.Lession01_Feature.pk1.Record;

import java.util.Optional;

/**
 * @author shang
 * @date 2023-04-10-21:35
 */
public record Student(Integer id, String name, String email, Integer age) {
    // 紧凑型构造方法
    public Student {
        System.out.println("id = " + id);
        if (id < 1) {
            throw new RuntimeException("id<1");
        }
    }

    // 定制的构造方法
    public Student(Integer id, String name) {
        this(id, name, null, null);
    }

    //实例方法.concat连接字符串
    public String concat() {
        return String.format("姓名是%s,年龄是%d", this.name, this.age());
    }

    //静态方法,把email转为大写
    public static String emailToUpperCase(String email) {
        return Optional.ofNullable(email).orElse("no email").toUpperCase();
    }
}
