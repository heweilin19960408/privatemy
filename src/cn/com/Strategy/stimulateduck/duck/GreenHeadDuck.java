package cn.com.Strategy.stimulateduck.duck;

import cn.com.Strategy.stimulateduck.flybehavior.GoodFlyBehavior;
import cn.com.Strategy.stimulateduck.quackbehavior.GaGaQuackBehavior;

public class GreenHeadDuck extends Duck {

	public GreenHeadDuck() {
		mFlyBehavior = new GoodFlyBehavior();
		mQuackBehavior = new GaGaQuackBehavior();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("**GreenHead**");
	}

}