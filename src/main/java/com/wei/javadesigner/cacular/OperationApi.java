package com.wei.javadesigner.cacular;

public interface OperationApi {
    /**
     * 获取计算完成后的结果
     *
     * @return 计算完成后的结果
     */
    public int getResult();

    /**
     * 设置计算开始的初始值
     *
     * @param result 计算开始的初始值
     */
    public void setResult(int result);

    /**
     * 执行加法
     * http://chjavach.javaeye.com 1.18 研磨设计模式之命令模式-3
     * 第 113 / 186 页
     *
     * @param num 需要加的数
     */
    public void add(int num);

    /**
     * 执行减法
     *
     * @param num 需要减的数
     */
    public void substract(int num);
}
