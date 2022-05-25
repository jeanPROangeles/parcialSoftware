package com.mitocode.observer;

import java.util.ArrayList;
import java.util.List;


public class subjectJuego {

	private List<observador> observadores = new ArrayList<observador>();
	private int estado;

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
		notificarTodosObservadores();
	}

	public void agregar(observador observador) {
		observadores.add(observador);
	}

	public void notificarTodosObservadores() {
		observadores.forEach(x -> x.actualizar());
	}

}