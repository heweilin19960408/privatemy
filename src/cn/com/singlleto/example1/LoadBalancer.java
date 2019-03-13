package cn.com.singlleto.example1;

import java.util.*;

public class LoadBalancer {
    //私有静态成员变量，存储唯一实例
    private static LoadBalancer instance=null;
    //服务器集合
    private List ServserList=null;
    //私有构造函数
    private LoadBalancer(){
        ServserList=new ArrayList();
    }
    //公有静态成员方法，返回唯一的实例
    public static LoadBalancer getLoadBalancer(){
        if(instance==null){
            instance=new LoadBalancer();
        }
        return instance;
    }
    //增加服务器
    public void addServer(String server){
        ServserList.add(server);
    }
    //删除服务器
    public void removeServer(String server){
        ServserList.remove(server);
    }
    //使用random类随机获取服务器
    public String getServer(){
        Random random=new Random();
        int i=random.nextInt(ServserList.size());
        return (String)ServserList.get(i);
    }

}
