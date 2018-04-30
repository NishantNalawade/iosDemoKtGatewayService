package iot.gatewayservice.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import iot.gatewayservice.pojo.Device;

public interface DeviceRepo extends CrudRepository<Device,String> {

	public List<Device> findByTenantTenantid(String tenentid);
	
	
}
