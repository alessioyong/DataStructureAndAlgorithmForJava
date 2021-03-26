package com.yxx.stack;

/**
 * @author xyong
 * @date 2021-03-26
 */
public class Stack_Array implements Stack {

    /**
    *数组的默认容量
    */
    public static final int CAPACITY = 1024;
    /**
     *数组的实际容量
     */
    protected int capacity;
    /**
     * 对象数组
     */
    protected Object[] S;
    /**
     * 栈顶元素的位置
     */
    protected int top = -1;

    /**
     * 按照默认容量创建栈对象
     */
    public Stack_Array(){
        this(CAPACITY);
    }

    /**
     * 按照指定容量创建栈对象
     * @param cap
     */
    public Stack_Array(int cap) {
        capacity=cap;
        S=new Object[capacity];
    }

    @Override
    public int getSize() {
        return (top+1);
    }

    @Override
    public boolean isEmpty() {
        return (top<0);
    }

    @Override
    public Object top() throws ExceptionStackEmpty {
        if(isEmpty()){
            throw new ExceptionStackEmpty("栈为空!");
        }
        return S[top];
    }

    @Override
    public void push(Object ele) {
        if(getSize()==capacity){
            throw new ExceptionStackFull("栈溢出!");
        }
        S[++top]=ele;
    }

    @Override
    public Object pop() throws ExceptionStackEmpty {
        Object elem;
        if(isEmpty()){
            throw new ExceptionStackEmpty("栈为空!");
        }
        elem=S[top];
        S[top--]=null;
        return elem;
    }
}
