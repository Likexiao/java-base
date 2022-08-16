package com.java.base.algorithm;

import java.util.ArrayList;
import java.util.Collections;

public class Interval {
    int start;
      int end;
      Interval() { start = 0; end = 0; }
      Interval(int s, int e) { start = s; end = e; }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        Collections.sort(intervals,(a,b)->a.start-b.start);
        int len = intervals.size();
        if(len <= 1) return intervals;
        for(int i = 1;i<len-1;i++)
        {
            if (intervals.get(i).start<intervals.get(i-1).end){
                intervals.get(i).start = intervals.get(i-1).start;
                intervals.remove(i-1);
                i--;
            }
        }
        return intervals;
    }
}
