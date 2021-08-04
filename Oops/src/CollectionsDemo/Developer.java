package CollectionsDemo;

import java.util.Comparator;

public class Developer  {

	
	int id;
	String name,domain;
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDomain() {
		return domain;
	}

	//String city;
	public Developer(int id, String name, String domain) {
		super();
		this.id = id;
		this.name = name;
		this.domain = domain;
	}
}


	//Comparator interface used to sort objects using defined class for
//base on multiple fields
class IdComparator implements Comparator
{

@Override
	public int compare(Object o1, Object o2) {
Developer d1=(Developer) o1;
Developer d2=(Developer) o2;

if(d1.id==d2.id)
	return 0;
else if(d1.id>d2.id)
return 1;
else
	return -1;
		
		
	}

	
}

class DomainComparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Developer d1=(Developer) o1;
		Developer d2=(Developer) o2;
		
		return d1.domain.compareTo(d2.domain);
	}
	}
