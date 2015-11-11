package com.appleframework.ums.server.collector.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import com.appleframework.rest.response.SuccessResponse;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author 徐少敏
 * @version 1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getApplicationUpdateResponse")
public class GetApplicationUpdateResponse extends SuccessResponse {
	
	/*
	 * 'flag' => 1,
       'msg' => 'ok',
       'fileurl' => $product->updateurl,
       'forceupdate' => $product->man,
       'description' => $product->description,
       'time' => $product->date,
       'version' => $product->version
	 * */

	private String fileurl;
	private String forceupdate;
	private String description;
	private String time;
	private String version;

	public String getFileurl() {
		return fileurl;
	}

	public void setFileurl(String fileurl) {
		this.fileurl = fileurl;
	}

	public String getForceupdate() {
		return forceupdate;
	}

	public void setForceupdate(String forceupdate) {
		this.forceupdate = forceupdate;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "GetApplicationUpdateResponse [fileurl=" + fileurl + ", forceupdate=" + forceupdate + ", description="
				+ description + ", time=" + time + ", version=" + version + "]";
	}

}

