package com.LintCode;

/**
 * Created by Administrator on 2016/1/18.
 */
public class LC29 {
    class ArrayReader{
        public int get(int index){return index;};
    }
    public static int searchBigSortedArray(ArrayReader reader, int target) {
        // write your code here
        int index = 1;
        while (reader.get(index - 1) < target && reader.get(index - 1) != -1) {
            index = index * 2;
        }
        int start = 0;
        int end = index - 1;
        while (start + 1 < end)
        {
            int mid = start +(end-start)/2;
            if (reader.get(mid)<target&& reader.get(mid) != -1)
                start = mid;
            else if (reader.get(mid)==target)
                end = mid;
            else
                end = mid;

        }
        if (reader.get(start)==target)
            return start;
        if (reader.get(end)==target)
            return end;
        return -1;
    }
}
