package jsf;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class addPerson {
	public addPerson()
	{
		List<Person> pacjet = ArrayList<Person>();
	}


	
	public String add()
	{
		return null;
	}
}
