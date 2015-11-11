package com.appleframework.ums.server.collector.request;

import java.util.List;

import com.appleframework.rest.AbstractRestRequest;
import com.appleframework.ums.server.collector.model.ClientDataVo;
import com.appleframework.ums.server.collector.model.ErrorInfoVo;

public class UploadLogRequest extends AbstractRestRequest {

	/*{
	    "appkey": "e739b6f55077da0038c93978863d811c",
	    "errorInfo": [
	        {
	            "appkey": "e739b6f55077da0038c93978863d811c",
	            "time": "2015-10-14 22:08:19",
	            "stacktrace": "java.lang.ArithmeticException: divide by zero\n\tat com.wbtech.test_sample.CobubSampleActivity$2.onClick(CobubSampleActivity.java:152)\n\tat android.view.View.performClick(View.java:4223)\n\tjava.lang.ArithmeticException: divide by zero\n\tat com.wbtech.test_sample.CobubSampleActivity$2.onClick(CobubSampleActivity.java:152)\n\tat android.view.View.performClick(View.java:4223)\n\tat android.view.View$PerformClick.run(View.java:17275)\n\tat android.os.Handler.handleCallback(Handler.java:615)\n\tat android.os.Handler.dispatchMessage(Handler.java:92)\n\tat android.os.Looper.loop(Looper.java:137)\n\tat android.app.ActivityThread.main(ActivityThread.java:4898)\n\tat java.lang.reflect.Method.invokeNative(Native Method)\n\tat java.lang.reflect.Method.invoke(Method.java:511)\n\tat com.android.internal.os.ZygoteInit$MethodAndArgsCaller.run(ZygoteInit.java:1008)\n\tat com.android.internal.os.ZygoteInit.main(ZygoteInit.java:775)\n\tat dalvik.system.NativeStart.main(Native Method)\n",
	            "activity": ".CobubSampleActivity",
	            "deviceid": "Samsung GT-N7100",
	            "os_version": "4.1.2",
	            "version": "1.0"
	        }
	    ]
	}*/

	private String appkey;
	private List<ErrorInfoVo> errorInfo;
	private List<ClientDataVo> clientData;

	public String getAppkey() {
		return appkey;
	}

	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}

	public List<ErrorInfoVo> getErrorInfo() {
		return errorInfo;
	}

	public void setErrorInfo(List<ErrorInfoVo> errorInfo) {
		this.errorInfo = errorInfo;
	}

	public List<ClientDataVo> getClientData() {
		return clientData;
	}

	public void setClientData(List<ClientDataVo> clientData) {
		this.clientData = clientData;
	}

}
