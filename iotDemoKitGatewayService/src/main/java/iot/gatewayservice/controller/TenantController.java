package iot.gatewayservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import iot.gatewayservice.pojo.Tenant;
import iot.gatewayservice.service.TenantService;

@RestController
public class TenantController {

	@Autowired
	private TenantService tenantService;

	@RequestMapping("/tenants")
	public List<Tenant> getallTenant() {
		return tenantService.getallTenants();

	}

	@RequestMapping("/tenants/{id}")
	public Tenant getTenant(@PathVariable String id) {

		return tenantService.getTenant(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/tenants")
	public String addTenant(@RequestBody Tenant tenant) {
		try {
			tenantService.addTenant(tenant);
		} catch (Exception ex) {
			return ex.toString();
		}

		return "Success";

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/tenants/{id}")
	public String updateTenant(@RequestBody Tenant tenant, @PathVariable String id) {
		try {
			tenantService.updateTenant(id, tenant);
		} catch (Exception ex) {
			return ex.toString();//log the exception
		}

		return "Success";

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/tenants/{id}")
	public String deleteTenant(@PathVariable String id) {

		try {
			tenantService.deleteTenant(id);
		} catch (Exception ex) {
			return ex.toString();
		}

		return "Success";
	}

}
