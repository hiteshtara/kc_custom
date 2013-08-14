package org.kuali.kra.custom.bo;

import org.kuali.kra.bo.KraPersistableBusinessObjectBase;
import org.kuali.rice.krad.bo.PersistableBusinessObjectExtension;

public class AwardExtension extends KraPersistableBusinessObjectBase 
				implements PersistableBusinessObjectExtension {

	private static final long serialVersionUID = 3138263301644052314L;
	
	private Long awardId;
	private String customField1;
	private String customField2;
	
	public Long getAwardId() {
		return awardId;
	}
	public void setAwardId(Long awardId) {
		this.awardId = awardId;
	}
	public String getCustomField1() {
		return customField1;
	}
	public void setCustomField1(String customField1) {
		this.customField1 = customField1;
	}
	public String getCustomField2() {
		return customField2;
	}
	public void setCustomField2(String customField2) {
		this.customField2 = customField2;
	}
	
}
