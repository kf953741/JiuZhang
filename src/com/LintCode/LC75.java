package com.LintCode;

/**
 * Created by Administrator on 2016/1/18.
 */
public class LC75 {
    public static int findPeak(int[] a)
    {
        int start = 1;
        int end = a.length-2;
        while (start+1<end)
        {
            int mid = start+(end-start)/2;
            if (a[mid]<a[mid+1])
            {
                start = mid;
            }
            else if (a[mid]<a[mid-1])
            {
                end = mid;
            }
            else {
                end = mid;
            }
        }
        if (a[start]<a[end])
            return end;
        else
            return start;

    }
}
