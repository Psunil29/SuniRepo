package sample.in;

public class Employee implements Cloneable{
	public Employee() {
		
	}
	
 public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
private int id;
 private String name;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public Object clone()throws CloneNotSupportedException{  
return super.clone();  
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (id != other.id)
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
			+ ", hashCode()=" + hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
}  
 
protected  void finalize() throws Throwable{
	 System.out.println("From Finalize Method");
}

public void printStackTrace() {
	// TODO Auto-generated method stub
	
}
	 
}
