package jsf;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="PersonManagment")
@ViewScoped
public class PersonManagment{
	
	public static List<Person> patient = new ArrayList<Person>();
	public PersonManagment()
	
	{
		patient = new ArrayList<Person>();
	}
	public static void add(Person p)
	{
		
		 patient.add(p);
		
	}
	
	public Person get(int id)
	{
		
		for(Person p:patient)
		{
			if(p.getId() == id) return p;
		}
		return null;
		
	}
	
	public List<Person> getall(int id)
	{
		
	return this.patient;
		
	}
	
	

}
