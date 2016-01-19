package com.LintCode;

/**
 * Created by Administrator on 2016/1/18.
 */
public class LC74 {
    public int findFirstBadVersion(int n) {
        int start = 1;
        int end = n ;
        while (start + 1 < end)
        {
            int mid = start + (end - start)/2;
            if (isBadVersion(mid))
            {
                end = mid;
            }
            else {
                start =mid;
            }
        }
        if (isBadVersion(start))
            return start;
        return end;

    }
    public static  boolean isBadVersion(int k)
    {
        return false;
    }
}
