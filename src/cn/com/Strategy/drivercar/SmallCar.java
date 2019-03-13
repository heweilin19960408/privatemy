package cn.com.Strategy.drivercar;

public class SmallCar extends Car{

    public SmallCar(String name, String color) {
        super(name, color);
    }

    @Override
    public void run() {
        System.out.print(color+"  "+name+"在高速的行驶着！！！！！");
    }
}
