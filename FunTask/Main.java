package com.implementation;

public class Main {
	public static void main(String args[]) {
		Main main = new Main();
		main.run();
	}

	static class Parent {
		void parentMethod() {
			Child.childMethod();
		}

	}

	static class Child extends Parent {
		
		static void childMethod() {
			System.out.println("child called through parent");
		}

	}

	private void run() {

		Parent parent = new Parent();
		parent.parentMethod();

	}
}
