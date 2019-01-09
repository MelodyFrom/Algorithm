package com.gaop.demo.chapter2.homework;

import com.gaop.demo.base.Element;

/**
 * @author gaopeng@doctorwork.com
 * @description
 * @date 2018-12-23 11:33
 **/
public class SortSummary {

    public static void main(String[] args) {
        Integer[] params = new Integer[]{0, 12, 1, 2, 66, 3, 3, 7, 6};
        SortSummary model = new SortSummary();
//        model.selection(params);
        model.bubbleSort(params);
//        model.Insertion(params);
//        model.shell(params);
        model.print(params);
        System.out.println();


        Element element1 = new Element(1, 1);
        Element element2 = new Element(2, 2);
        Element element3 = new Element(3, 3);
        Element element4 = new Element(4, 4);
        Element element5 = new Element(4, 5);
        Element[] elements = new Element[]{element5, element4, element1, element3, element2};
        model.print(elements);
        model.bubbleSort(elements);
        System.out.println();
        model.print(elements);

    }

    public void print(Comparable[] params) {
        for (Comparable n : params) {
            System.out.print(n + " ");
        }
    }

    /**
     * 选择排序
     * @param args
     */
    public void selection(Integer[] args) {
        int length = args.length;
        for (int i = 0; i < length; i++) {
            int min = i; // 最小元素索引位
            for (int j = i + 1; j < length; j++) {
                if (args[min] >= args[j]) {
                    min = j;
                }
            }
            // 每一轮内层循环执行完毕就进行一次交换 交换位置的元素为 args[min] 与 args[i]
            int temp = args[min];
            args[min] = args[i];
            args[i] = temp;
        }
    }

    /**
     * 冒泡排序
     * @param args
     */
    public void bubbleSort(Comparable[] args) {
        int length = args.length;
        for(int i = 0; i < length - 1; i++) {
            for(int j = 0; j < length - 1 - i; j++) {
                if(args[j].compareTo(args[j+1]) > 0) {
                    Comparable temp = args[j];
                    args[j] = args[j+1];
                    args[j+1] = temp;
                }
            }
        }
    }

    /**
     * 插入排序
     * @param args
     */
    public void Insertion(Integer[] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = 0; j <= i - 1; j++) {
                if (args[j] >= args[i]) {
                    int temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
    }

    /**
     * 希尔排序-插入排序的优化版本，相比插入，这种方式更适合中型规模的排序。此外这也是一个不稳定排序算法
     * @param args
     */
    public void shell(Integer[] args) {
        int n = args.length;
        while (n > 1) {
            n = n / 2;
            for (int i = 0; i < args.length; i = i + n) {
                for (int j = 0; j <= i - 1; j = j + n) {
                    if (args[j] >= args[i]) {
                        int temp = args[j];
                        args[j] = args[i];
                        args[i] = temp;
                    }
                }
            }
        }
    }
}
