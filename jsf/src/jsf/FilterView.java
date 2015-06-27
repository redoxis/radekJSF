import java.io.Serializable;
import java.util.List;
import java.util.Locale;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

 
@ManagedBean(name="dtFilterView")
@ViewScoped
public class FilterView implements Serializable {
     
    private List<Person> Persons;
     
    private List<Person> filteredPersons;
     
    @ManagedProperty("#{PersonManagment.getall()}")
    private Person service;
 
    @PostConstruct
    public void init() {
        Persons = PersonManagment.getall();
    }
     
    public boolean filterByPrice(Object value, Object filter, Locale locale) {
        String filterText = (filter == null) ? null : filter.toString().trim();
        if(filterText == null||filterText.equals("")) {
            return true;
        }
         
        if(value == null) {
            return false;
        }
         
        return ((Comparable) value).compareTo(Integer.valueOf(filterText)) > 0;
    }
     
    public List<String> getBrands() {
        return service.getBrands();
    }
     
    public List<String> getColors() {
        return service.getColors();
    }
     
    public List<Person> getCars() {
        return Persons;
    }
 
    public List<Person> getFilteredCars() {
        return filteredPersons;
    }
 
    public void setFilteredCars(List<Person> filteredPersons) {
        this.filteredPersons = filteredPersons;
    }
 
    public void setService(Person service) {
        this.service = service;
    }
}