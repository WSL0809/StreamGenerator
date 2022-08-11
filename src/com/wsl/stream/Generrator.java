package com.wsl.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Sream流对象的五种创建方式
public class Generrator {
    //1.基于数组进行创建

    public void generator1() {
        String[] arr = {"lily", "andi", "smith", "saasa"};
        Stream<String> stream = Stream.of(arr);
        stream.forEach(s -> System.out.println(s));
    }

    //2.基于集合创建
    public void generator2(){
        List<String> list = new ArrayList<>();
        list.add("lily");
        list.add("andi");
        list.add("smith");
        list.add("saasa");
        list.add("wsl");
        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(s));
    }

//3.利用generate方法创建无限长度流
    public void generator3() {
        Stream<Integer> stream = Stream.generate(() -> new Random().nextInt(100000));
        stream.limit(10).forEach(s -> System.out.println(s));
    }
    @Test
    //4.基于迭代器创建流
    public void generator4(){
        Stream<Integer> stream = Stream.iterate(1, n -> n + 1);//(起始数据，步长)
        stream.limit(10).forEach(s -> System.out.println(s));
    }
    @Test
    //5.基于字符序列创建流
    public void generator5(){
        String str = "abcdwo的";
        IntStream intStream = str.chars();
        intStream.forEach(s -> System.out.println(s));
    }
}
