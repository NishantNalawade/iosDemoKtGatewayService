package io.springbootstarter.REST.Tenant;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tenant {

	@Id
	private String tenantid ;
	private String tenantname;
	private String username ;
	private String state ;
	
	public Tenant() {}
	
	public Tenant(String tenantid, String tenantname, String username, String state) {
		super();
		this.tenantid = tenantid;
		this.tenantname = tenantname;
		this.username = username;
		this.state = state;
	}
	
	

	public String getTenantid() {
		return tenantid;
	}

	public void setTenantid(String tenantid) {
		this.tenantid = tenantid;
	}

	public String getTenantname() {
		return tenantname;
	}
	public void setTenantname(String tenantname) {
		this.tenantname = tenantname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
	
	
	
}
