package com.LintCode;

/**
 * Created by Administrator on 2016/1/20.
 */
public class LC61 {
    public int[] searchRange(int[] A,int target)
    {

        if (A==null||A.length==0)
            return new int[]{-1,-1};

        int start =0;
        int end = A.length-1;
        int[] bound = new int[2];

        while (start+1<end) {
            int mid = start + (end - start) / 2;
            if (A[mid]==target)
            {
                end = mid;
            }
            else if (A[mid]>target)
            {
                end = mid;
            }
            else {
                start = mid;
            }
        }
        if (A[start]==target)
        {
            bound[0] = start;
        }
        else if (A[end]==target)
        {
            bound[0] = end;
        }
        else
        {
            bound[0]=bound[1]=-1;
            return bound;
        }

        start = 0;
        end = A.length-1;

        while(start+1<end)
        {
            int mid = start + (end - start)/2;
            if (A[mid]==target)
            {
                start = mid;
            }
            else if (A[mid]<target)
            {
                start = mid;
            }
            else
            {
                end = mid;
            }
        }

        if (A[end]==target)
        {
            bound[1] = end;
        }
        else if (A[start] ==target)
        {
            bound[1] = start;
        }
        else
        {
            bound[0] = bound[1] = -1;
            return bound;
        }

        return bound;

    }
}



















