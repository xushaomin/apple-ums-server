package com.appleframework.ums.server.storage.receiver;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.appleframework.jms.kafka.consumer.ObjectMessageConsumer;
import com.appleframework.ums.server.core.model.ActivityLog;
import com.appleframework.ums.server.core.model.ClientData;
import com.appleframework.ums.server.core.model.ClientTag;
import com.appleframework.ums.server.core.model.ErrorInfo;
import com.appleframework.ums.server.core.model.EventLog;
import com.appleframework.ums.server.core.model.UserId;
import com.appleframework.ums.server.storage.service.ClientDataService;
import com.appleframework.ums.server.storage.service.ClientUsingLogService;
import com.appleframework.ums.server.storage.service.ErrorLogService;
import com.appleframework.ums.server.storage.service.EventDataService;

/**
 * CollectMessageReceiver
 * 
 * @author cruise.xu
 */
public class CollectMessageReceiver extends ObjectMessageConsumer {

    private static final Logger logger = Logger.getLogger(CollectMessageReceiver.class);
    
    @Resource
    private ClientDataService clientDataService;
    
    @Resource
    private EventDataService eventDataService;
    
    @Resource
    private ClientUsingLogService clientUsingLogService;
    
    @Resource
    private ErrorLogService errorLogService;
    
    @Override
	public void processMessage() {
    	logger.info(message);
    	if(message instanceof ClientData) {
    		ClientData clientData = (ClientData)message;
    		clientDataService.save(clientData);
    	}
    	else if(message instanceof ActivityLog) {
    		ActivityLog activityLog = (ActivityLog)message;
    		clientUsingLogService.save(activityLog);
    	}
		else if(message instanceof ClientTag) {
		    		
		}
		else if(message instanceof ErrorInfo) {
			ErrorInfo errorInfo = (ErrorInfo)message;
			errorLogService.save(errorInfo);
		}
		else if(message instanceof EventLog) {
			EventLog eventLog = (EventLog)message;
			eventDataService.save(eventLog);
		}
		else if(message instanceof UserId) {
			
		}
		else {
			
		}
	}

}