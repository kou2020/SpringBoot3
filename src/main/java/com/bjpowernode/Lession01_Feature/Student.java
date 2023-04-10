package com.bjpowernode.Lession01_Feature;

import java.util.Optional;

/**
 * @author shang
 * @date 2023-04-10-21:35
 */
public record Student(Integer id, String name, String email, Integer age) {
    //实例方法.concat连接字符串
    public String concat() {
        return String.format("姓名是%s,年龄是%d", this.name, this.age());
    }

    //静态方法,把email转为大写
    public static String emailToUpperCase(String email) {
        return Optional.ofNullable(email).orElse("no email").toUpperCase();
    }
}
