package com.appleframework.ums.server.storage.receiver;

import org.apache.log4j.Logger;

import com.appleframework.jms.kafka.consumer.ObjectMessageConsumer;
import com.appleframework.ums.server.core.model.ActivityLog;
import com.appleframework.ums.server.core.model.ClientData;
import com.appleframework.ums.server.core.model.ClientTag;
import com.appleframework.ums.server.core.model.ErrorInfo;
import com.appleframework.ums.server.core.model.EventLog;
import com.appleframework.ums.server.core.model.UserId;

/**
 * CollectMessageReceiver
 * 
 * @author cruise.xu
 */
public class CollectMessageReceiver extends ObjectMessageConsumer {

    private static final Logger logger = Logger.getLogger(CollectMessageReceiver.class);
    
    @Override
	public void processMessage() {
    	logger.info(message);
    	if(message instanceof ClientData) {
    		
    	}
    	else if(message instanceof ActivityLog) {
    		
    	}
		else if(message instanceof ClientTag) {
		    		
		}
		else if(message instanceof ErrorInfo) {
			
		}
		else if(message instanceof ActivityLog) {
			
		}
		else if(message instanceof EventLog) {
			
		}
		else if(message instanceof UserId) {
			
		}
		else {
			
		}
	}

}