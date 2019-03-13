package cn.com.Strategy.drivercar;

public class Car implements CarFunntion {
    private CarFunntion carFunntion;//策略类
    protected String color;
    protected String name;
    public Car(String name,String color){
        this.color=color;
        this.name=name;
    }
    @Override
    public void run() {
        System.out.print(color+"的"+name+"在行驶!!!!!!!!!!!");
    }
}
