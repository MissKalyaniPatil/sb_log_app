package in.ashokit.service;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Service;



@Service
public class MsgService {

	private Logger logger = LoggerFactory.getLogger(MsgService.class);
	
	public String getWelcomeMsg() {
		
		logger.trace("this is trace msg..");
		logger.debug("this is debug msg..");
		
		logger.info("getWelcomeMsg() - started..");
		
		String msg = "Wel come to Ashokit ";
		
		logger.info("getWelcome() - ended...");
		
		logger.warn("this is warning msg..");
		logger.error("this is error msg..");
		
		return msg;
	}
}
