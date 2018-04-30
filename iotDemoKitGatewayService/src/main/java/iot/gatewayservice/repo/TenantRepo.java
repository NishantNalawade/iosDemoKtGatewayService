package iot.gatewayservice.repo;

import org.springframework.data.repository.CrudRepository;

import iot.gatewayservice.pojo.Tenant;

public interface TenantRepo extends CrudRepository<Tenant,String> {

	
	
	
}
