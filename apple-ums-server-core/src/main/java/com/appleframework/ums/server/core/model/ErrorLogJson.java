package com.appleframework.ums.server.core.model;

import java.io.Serializable;
import java.util.List;

public class ErrorLogJson implements Serializable {

	private static final long serialVersionUID = 6224309426108011323L;

	private List<ErrorLog> data;

	public List<ErrorLog> getData() {
		return data;
	}

	public void setData(List<ErrorLog> data) {
		this.data = data;
	}

}
