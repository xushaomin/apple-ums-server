package com.appleframework.ums.server.collector.response;

import com.appleframework.rest.response.SuccessResponse;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author 徐少敏
 * @version 1.0
 */
public class ApplicationUpdate extends SuccessResponse {

	private String fileUrl;
	private String forceupdate;
	private String description;
	private String versionName;

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
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

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

}
