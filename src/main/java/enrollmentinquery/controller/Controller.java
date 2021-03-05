package enrollmentinquery.controller;

import java.util.concurrent.CompletableFuture;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import enrollmentinquery.model.Model;
import enrollmentinquery.service.ServiceClass;
import enrollmentinquery.utility.Utility;

/*import com.debi.java.builder.model.BuilderModel;
import com.debi.java.builder.service.BuilderService;*/

@RestController
public class Controller {
	
	private final ServiceClass service;
	private final Utility utility;
	
	@Autowired
	Controller(ServiceClass service, Utility utility) {
        this.service = service;
        this.utility = utility;
    }
	
	
	@RequestMapping(method = RequestMethod.POST, path="/enrollmentinquery")
    @ResponseStatus(HttpStatus.CREATED)
	String createInquiry(@RequestBody @Valid Model model) {
		String createdId = service.create(model);
		CompletableFuture.runAsync(()-> utility.sendAcknoladgement(createdId,model));
		return createdId;
	}
}
