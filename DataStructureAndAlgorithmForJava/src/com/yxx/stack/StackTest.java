package com.yxx.stack;


/**
 * @author xyong
 * @date 2021-03-26
 */
public class StackTest {

    /**
     * 利用栈反转数组
     * @param a
     * @return
     */
    public static Integer[] reverse(Integer[] a){
        Stack_Array S=new Stack_Array(a.length);
        Integer[]b=new Integer[a.length];
        for (int i=0;i<a.length;i++){
            S.push(a[i]);
        }
        for (int k=0;k<b.length;k++){
           b[k]= (Integer) S.pop();
        }
        return b;
    }

    public static void main(String[] args) {
        Integer[] a={1,2,3,4,5};
        Integer[] b = reverse(a);
        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }

    }
}
