package jsf;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;

import sun.util.calendar.LocalGregorianCalendar.Date;

@ManagedBean
@RequestScoped
public class Person {
	
	private String imie;
	private String nazwisko;
	private long pesel;
	private Date dataUrodzenia;
	private String adres;
	private int tel;
	private double waga;
	private double wzrost;
	
	
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public long getPesel() {
		return pesel;
	}
	public void setPesel(long pesel) {
		this.pesel = pesel;
	}
	public Date getDataUrodzenia() {
		return dataUrodzenia;
	}
	public void setDataUrodzenia(Date dataUrodzenia) {
		this.dataUrodzenia = dataUrodzenia;
	}
	public String getAdres() {
		return adres;
	}
	public void setAdres(String adres) {
		this.adres = adres;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public double getWaga() {
		return waga;
	}
	public void setWaga(double waga) {
		this.waga = waga;
	}
	public double getWzrost() {
		return wzrost;
	}
	public void setWzrost(double wzrost) {
		this.wzrost = wzrost;
	}
	
	public String add()
	{
		
		return "Tak";
	}
	

}
