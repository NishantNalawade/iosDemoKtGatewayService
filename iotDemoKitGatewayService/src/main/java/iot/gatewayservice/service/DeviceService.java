package iot.gatewayservice.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import iot.gatewayservice.pojo.Device;
import iot.gatewayservice.repo.DeviceRepo;

@Service
public class DeviceService {

	@Autowired
	private DeviceRepo devicerepo;

	public List<Device> getalldevices(String tenantid) {

		List<Device> devices = new ArrayList<>();
		devicerepo.findByTenantTenantid(tenantid).forEach(devices::add);
		return devices;

	}

	public Device getdevice(String ID) {

		return devicerepo.findOne(ID);
		
	}

	public void addDevice(Device device) {
		
		devicerepo.save(device);

	}

	public void updateDevice(Device device) {

		devicerepo.save(device);

	}

	public void deleteDevice(String iD) {

		devicerepo.delete(iD);
	}

}
