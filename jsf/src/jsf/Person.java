package jsf;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.faces.application.FacesMessage;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;
import javax.xml.crypto.Data;

import org.primefaces.event.SelectEvent;



@ManagedBean(name="Person")
@RequestScoped
public class Person
{
//	public Person(String imie,String nazwisko,String pesel,Date dataUrodzenia,String adres,int tel,double waga,double wzrost)
//	{
//		this.imie=imie;
//		this.nazwisko=nazwisko;
//		this.pesel=pesel;
//		this.dataUrodzenia=dataUrodzenia;
//		this.adres=adres;
//		this.tel=tel;
//		this.waga=waga;
//		this.wzrost=wzrost;
//	
//	}
	
	private int id;

	private String imie;
	private String nazwisko;
	private String pesel;
	private String dataUrodzenia;
	private String adres;
	private int tel;
	private double waga;
	private double wzrost;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getPesel() {
		return pesel;
	}
	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getDataUrodzenia() {
		return dataUrodzenia;
	}
	public void setDataUrodzenia(String dataUrodzenia) {
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
	
	public void check(){
	
		if(checkPerson.sprawdz(pesel)) 
		{
//			 if(checkPerson.sprawdzDate(dataUrodzenia, pesel))
//				{
			this.save();
//				}
//			else
//			{
				
//				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Z≥a data, bπdü niezgodna z nr PESEL"));
//		    }
						
		}
		else
		{
						FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("B≥Ídny nr PESEL"));
		}
		
		}
	public void save() {
		PersonManagment.add(this);
	//	PersonManagment.add(new Person(this.imie,this.nazwisko,this.pesel,this.dataUrodzenia,this.adres,this.tel,this.waga,this.wzrost));
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Pacjent " + imie + " " + nazwisko +" zosta≥ pomyúlnie dodany do bazy."));
    }
	

}
