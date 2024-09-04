package controller;

public class ControllerPilha {

	No topo;

	public ControllerPilha() {
		topo = null;
	}

	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;

	}

	public void push(String valor) {
		No novoValor = new No();
		novoValor.dado = valor;
		if (isEmpty()) {
			topo = novoValor;
		} else {
			novoValor.proximo = topo;
			topo = novoValor;
		}
	}

	public String pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Não há elementos para desempilhar");
		}
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}

	public String top() throws Exception {

		if (isEmpty()) {
			throw new Exception("Não há elementos para desempilhar");
		}

		return topo.dado;
	}

	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			cont = 1;
			No atual = topo;
			while (atual.proximo != null) {
				atual = atual.proximo;
				cont++;
			}
		}
		return cont;
	}

}

