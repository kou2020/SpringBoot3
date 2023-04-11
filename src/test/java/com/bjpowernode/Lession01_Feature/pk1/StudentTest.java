package com.bjpowernode.Lession01_Feature.pk1;


import com.bjpowernode.Lession01_Feature.pk1.Record.*;
import com.bjpowernode.Lession01_Feature.pk1.Service.SomeService;
import org.junit.Test;

import java.lang.reflect.RecordComponent;

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

    @Test
    public void test04() {
        Student student = new Student(2001, "lisi");
        System.out.println("student = " + student);
    }

    @Test
    public void test05() {
        ProductRecord productRecord = new ProductRecord(1001, "手机", 200);
        productRecord.print();
    }

    @Test
    public void test06() {
        // 定义local record
        record SaleRecord(String saleId, String productName, Double momey) {
        }
        ;
        //创建对象
        SaleRecord saleRecord = new SaleRecord("S001", "显示器", 3000.1);
        System.out.println("saleRecord = " + saleRecord);
    }

    @Test
    public void test07() {
        Address address = new Address("北京", "大兴区凉水河二街八号10栋3层", "100176");
        PhoneNumber phoneNumber = new PhoneNumber("010", "400-8080-105");
        Customer customer = new Customer("C1001", "李项", phoneNumber, address);
        System.out.println("customer = " + customer);
        String number = customer.phoneNumber().number();
        System.out.println("number = " + number);
        String address1 = customer.address().address();
        System.out.println("address1 = " + address1);
    }

    @Test
    public void test08() {
        Person person = new Person("李四", 18);
        SomeService service = new SomeService();
        boolean flag = service.isEligible(person);
        System.out.println("flag = " + flag);

    }

    @Test
    public void test09() {
        SomeService service = new SomeService();
        boolean flag = service.isEligible(null);
        System.out.println("flag = " + flag);

    }

    @Test
    public void test10() {
        Address address = new Address("北京", "大兴区凉水河二街八号10栋3层", "100176");
        PhoneNumber phoneNumber = new PhoneNumber("010", "400-8080-105");
        Customer customer = new Customer("C1001", "李项", phoneNumber, address);
        //判断Customer是否为Java Record类型
        boolean record = customer.getClass().isRecord();
        System.out.println("record = " + record);
        RecordComponent[] recordComponents = customer.getClass().getRecordComponents();
        for (RecordComponent recordComponent : recordComponents) {
            System.out.println("recordComponent = " + recordComponent);
        }

    }
}