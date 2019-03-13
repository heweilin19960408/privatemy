package com.cn.callback.example1;

public class Manager {
        public Manager(Personnel personnel) {
        	 personnel.doSomething(this,"整理公司文件");
        }

		public void phoneCall(String result) {
        	 System.out.println("事情"+result);
         }
}
