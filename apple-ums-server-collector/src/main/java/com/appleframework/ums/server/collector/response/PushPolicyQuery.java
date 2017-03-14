package com.appleframework.ums.server.collector.response;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author 徐少敏
 * @version 1.0
 */
public class PushPolicyQuery {

	private Integer autoGetLocation = 1; // 是否获取location
	private Integer updateOnlyWifi = 0; // 只在wifi状态下更新
	private Integer reportPolicy = 1; // 数据发送模式
	private Integer sessionMillis = 30; // 获取到的单位为 秒 默认30秒
	private Integer intervalTime = 1; // 获取到的数据单位为分钟 默认1分钟
	private Integer fileSize = 1; // 缓存文件大小 服务端为M ，此处转为字节保存之

	public Integer getAutoGetLocation() {
		return autoGetLocation;
	}

	public void setAutoGetLocation(Integer autoGetLocation) {
		this.autoGetLocation = autoGetLocation;
	}

	public Integer getUpdateOnlyWifi() {
		return updateOnlyWifi;
	}

	public void setUpdateOnlyWifi(Integer updateOnlyWifi) {
		this.updateOnlyWifi = updateOnlyWifi;
	}

	public Integer getReportPolicy() {
		return reportPolicy;
	}

	public void setReportPolicy(Integer reportPolicy) {
		this.reportPolicy = reportPolicy;
	}

	public Integer getSessionMillis() {
		return sessionMillis;
	}

	public void setSessionMillis(Integer sessionMillis) {
		this.sessionMillis = sessionMillis;
	}

	public Integer getIntervalTime() {
		return intervalTime;
	}

	public void setIntervalTime(Integer intervalTime) {
		this.intervalTime = intervalTime;
	}

	public Integer getFileSize() {
		return fileSize;
	}

	public void setFileSize(Integer fileSize) {
		this.fileSize = fileSize;
	}

}
