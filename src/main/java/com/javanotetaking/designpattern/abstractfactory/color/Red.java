package com.javanotetaking.designpattern.abstractfactory.color;
public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Execute Red::fill() method.");
	}
}
