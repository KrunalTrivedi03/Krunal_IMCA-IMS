package org.employeemanagement;

public class Country {
	
	private String cname;

	protected String getCname() {
		return cname;
	}

	protected void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "Country [cname=" + cname + "]";
	}
	
	

}
