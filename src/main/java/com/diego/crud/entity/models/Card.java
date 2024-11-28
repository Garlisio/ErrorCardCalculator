package com.diego.crud.entity.models;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cartas")

public class Card {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ID_Carta;
	
	private int Turno;
	
	private String Juego;

	private String Numero;
	
	private String Palo;
	
	private boolean Jugador;
	
	public int getId() {
		return ID_Carta;
	}

	public void setId(int ID_Carta) {
		this.ID_Carta = ID_Carta;
	}
	
	public int getTurno() {
		return Turno;
	}

	public void setTurno(int Turno) {
		this.Turno = Turno;
	}

	public String getJuego() {
		return Juego;
	}

	public void setJuego(String Juego) {
		this.Juego = Juego;
	}
	
	public String getNumero() {
		return Numero;
	}

	public void setNumero(String Numero) {
		this.Numero = Numero;
	}
	
	public String getPalo() {
		return Palo;
	}

	public void setPalo(String Palo) {
		this.Palo = Palo;
	}
	
	public boolean getJugador() {
		return Jugador;
	}

	public void setJugador(boolean Jugador) {
		this.Jugador = Jugador;
	}

	public Card(int ID_Carta, int Turno, String Juego, String Numero, String Palo, boolean Jugador) {
		super();
		this.ID_Carta = ID_Carta;
		this.Juego = Juego;
		this.Numero = Numero;
		this.Palo = Palo;
		this.Jugador = Jugador;
	}
	
	public Card() {
		
	}
	
}
