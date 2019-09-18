package com.isteer.springinsertdbs;

public class EntityBean {
	
	String name;
	String location;
	String contact;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "EntityBean [name=" + name + ", location=" + location + ", contact=" + contact + "]";
	}
	

}
