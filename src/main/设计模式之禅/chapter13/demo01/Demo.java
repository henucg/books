package main.设计模式之禅.chapter13.demo01;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cg
 * @description desc
 * @date 2020-11-05 07:47
 */
public class Demo implements Cloneable {

    private int i;
    private String j;
    private List<String> list = new ArrayList<>();

    public Demo(){
        System.out.println("初始化类");
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getJ() {
        return j;
    }

    public void setJ(String j) {
        this.j = j;
    }

    public void addList(String s){
        this.list.add(s);
    }

    public List<String> getList(){
        return this.list;
    }

    @Override
    public Demo clone(){
        try {
            /**
             * clone属于浅拷贝，只拷贝基础数据类型（包括String）
             * 但是不拷贝对象类型与数组
             * 对象与数组指向原对象与数组的地址
             */
            Demo demo = (Demo)super.clone();
            return demo;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "i=" + i +
                ", j='" + j + '\'' +
                ", list=" + list +
                '}';
    }
}
