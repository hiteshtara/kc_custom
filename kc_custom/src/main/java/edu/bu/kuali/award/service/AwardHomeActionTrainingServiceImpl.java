package edu.bu.kuali.award.service;

import org.kuali.kra.award.home.Award;
import org.kuali.kra.custom.bo.AwardExtension;

public class AwardHomeActionTrainingServiceImpl implements AwardHomeActionTrainingService{

	private String serviceName;
	
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public void trainingRefresh(Award award) {
		((AwardExtension) award.getExtension()).setCustomField1(null);
		((AwardExtension) award.getExtension()).setCustomField2(null);
		
		
	}

}
