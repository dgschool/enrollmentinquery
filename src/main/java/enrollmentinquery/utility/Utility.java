package enrollmentinquery.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;

import enrollmentinquery.constant.Constant;
import enrollmentinquery.entty.EntityClass;
import enrollmentinquery.model.Model;

public class Utility {

	@Autowired
	Email email;
	public String convertToBuilderModel(EntityClass entity) {
        return String.valueOf(entity.getID());
    }

	public EntityClass convertToBuilderEntity(Model model) {
		EntityClass entity = new EntityClass();
		
		entity.setBRANCH_ID( StringUtils.hasText(model.getBRANCH_ID()) ? model.getBRANCH_ID() : Constant.DEFAULT_BRANCHID);
		entity.setF_NAME(model.getF_NAME());
		entity.setL_NAME(model.getL_NAME());
		entity.setDOB(model.getDOB());
		entity.setMOB(model.getMOB());
		entity.setEMAIL(model.getEMAIL());
		entity.setGRADE(model.getGRADE());
		entity.setSTATUS(Constant.ENROLMENTINQUERY_STATUS_INQUIRED);
		
		entity.setCreated_by(model.getLOGIN_USER());
		 
		return entity;
	}

	public void sendAcknoladgement(String createdId, Model model) {

		
		// send mail to the Office mail Id to receive all the inquiry mails
		sendEnrollInquiryEmailToOffice(createdId,model);
		
		// send mail to the person who have done the inquiry with the inquiry number for further reference
		sendEnrollInquiryEmailToRequestor(createdId,model);
	}

	/* Send email notification to the office mail saying some one has done the inquiry for enrollment*/
	
	private void sendEnrollInquiryEmailToOffice(String createdId, Model model) {
		StringBuffer content = new StringBuffer();
		content.append(Constant.ENROLMENTINQUERY_MAIL_SUBJECT);
		content.append("<html><body>");
		content.append("<br>");
		content.append("<Tr>");
		content.append("<font color=\"bllue\"> ");
		content.append(Constant.ENROLMENTINQUERY_MAIL_CONTENT);
		content.append("</font>");
		content.append("<br>");
		content.append("Name : " + model.getF_NAME()+ " "+ model.getL_NAME() );
		content.append("<br>");
		content.append("Mob : " + model.getMOB());
		content.append("<br>");
		content.append("Email : " + model.getEMAIL());
		content.append("<br>");
		content.append("Clasd Inquired For : " + model.getGRADE());
		content.append("</Tr>");
		content.append("<br>");
		content.append("<br>");
		content.append("<br>");
		content.append("Thanks");
		content.append("<br>");
		content.append("This is an automated email. Donot replay to this");
		content.append("<br>");
		content.append("</body></html>");
		email.sendEmail(null, null, content.toString(), Constant.ENROLMENTINQUERY_MAIL_SUBJECT+Constant.ENROLMENTINQUERY_MAIL_SEPARATOR+createdId +Constant.ENROLMENTINQUERY_MAIL_SEPARATOR+model.getGRADE() );
	}
	

	private void sendEnrollInquiryEmailToRequestor(String createdId, Model model) {
		StringBuffer content = new StringBuffer();
		content.append("<html><body>");
		content.append("<br>");
		content.append("<Tr>");
		content.append("<br>");
		content.append("Dear  : " + model.getF_NAME()+",");
		content.append("<br>");
		content.append("You have successfully created the inquery. Please have the inquirey number for future correspondance");
		content.append("<br>");
		content.append("Enrolment Inquery Id : "+createdId);
		content.append("<br>");
		content.append("</Tr>");
		content.append("<br>");
		content.append("<br>");
		content.append("<br>");
		content.append("Thanks");
		content.append("<br>");
		content.append("This is an automated email. Donot replay to this");
		content.append("<br>");
		content.append("</body></html>");
		email.sendEmail(null, null, content.toString(), Constant.ENROLMENTINQUERY_MAIL_SUBJECT+Constant.ENROLMENTINQUERY_MAIL_SEPARATOR+createdId +Constant.ENROLMENTINQUERY_MAIL_SEPARATOR+model.getGRADE() );
		
	}

}
