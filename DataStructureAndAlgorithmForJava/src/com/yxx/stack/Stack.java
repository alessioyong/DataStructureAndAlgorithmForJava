package com.yxx.stack;

/**
 * @author xyong
 * @date 2021-03-26
 */
public interface Stack {
    /**
     * 返回栈中元素数目
     * @return
     */
    public int getSize();
    /**
     * 判断栈是否为空
     * @return
     */
    public boolean isEmpty();
    /**
     * 取栈顶元素（但不删除）
     * @return
     * @throws ExceptionStackEmpty
     */
    public Object top() throws ExceptionStackEmpty;
    /**
     * 入栈
     * @param ele
     */
    public void push (Object ele);
    /**
     * 出栈
     * @return
     * @throws ExceptionStackEmpty
     */
    public Object pop() throws ExceptionStackEmpty;
}
