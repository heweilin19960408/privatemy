package com.cn.callback.example1;

public class Personnel {
              public void doSomething(Manager manager, String task) {
            	  System.out.println("总经理要你做"+task);
            	  String result="做完了";
            	  manager.phoneCall(result);
              }
}
