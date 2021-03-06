package com.LintCode;

/**
 * Created by Administrator on 2016/1/19.
 */
public class LC62 {
    public static int search(int[] A,int target)
    {
        if (A == null || A.length == 0) {
            return -1;
        }
        int start = 0;
        int end = A.length-1;
        int mid;
        while (start+1<end)
        {
            mid = start + (end - start)/2;
            if (A[mid]==target)
                return mid;
            if (A[start]<A[mid])
            {
                if (A[start]<=target&&target<A[mid])
                {
                    end = mid;
                }
                else
                {
                    start = mid;
                }
            }
            else if (A[start]>A[mid])
            {
                if (A[mid]<=target&&target<=A[end])
                {
                    start = mid;
                }else
                {
                    end = mid;
                }
            }
        }
        if (A[start]==target)
            return start;
        if (A[end]==target)
            return end;
        return -1;
    }
}
