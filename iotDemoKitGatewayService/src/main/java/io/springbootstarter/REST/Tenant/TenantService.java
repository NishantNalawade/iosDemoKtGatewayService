package io.springbootstarter.REST.Tenant;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TenantService {

	@Autowired
	private TenantRepo tenantrepo;

	public List<Tenant> getallTenants() {

		List<Tenant> tenants = new ArrayList<>();
		tenantrepo.findAll().forEach(tenants::add);
		return tenants;

	}

	public Tenant getTenant(String ID) {

		return tenantrepo.findOne(ID);
	}

	public void addTenant(Tenant tenant) {

		tenantrepo.save(tenant);

	}

	public void updateTenant(String iD, Tenant tenant) {

		tenantrepo.save(tenant);

	}

	public void deleteTenant(String iD) {

		tenantrepo.delete(iD);
	}

}
