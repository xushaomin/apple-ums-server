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
@XmlRootElement(name = "pushPolicyQueryResponse")
public class PushPolicyQueryResponse  {

	private PushPolicyQuery reply;

	public PushPolicyQuery getReply() {
		return reply;
	}

	public void setReply(PushPolicyQuery reply) {
		this.reply = reply;
	}

}
