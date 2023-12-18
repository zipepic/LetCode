package org.example.letcode.solution295;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        System.out.println(medianFinder.findMedian());
    }
}

class MedianFinder {
    private List<Integer> list;

    public MedianFinder() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {

        list.add(num);
        list.sort((x,y)->{
            if(x > y)
                return 1;
            if(x ==y)
                return 0;

            return -1;
        });
    }

    public double findMedian() {
        if(list.size()%2 == 0){
            int left = list.get(list.size()/2- 1);
            int rigth = list.get(list.size()/2);
            return (left+rigth)/2.0;
        }else {
            return list.get(list.size()/2);
        }
    }
}
