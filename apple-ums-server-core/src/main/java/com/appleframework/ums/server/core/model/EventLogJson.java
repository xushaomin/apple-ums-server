package com.appleframework.ums.server.core.model;

import java.io.Serializable;
import java.util.List;

public class EventLogJson implements Serializable {

	private static final long serialVersionUID = 6224309426108011323L;

	private List<EventLog> data;

	public List<EventLog> getData() {
		return data;
	}

	public void setData(List<EventLog> data) {
		this.data = data;
	}

}
