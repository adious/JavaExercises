package com.adious.collections;

public class Person {

	private String firtname;
	private String lastname;

	Person(String firstname,String lastname){
		this.firtname = firstname;
		this.lastname=lastname;
	}

	public String getFirtname() {
		return firtname;
	}
	public void setFirtname(String firtname) {
		this.firtname = firtname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firtname == null) ? 0 : firtname.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
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
		Person other = (Person) obj;
		if (firtname == null) {
			if (other.firtname != null)
				return false;
		} else if (!firtname.equals(other.firtname))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [firtname=" + firtname + ", lastname=" + lastname + "]";
	}


}
