package com.appleframework.ums.server.storage.model;

import java.io.Serializable;
import java.util.List;

public class ClientDataJson implements Serializable {

	private static final long serialVersionUID = 6224309426108011323L;

	private List<ClientData> data;

	public List<ClientData> getData() {
		return data;
	}

	public void setData(List<ClientData> data) {
		this.data = data;
	}

}
