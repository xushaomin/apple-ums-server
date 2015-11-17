package com.appleframework.ums.server.storage.service.impl;

import java.text.ParseException;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Service;

import com.appleframework.ums.server.core.entity.ClientDataEntity;
import com.appleframework.ums.server.core.model.ClientData;
import com.appleframework.ums.server.storage.dao.ClientDataEntityMapper;
import com.appleframework.ums.server.storage.service.ClientDataService;
import com.appleframework.ums.server.storage.utils.Contants;

@Service("clientDataService")
public class ClientDataServiceImpl implements ClientDataService {
		
	@Resource
	private ClientDataEntityMapper clientDataEntityMapper;
	
	private void save(ClientDataEntity record) {
		record.setInsertdate(new Date());
		clientDataEntityMapper.insert(record);
	}
	
	public void save(ClientData clientData) {
		ClientDataEntity record = new ClientDataEntity();
		record.setClientip(clientData.getIp());
		try {
			record.setDate(DateUtils.parseDate(clientData.getTime(), Contants.pattern));
		} catch (ParseException e) {
			record.setDate(new Date());
		}
		record.setDeviceid(clientData.getDeviceId());
		record.setDevicename(clientData.getDeviceName());
		
		record.setHavebt(clientData.getHaveBt() == true? "1":"0");
		record.setHavegps(clientData.getHaveGps().toString());
		record.setHavewifi(clientData.getHaveWifi() == true? "1":"0");
		record.setHavegravity(clientData.getHaveGravity() == true? "1":"0");
		record.setImei(clientData.getImei());
		record.setImsi(clientData.getImsi());
		record.setIsjailbroken(clientData.getIsJailBroken());
		record.setIsmobiledevice(clientData.getIsMobileDevice() == true? "1":"0");
		
		record.setLanguage(clientData.getLanguage());
		record.setLatitude(clientData.getLatitude());
		record.setLongitude(clientData.getLongitude());
		record.setModulename(clientData.getModuleName());
		
		record.setNetwork(clientData.getNetwork());
		
		record.setOsversion(clientData.getOsVersion());
		record.setPlatform(clientData.getPlatform());
		
		record.setProductkey(clientData.getAppKey());
		
		record.setResolution(clientData.getResolution());
		record.setSalt(clientData.getSalt());
		
		
		record.setUseridentifier(clientData.getUserId());
		record.setVersion(clientData.getVersion());
		record.setWifimac(clientData.getWifiMac());
		
		record.setServiceSupplier(null);
		record.setServiceversion(null);
		record.setName(null);
		record.setDefaultbrowser(null);
		record.setCity(null);
		record.setCountry(null);
		record.setStreet(null);
		record.setStreetno(null);
		record.setPostcode(null);
		record.setRegion(null);
		record.setOsaddtional(null);
		record.setJavasupport(null);
		record.setFlashversion(null);
		
		try {
			this.save(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
