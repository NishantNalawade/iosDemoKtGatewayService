package io.springbootstarter.REST.Device;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DeviceRepo extends CrudRepository<Device,String> {

	public List<Device> findByTenantTenantid(String tenentid);
	
	
}
