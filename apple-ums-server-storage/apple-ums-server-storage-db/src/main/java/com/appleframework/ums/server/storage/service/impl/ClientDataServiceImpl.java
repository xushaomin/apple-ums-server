package com.appleframework.ums.server.storage.service.impl;

import java.text.ParseException;
import java.util.Date;

import javax.annotation.Resource;

import org.apache.commons.lang.time.DateUtils;
import org.springframework.stereotype.Service;

import com.appleframework.core.utils.StringUtility;
import com.appleframework.ums.server.core.entity.ClientDataEntity;
import com.appleframework.ums.server.core.model.ClientData;
import com.appleframework.ums.server.storage.dao.ClientDataEntityDao;
import com.appleframework.ums.server.storage.service.ClientDataService;
import com.appleframework.ums.server.storage.utils.Contants;
import com.appleframework.util.ip.IP;

@Service("clientDataService")
public class ClientDataServiceImpl implements ClientDataService {
		
	@Resource
	private ClientDataEntityDao clientDataEntityDao;
	
	public void save(ClientData clientData, String ip) {
		ClientDataEntity record = new ClientDataEntity();
		record.setClientip(ip);
		try {
			String[] regions = IP.find(ip);
			record.setCountry(StringUtility.isEmpty(regions[0])? "unknown" : regions[0]);
			record.setRegion(StringUtility.isEmpty(regions[1])? "unknown" : regions[1]);
			record.setCity(StringUtility.isEmpty(regions[2])? "unknown" : regions[2]);
		} catch (Exception e) {
		}
		try {
			record.setDate(DateUtils.parseDate(clientData.getTime(), Contants.pattern));
		} catch (ParseException e) {
			record.setDate(new Date());
		}
		record.setDeviceid(clientData.getDeviceid());
		record.setDevicename(clientData.getDevicename());
		
		record.setHavebt(clientData.getHavebt() == true? "1":"0");
		record.setHavegps(clientData.getHavegps().toString());
		record.setHavewifi(clientData.getHavewifi() == true? "1":"0");
		record.setHavegravity(clientData.getHavegravity() == true? "1":"0");
		
		record.setImsi(clientData.getImsi());
		
		record.setIsmobiledevice(clientData.getIsmobiledevice() == true? "1":"0");
		
		record.setLanguage(clientData.getLanguage());
		record.setLatitude("unknown");
		record.setLongitude("unknown");
		record.setModulename(clientData.getModulename());
		
		record.setNetwork(clientData.getNetwork());
		
		record.setOsversion(clientData.getOs_version());
		record.setPlatform(clientData.getPlatform());
		
		record.setProductkey(clientData.getAppkey());
		
		record.setResolution(clientData.getResolution());
		record.setSalt(clientData.getSalt());
		
		record.setLibVersion(clientData.getLib_version());
		record.setSessionId(clientData.getSession_id());
		
		record.setUseridentifier(clientData.getUseridentifier());
		record.setVersion(clientData.getVersion());
		record.setWifimac(clientData.getWifimac());
		record.setServiceSupplier(clientData.getMccmnc());
		
		record.setServiceversion(null);
		record.setName(null);
		record.setDefaultbrowser(null);
		record.setStreet(null);
		record.setStreetno(null);
		record.setPostcode(null);
		record.setOsaddtional(null);
		record.setJavasupport(null);
		record.setFlashversion(null);
		record.setIsjailbroken(0);
		//record.setImei(clientData.get);
		try {
			clientDataEntityDao.save(record);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}