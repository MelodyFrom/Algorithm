package com.gaop.demo.base;

/**
 * 元素类，用于验证排序算法的稳定性
 * @author gaopeng@doctorwork.com
 * @description
 * @date 2018-12-28 21:50
 **/
public class Element implements Comparable<Element>{

    private int numberA;

    private int numberB;

    public Element(int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public int getNumberA() {
        return numberA;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    @Override
    public String toString() {
        return "Element{" +
                "numberA=" + numberA +
                ", numberB=" + numberB +
                '}';
    }

    @Override
    public int compareTo(Element o) {
        return this.numberA - o.numberA;
    }
}
