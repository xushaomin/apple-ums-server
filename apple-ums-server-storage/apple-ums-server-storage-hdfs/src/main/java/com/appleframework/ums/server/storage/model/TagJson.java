package com.appleframework.ums.server.storage.model;

import java.io.Serializable;
import java.util.List;

public class TagJson implements Serializable {

	private static final long serialVersionUID = 6224309426108011323L;

	private List<Tag> data;

	public List<Tag> getData() {
		return data;
	}

	public void setData(List<Tag> data) {
		this.data = data;
	}

}
