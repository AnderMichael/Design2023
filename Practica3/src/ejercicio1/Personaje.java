package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Personaje implements IPersonaje {
	private String nombre;
	private int nivel;
	private List<String> armas;
	private double porcentajeArmadura;
	private int puntosAtaque;
	private int puntosDefensa;
	private int regeneracion;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public List<String> getArmas() {
		return armas;
	}

	public void setArmas(List<String> armas) {
		this.armas = armas;
	}

	public void addArma(String arma) {
		armas.add(arma);
	}

	public double getPorcentajeArmadura() {
		return porcentajeArmadura;
	}

	public void setPorcentajeArmadura(double porcentajeArmadura) {
		this.porcentajeArmadura = porcentajeArmadura;
	}

	public int getPuntosAtaque() {
		return puntosAtaque;
	}

	public void setPuntosAtaque(int puntosAtaque) {
		this.puntosAtaque = puntosAtaque;
	}

	public int getPuntosDefensa() {
		return puntosDefensa;
	}

	public void setPuntosDefensa(int puntosDefensa) {
		this.puntosDefensa = puntosDefensa;
	}

	public int getRegeneracion() {
		return regeneracion;
	}

	public void setRegeneracion(int regeneracion) {
		this.regeneracion = regeneracion;
	}

	public Personaje(String nombre) {
		this.nombre = nombre;
		this.nivel = 1;
		this.armas = new ArrayList<>();
		this.porcentajeArmadura = 1;
		this.puntosAtaque = 1;
		this.puntosDefensa = 1;
		this.regeneracion = 1;
	}

	@Override
	public void mostrarHabilidades() {
		System.out.println(String.format("*****Personaje - %s*****", nombre));
		System.out.println(String.format("Nivel: %d", nivel));
		System.out.println("--Armas--");
		for (String arma : armas) {
			System.out.println(arma);
		}
		System.out.println("---------");
		System.out.println(String.format("Porcentaje armadura: %.2f", porcentajeArmadura));
		System.out.println(String.format("Puntos de Ataque: %d", puntosAtaque));
		System.out.println(String.format("Puntos defensa: %d", puntosDefensa));
		System.out.println(String.format("Regeneracion: %d", regeneracion));
		System.out.println("********************************");
	}
}
