package com.appleframework.ums.server.collector.utils;

import com.appleframework.ums.server.collector.model.ClientDataVo;
import com.appleframework.ums.server.collector.model.ErrorInfoVo;
import com.appleframework.ums.server.collector.request.PostActivityLogRequest;
import com.appleframework.ums.server.collector.request.PostClientDataRequest;
import com.appleframework.ums.server.collector.request.PostEventRequest;
import com.appleframework.ums.server.collector.request.PostUseridRequest;
import com.appleframework.ums.server.collector.request.PosttagRequest;
import com.appleframework.ums.server.core.model.ActivityLog;
import com.appleframework.ums.server.core.model.ClientData;
import com.appleframework.ums.server.core.model.ClientTag;
import com.appleframework.ums.server.core.model.ErrorInfo;
import com.appleframework.ums.server.core.model.EventLog;
import com.appleframework.ums.server.core.model.UserId;

public class Convert {
	
	public static ClientData convert(ClientDataVo vo) {
		ClientData clientData = new ClientData();
		clientData.setAppKey(vo.getAppkey());
		clientData.setDeviceId(vo.getDeviceid());
		clientData.setDeviceName(vo.getDevicename());
		clientData.setHaveBt(vo.getHavebt());
		clientData.setHaveGps(vo.getHavegps());
		clientData.setHaveGravity(vo.getHavegravity());
		clientData.setHaveWifi(vo.getHavewifi());
		clientData.setImei(vo.getImei());
		clientData.setImsi(vo.getImsi());
		clientData.setIsMobileDevice(vo.getIsmobiledevice());
		clientData.setLanguage(vo.getLanguage());
		clientData.setLatitude(vo.getLatitude());
		clientData.setLongitude(vo.getLongitude());
		clientData.setMccmnc(vo.getMccmnc());
		clientData.setModuleName(vo.getModulename());
		clientData.setNetwork(vo.getNetwork());
		clientData.setOsVersion(vo.getOs_version());
		clientData.setPhoneType(vo.getPhonetype());
		clientData.setPlatform(vo.getPlatform());
		clientData.setResolution(vo.getResolution());
		clientData.setSalt(vo.getSalt());
		clientData.setTime(vo.getTime());
		clientData.setUserId(vo.getUserid());
		clientData.setVersion(vo.getVersion());
		clientData.setWifiMac(vo.getWifimac());
		return clientData;
	}

	public static ClientData convert(PostClientDataRequest request) {
		ClientData clientData = new ClientData();
		clientData.setAppKey(request.getAppkey());
		clientData.setDeviceId(request.getDeviceid());
		clientData.setDeviceName(request.getDevicename());
		clientData.setHaveBt(request.getHavebt());
		clientData.setHaveGps(request.getHavegps());
		clientData.setHaveGravity(request.getHavegravity());
		clientData.setHaveWifi(request.getHavewifi());
		clientData.setImei(request.getImei());
		clientData.setImsi(request.getImsi());
		clientData.setIsMobileDevice(request.getIsmobiledevice());
		clientData.setLanguage(request.getLanguage());
		clientData.setLatitude(request.getLatitude());
		clientData.setLongitude(request.getLongitude());
		clientData.setMccmnc(request.getMccmnc());
		clientData.setModuleName(request.getModulename());
		clientData.setNetwork(request.getNetwork());
		clientData.setOsVersion(request.getOs_version());
		clientData.setPhoneType(request.getPhonetype());
		clientData.setPlatform(request.getPlatform());
		clientData.setResolution(request.getResolution());
		clientData.setSalt(request.getSalt());
		clientData.setTime(request.getTime());
		clientData.setUserId(request.getUserid());
		clientData.setVersion(request.getVersion());
		clientData.setWifiMac(request.getWifimac());
		return clientData;
	}
	
	public static ActivityLog convert(PostActivityLogRequest request) {
		ActivityLog activityLog = new ActivityLog();
		activityLog.setAppKey(request.getAppkey());
		activityLog.setDeviceId(request.getDeviceid());
		activityLog.setActivities(request.getActivities());
		activityLog.setDuration(request.getDuration());
		activityLog.setEndMillis(request.getEnd_millis());
		activityLog.setSessionId(request.getSession_id());
		activityLog.setStartMillis(request.getStart_millis());
		activityLog.setUserId(request.getUserid());
		activityLog.setVersion(request.getVersion());
		return activityLog;
	}
	
	public static EventLog convert(PostEventRequest request) {
		EventLog eventLog = new EventLog();
		eventLog.setAppKey(request.getAppkey());
		eventLog.setDeviceId(request.getDeviceid());
		eventLog.setAcc(request.getAcc());
		eventLog.setActivity(request.getActivity());
		eventLog.setAttachment(request.getAttachment());
		eventLog.setEventIdentifier(request.getEvent_identifier());
		eventLog.setLabel(request.getLabel());
		eventLog.setUserId(request.getUserid());
		eventLog.setVersion(request.getVersion());
		return eventLog;
	}
	
	public static ClientTag convert(PosttagRequest request) {
		ClientTag clientTag = new ClientTag();
		clientTag.setAppKey(request.getAppkey());
		clientTag.setDeviceId(request.getDeviceid());
		clientTag.setTags(request.getTags());
		return clientTag;
	}
	
	public static UserId convert(PostUseridRequest request) {
		UserId userId = new UserId();
		userId.setAppKey(request.getAppkey());
		userId.setDeviceId(request.getDeviceid());
		userId.setUserId(request.getUserid());
		return userId;
	}
	
	public static ErrorInfo convert(ErrorInfoVo vo) {
		ErrorInfo errorInfo = new ErrorInfo();
		errorInfo.setAppKey(vo.getAppkey());
		errorInfo.setDeviceId(vo.getDeviceid());
		errorInfo.setActivity(vo.getActivity());
		errorInfo.setOsVersion(vo.getOs_version());
		errorInfo.setStackTrace(vo.getStacktrace());
		errorInfo.setTime(vo.getTime());
		errorInfo.setVersion(vo.getVersion());
		return errorInfo;
	}
	

}
