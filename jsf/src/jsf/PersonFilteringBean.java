package jsf;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.richfaces.model.Filter;
 
@ManagedBean
@ViewScoped
public class PersonFilteringBean implements Serializable {

	
    private static final long serialVersionUID = -5680001353441022183L;
    private String imieFilter;
    private String nazwiskoFilter;
    private String peselFilter;
    private String dataUrodzeniaFilter;
    private String adresFilter;
    private int telefonFilter;
    private double wagaFilter;
    private double wzrostFilter;
 

    
 
    public Filter<?> getFilterImieImpl() {
        return new Filter<Person>() {
            public boolean accept(Person t) {
                String imie = getImieFilter();
                if (imie == null || imie.length() == 0 || imie.equals(t.getImie())) {
                    return true;
                }
                return false;
            }
        };
    }




	public String getImieFilter() {
		return imieFilter;
	}




	public void setImieFilter(String imieFilter) {
		this.imieFilter = imieFilter;
	}




	public String getNazwiskoFilter() {
		return nazwiskoFilter;
	}




	public void setNazwiskoFilter(String nazwiskoFilter) {
		this.nazwiskoFilter = nazwiskoFilter;
	}




	public String getPeselFilter() {
		return peselFilter;
	}




	public void setPeselFilter(String peselFilter) {
		this.peselFilter = peselFilter;
	}




	public String getDataUrodzeniaFilter() {
		return dataUrodzeniaFilter;
	}




	public void setDataUrodzeniaFilter(String dataUrodzeniaFilter) {
		this.dataUrodzeniaFilter = dataUrodzeniaFilter;
	}




	public String getAdresFilter() {
		return adresFilter;
	}




	public void setAdresFilter(String adresFilter) {
		this.adresFilter = adresFilter;
	}




	public int getTelefonFilter() {
		return telefonFilter;
	}




	public void setTelefonFilter(int telefonFilter) {
		this.telefonFilter = telefonFilter;
	}




	public double getWagaFilter() {
		return wagaFilter;
	}




	public void setWagaFilter(double wagaFilter) {
		this.wagaFilter = wagaFilter;
	}




	public double getWzrostFilter() {
		return wzrostFilter;
	}




	public void setWzrostFilter(double wzrostFilter) {
		this.wzrostFilter = wzrostFilter;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}
 
   
}