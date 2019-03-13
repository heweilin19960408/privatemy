package cn.com.Strategy.drivercar;

public class Person {
        private  String  name;
        private  Integer age;
        private  Car car;
        public void Driver(Car car){
//            System.out.print(age+"岁"+"的"+name+"开着");
            car.run();
        }

    public Person(Integer age,String name) {
        this.name = name;
        this.age=age;

    }
}
