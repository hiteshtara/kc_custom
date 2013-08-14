package edu.bu.kuali.kra.award.web.struts.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.kuali.kra.award.AwardForm;
import org.kuali.kra.award.document.AwardDocument;
import org.kuali.kra.custom.bo.AwardExtension;
import org.kuali.kra.infrastructure.Constants;
import org.kuali.kra.infrastructure.KraServiceLocator;
import org.kuali.rice.coreservice.framework.parameter.ParameterService;
import org.springframework.beans.factory.FactoryBean;

import edu.bu.kuali.award.service.AwardHomeActionTrainingService;

public class AwardHomeAction extends org.kuali.kra.award.web.struts.action.AwardHomeAction {
//implements FactoryBean{
private	AwardHomeActionTrainingService awardHomeActionTrainingService ;
	
	

	public void setAwardHomeActionTrainingService(
		AwardHomeActionTrainingService awardHomeActionTrainingService) {
	this.awardHomeActionTrainingService = awardHomeActionTrainingService;
}
	public ActionForward trainingRefresh(ActionMapping mapping, ActionForm form, 
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {
		
		 
		AwardForm awardForm = (AwardForm)form;
		AwardDocument awardDocument= awardForm.getAwardDocument();
		//((AwardExtension) awardDocument.getAward().getExtension()).setCustomField1(null);
		//((AwardExtension) awardDocument.getAward().getExtension()).setCustomField2(null);
		//((AwardHomeActionTrainingService) getObject()).trainingRefresh(awardDocument.getAward());
		getAwardHomeActionTrainingService().trainingRefresh(awardDocument.getAward());
		return mapping.findForward("basic");

	
}
	protected AwardHomeActionTrainingService getAwardHomeActionTrainingService() {
       if (this.awardHomeActionTrainingService == null) {
           this.awardHomeActionTrainingService = KraServiceLocator.getService(AwardHomeActionTrainingService.class);        
       }
       return this.awardHomeActionTrainingService;
//    }
//	public Object getObject() throws Exception {
//		// TODO Auto-generated method stub
//		return awardHomeActionTrainingService;
//	}
//	public Class getObjectType() {
//		// TODO Auto-generated method stub
//		return AwardHomeActionTrainingService.class;
//	}
//	public boolean isSingleton() {
//		// TODO Auto-generated method stub
//		return true;
//	}
}
}