package com.cn.callback.example1;
//1.Class A调用Class B中的X方法
//2.ass B中X方法执行过程中调用Class A中的Y方法完成回调
//过期声明@Deprecated

public class Test {

	public static void main(String[] args) {
           Personnel  personnel=new Personnel();
           new Manager(personnel);
}
	}