package com.appleframework.ums.server.core.entity;

import java.io.Serializable;

public class ErrorLogEntityWithBLOBs extends ErrorLogEntity implements Serializable {
    private String title;

    private String stacktrace;

    private static final long serialVersionUID = 1L;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getStacktrace() {
        return stacktrace;
    }

    public void setStacktrace(String stacktrace) {
        this.stacktrace = stacktrace == null ? null : stacktrace.trim();
    }
}