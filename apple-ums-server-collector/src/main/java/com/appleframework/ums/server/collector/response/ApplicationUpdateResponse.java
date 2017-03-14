package com.appleframework.ums.server.collector.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * <pre>
 * 功能说明：
 * </pre>
 * 
 * @author 徐少敏
 * @version 1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "applicationUpdateResponse")
public class ApplicationUpdateResponse {

	private ApplicationUpdate reply;

	public ApplicationUpdate getReply() {
		return reply;
	}

	public void setReply(ApplicationUpdate reply) {
		this.reply = reply;
	}

}
