package com.bjpowernode.Lession01_Feature;

import org.junit.Test;

/**
 * @author shang
 * @date 2023-04-10-21:43
 */
public class StudentTest {
    @Test
    public void test01() {
        //创建Record对象
        Student lisi = new Student(1001, "lisi", "lisi@qq.com", 20);
        System.out.println("lisi=" + lisi.toString());

        //public访问器,获取属性值,只读.没有set,get方法
        Integer id = lisi.id();
        String name = lisi.name();
        System.out.println("id=" + id);
        System.out.println("name=" + name);

        Student zhangsan = new Student(1002, "zhangsan", "zhangsan@qq.com", 26);
        System.out.println("zhangsan" + zhangsan);
        System.out.println("lisi.equals(zhangsan) = " + lisi.equals(zhangsan));
        System.out.println("zhangsan.id() = " + zhangsan.id());
        System.out.println("zhangsan.name() = " + zhangsan.name());

    }

    @Test
    public void test02() {
        Student student = new Student(1001, "lisi", "lisi@qq.com", 20);
        //使用对象调用实例方法
        String str = student.concat();
        System.out.println("str = " + str);
    }

    @Test
    public void test03() {
        //使用类的静态方法
        String email = Student.emailToUpperCase("lisi@qq.com");
        System.out.println("email = " + email);


    }
}