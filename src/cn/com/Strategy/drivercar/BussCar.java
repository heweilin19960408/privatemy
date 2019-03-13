package cn.com.Strategy.drivercar;

public class BussCar extends Car{

    public BussCar(String name, String color) {
        super(name, color);
    }

    @Override
    public void run() {
        System.out.print(color+"  "+name+"在路上缓慢的开着!!!!!!!");
    }
}
