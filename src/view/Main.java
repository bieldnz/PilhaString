package view;

import controller.ControllerPilha;

public class Main {
	public static void main(String[] args) throws Exception {
		ControllerPilha pilha = new ControllerPilha();
		pilha.push("GABRIEL");
		pilha.push("RAFAEL");
		pilha.push("MICHAEL");
		
		System.out.println(pilha.pop());
		System.out.println(pilha.top());
	}
}
