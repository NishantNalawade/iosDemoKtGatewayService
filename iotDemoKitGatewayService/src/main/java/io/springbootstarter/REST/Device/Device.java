package io.springbootstarter.REST.Device;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.springbootstarter.REST.Tenant.Tenant;

@Entity
public class Device {

	@Id
	private String uid;
	private String tenantname;
	private String deviceID;
	private String deviceType;

	@ManyToOne
	private Tenant tenant;

	public Device() {}
	
	public Device(String uid, String tenantname, String deviceID, String deviceType, String tenantid) {
		super();
		this.uid = uid;
		this.tenantname = tenantname;
		this.deviceID = deviceID;
		this.deviceType = deviceType;
		this.tenant = new Tenant("tenantid","","","");
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getTenantname() {
		return tenantname;
	}

	public void setTenantname(String tenantname) {
		this.tenantname = tenantname;
	}

	public String getDeviceID() {
		return deviceID;
	}

	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public Tenant getTenant() {
		return tenant;
	}

	public void setTenant(Tenant tenant) {
		this.tenant = tenant;
	}

}
