package com.LintCode;

/**
 * Created by Administrator on 2016/1/14.
 */
public class LC16 {
    public static int strStr(String source, String target) {
        //write your code here
        if(source==null||target==null)
            return -1;
        for(int i = 0;i<source.length()- target.length()+1;i++)
        {
            int j = 0;
            for (j = 0; j <target.length()  ; j++) {
                if (source.charAt(i+j)!=target.charAt(j)) {
                    break;
                }

            }
            if (j==target.length())
            {
                return i;
            }
        }
        return -1;
    }
}
