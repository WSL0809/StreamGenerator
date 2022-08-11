package com.wsl.stream;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMethod {
    //提取集合中所有偶数并求和
    @Test
    public void case1() {
//        Arrays.asList();
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        int sum = list.stream()//获取stream对象
                .mapToInt(s -> Integer.parseInt(s))//mapToint将流中每个数转为整数
                .filter(n->n%2==1)
                .sum();
        System.out.println(sum);


    }
    @Test
    //所有名字首字母大写
    public void case2(){
        List<String> list = Arrays.asList("litt", "Asss", "wsl", "xhxd", "hdhd");
        List newList = list.stream()
                .map(s->s.substring(0,1).toUpperCase()+s.substring(1))
//                .forEach(s-> System.out.println(s))
                .collect(Collectors.toList());
        System.out.println(newList);
    }
    @Test
    //所有奇数从大到小排序
    public void case3(){
        List<Integer> list = Arrays.asList(1,8,3,5,1,3,5,9,9,34,23,34,5);
        List newList = list.stream()
                .distinct()
                .filter(f->f%2==1)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(newList);
    }


}
