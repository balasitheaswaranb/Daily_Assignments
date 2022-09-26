package com.implementation;
interface InterfaceClassOne {
	default public void defaultMethod() {
		System.out.println("interface class one called");
	}
}

interface InterfaceClassTwo {
	default public void defaultMethod() {
		System.out.println("interface class Two called");
	}
}

public class MainInterface implements InterfaceClassOne, InterfaceClassTwo{
	public static void main(String[] args) {
		MainInterface mainMethod = new MainInterface();
		mainMethod.run();
	}

	private void run() {
		InterfaceClassOne interfaceClass = new MainInterface();
		interfaceClass.defaultMethod();

	}

	@Override
	public void defaultMethod() {

		InterfaceClassOne.super.defaultMethod();
		InterfaceClassTwo.super.defaultMethod();

	}

}
