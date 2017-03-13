package com.appleframework.ums.server.core.model;

import java.io.Serializable;
import java.util.List;

public class UsingLogJson implements Serializable {

	private static final long serialVersionUID = 6224309426108011323L;

	private List<UsingLog> data;

	public List<UsingLog> getData() {
		return data;
	}

	public void setData(List<UsingLog> data) {
		this.data = data;
	}

}
