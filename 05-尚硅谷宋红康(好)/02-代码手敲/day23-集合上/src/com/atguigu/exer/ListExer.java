package com.atguigu.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author liming
 * @Date 2022/7/23 22:35
 **/
public class ListExer {
    /**
    区分List中remove(int index)和remove(Object obj)
     */
    @Test
    public void testListRemove() {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);//
    }

    private void updateList(List list) {
//        list.remove(2);   //删掉索引2
        list.remove(new Integer(2));   //删掉数据2
    }
}
