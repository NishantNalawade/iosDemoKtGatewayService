package io.springbootstarter.REST.Device;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.springbootstarter.REST.Tenant.Tenant;

@RestController
public class DeviceController {
	
	final static String logger_name = "sample";
	final static Logger LOGGER = LoggerFactory.getLogger(DeviceController.class); 
	
	@Autowired
	private DeviceService deviceService;

	@RequestMapping("/tenant/{id}/devices")
	public List<Device> getallDevice(@PathVariable String id) {
		return deviceService.getalldevices(id);

	}

	@RequestMapping("/tenant/{tenantid}/devices/{id}")
	public Device getDevice(@PathVariable String id) {
		//validate the data and log it if any issues
//		if(id == null)
//		{LOGGER.error("ID is null");
//		return "Error";
//		}
//		else
		return deviceService.getdevice(id);
	}

	@RequestMapping(method = RequestMethod.POST, value = "/tenant/{tenantid}/devices")
	public String addDevice(@RequestBody Device device, @PathVariable String tenantid) {
		try {
			device.setTenant(new Tenant(tenantid, "", "", ""));
			deviceService.addDevice(device);

		} catch (Exception ex) {
			LOGGER.error(ex.getMessage());
			return "Error";
		}

		return "Success";

	}

	@RequestMapping(method = RequestMethod.PUT, value = "/tenant/{tenantid}/devices/{id}")
	public String updateDevice(@RequestBody Device device, @PathVariable String tenantid) {
		try {
			device.setTenant(new Tenant(tenantid, "", "", ""));
			deviceService.updateDevice(device);
		} catch (Exception ex) {
			
		}

		return "Success";

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/tenant/{tenantid}/devices/{id}")
	public String deleteDevice(@PathVariable String id) {

		try {

			deviceService.deleteDevice(id);
		} catch (Exception ex) {
			return ex.toString();
		}

		return "Success";
	}

}
