package com.bjpowernode.Lession01_Feature;

import java.util.StringJoiner;

/**
 * @author shang
 * @date 2023-04-11-8:47
 */
public record ProductRecord(Integer id, String name, Integer qry) implements PrintInterface {
    @Override
    public void print() {
        StringJoiner joiner = new StringJoiner("-");
        StringJoiner str = joiner.add(id.toString()).add(name).add(qry.toString());
        System.out.println("商品信息 = " + str);
    }
}
