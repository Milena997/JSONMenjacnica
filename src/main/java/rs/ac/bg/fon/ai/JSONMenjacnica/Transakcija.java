package rs.ac.bg.fon.ai.JSONMenjacnica;

import java.util.Date;

public class Transakcija {
	
	private String izvornaValuta;
	private String krajnjaValuta;
	private double pocetniIznos; 
	private double konvertovaniIznos; 
	private Date datumTransakcije;
	
	public String getIzvornaValuta() {
		return izvornaValuta;
	}
	public void setIzvornaValuta(String izvornaValuta) {
		this.izvornaValuta = izvornaValuta;
	}
	public String getKrajnjaValuta() {
		return krajnjaValuta;
	}
	public void setKrajnjaValuta(String krajnjaValuta) {
		this.krajnjaValuta = krajnjaValuta;
	}
	public double getPočetniIznos() {
		return pocetniIznos;
	}
	public void setPocetniIznos(double početniIznos) {
		this.pocetniIznos = početniIznos;
	}
	public double getKonvertovaniIznos() {
		return konvertovaniIznos;
	}
	public void setKonvertovaniIznos(double konvertovaniIznos) {
		this.konvertovaniIznos = konvertovaniIznos;
	}
	public Date getDatumTransakcije() {
		return datumTransakcije;
	}
	public void setDatumTransakcije(Date datumTransakcije) {
		this.datumTransakcije = datumTransakcije;
	}
	@Override
	public String toString() {
		return "Transakcija [izvornaValuta=" + izvornaValuta + ", krajnjaValuta=" + krajnjaValuta + ", početniIznos="
				+ pocetniIznos + ", konvertovaniIznos=" + konvertovaniIznos + ", datumTransakcije=" + datumTransakcije
				+ "]";
	}
	
	

}
