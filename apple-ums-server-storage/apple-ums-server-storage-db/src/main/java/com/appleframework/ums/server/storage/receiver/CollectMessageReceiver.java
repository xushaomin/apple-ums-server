package com.appleframework.ums.server.storage.receiver;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.appleframework.jms.kafka.consumer.MessageAndMetadataConsumer;
import com.appleframework.ums.server.core.model.ClientData;
import com.appleframework.ums.server.core.model.ClientDataJson;
import com.appleframework.ums.server.core.model.ErrorLog;
import com.appleframework.ums.server.core.model.ErrorLogJson;
import com.appleframework.ums.server.core.model.EventLog;
import com.appleframework.ums.server.core.model.EventLogJson;
import com.appleframework.ums.server.core.model.UsingLog;
import com.appleframework.ums.server.core.model.UsingLogJson;
import com.appleframework.ums.server.storage.service.ClientDataService;
import com.appleframework.ums.server.storage.service.ClientUsingLogService;
import com.appleframework.ums.server.storage.service.ErrorLogService;
import com.appleframework.ums.server.storage.service.EventLogService;

import kafka.message.MessageAndMetadata;

/**
 * CollectMessageReceiver
 * 
 * @author cruise.xu
 */
public class CollectMessageReceiver extends MessageAndMetadataConsumer {

	private static final Logger logger = Logger.getLogger(CollectMessageReceiver.class);

	@Resource
	private ClientUsingLogService clientUsingLogService;

	@Resource
	private ErrorLogService errorLogService;

	@Resource
	private EventLogService eventLogService;

	@Resource
	private ClientDataService clientDataService;

	@Override
	public void processMessage(MessageAndMetadata<byte[], byte[]> message) {
		try {
			String topic = message.topic();
			String content = new String(message.message());
			String ip = new String(message.key());

			if (topic.equals("topic_eventlog")) {
				EventLogJson json = JSON.parseObject(content, EventLogJson.class);
				List<EventLog> data = json.getData();
				for (EventLog log : data) {
					eventLogService.save(log);
				}
			} else if (topic.equals("topic_errorlog")) {
				ErrorLogJson json = JSON.parseObject(content, ErrorLogJson.class);
				List<ErrorLog> data = json.getData();
				for (ErrorLog log : data) {
					errorLogService.save(log);
				}
			} else if (topic.equals("topic_clientdata")) {
				ClientDataJson json = JSON.parseObject(content, ClientDataJson.class);
				List<ClientData> data = json.getData();
				for (ClientData log : data) {
					clientDataService.save(log, ip);
				}
			} else if (topic.equals("topic_usinglog")) {
				UsingLogJson json = JSON.parseObject(content, UsingLogJson.class);
				List<UsingLog> data = json.getData();
				for (UsingLog log : data) {
					clientUsingLogService.save(log);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e);
		}

	}

}