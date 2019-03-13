package cn.com.Strategy.stimulateduck.duck;

import cn.com.Strategy.stimulateduck.flybehavior.FlyBehavior;
import cn.com.Strategy.stimulateduck.quackbehavior.QuackBehavior;

public abstract class Duck {

	FlyBehavior mFlyBehavior;
	QuackBehavior mQuackBehavior;

	public Duck() {

	}

	public void Fly() {
		mFlyBehavior.fly();
	}

	public void Quack() {
		mQuackBehavior.quack();
	}

	public abstract void display();

	public void SetQuackBehavoir(QuackBehavior qb) {
		mQuackBehavior = qb;
	}

	public void SetFlyBehavoir(FlyBehavior fb) {
		mFlyBehavior = fb;
	}

	public void swim() {
		System.out.println("~~im swim~~");
	}
}
