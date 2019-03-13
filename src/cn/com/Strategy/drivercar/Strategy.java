package cn.com.Strategy.drivercar;

public class Strategy {
     public  static void main(String[] args){
         Car smallcar=new SmallCar("路虎","黑色");
         Car busscar=new BussCar("公交车","绿色");
         Person p1=new Person(28,"小明");
         p1.Driver(smallcar);
         System.out.println();
         p1.Driver(busscar);
         System.out.println();
         p1.Driver(new BussCar("公交车","绿色"));
         System.out.println();
         p1.Driver(new SmallCar("路虎","黑色"));
     }
}
