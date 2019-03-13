package cn.com.Strategy.stimulateduck;

import cn.com.Strategy.stimulateduck.duck.Duck;
import cn.com.Strategy.stimulateduck.duck.GreenHeadDuck;
import cn.com.Strategy.stimulateduck.duck.RedHeadDuck;
import cn.com.Strategy.stimulateduck.flybehavior.NoFlyBehavior;
import cn.com.Strategy.stimulateduck.quackbehavior.NoQuackBehavior;


public class StimulateDuck {

	public static void main(String[] args) {

		Duck mGreenHeadDuck = new GreenHeadDuck();
		Duck mRedHeadDuck = new RedHeadDuck();

//		mGreenHeadDuck.display();
//		mGreenHeadDuck.Fly();
//		mGreenHeadDuck.Quack();
//		mGreenHeadDuck.swim();

//		mRedHeadDuck.display();
//		mRedHeadDuck.Fly();
//		mRedHeadDuck .Quack();
//		mRedHeadDuck.swim();
//		mRedHeadDuck.display();
		mRedHeadDuck.SetFlyBehavoir(new NoFlyBehavior());
		mRedHeadDuck.Fly();
		mRedHeadDuck.SetQuackBehavoir(new NoQuackBehavior());
		mRedHeadDuck.Quack();
	}

}
