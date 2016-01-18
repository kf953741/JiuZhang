package com.LintCode;

/**
 * Created by Administrator on 2016/1/18.
 */
public class LC159 {
    public static int finMin(int[] num)
    {
        int start =0;
        int end = num.length-1;
        int target = num[num.length-1];
        while (start+1 <end)
        {
            int mid = start+(end-start)/2;
            if (num[mid]<=target)
                end = mid;
            else
                start =mid;
        }
        if (num[start]<=target)
            return num[start];
        else
            return num[end];
    }
}
