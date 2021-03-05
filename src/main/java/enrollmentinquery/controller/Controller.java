package enrollmentinquery.controller;

import javax.validation.Valid;

//import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/*import com.debi.java.builder.model.BuilderModel;
import com.debi.java.builder.service.BuilderService;*/

@RestController
@RequestMapping("/api/builder")
public class Controller {

	/*
	private final BuilderService service;
	 
    @Autowired
    BuilderController(BuilderService service) {
        this.service = service;
    }
 
    @RequestMapping(method = RequestMethod.POST, path="/createBuilder")
    @ResponseStatus(HttpStatus.CREATED)
    BuilderModel create(@RequestBody @Valid BuilderModel builderModel) {
        return service.create(builderModel);
    }
    
    @RequestMapping(value = "/modifyBuilder/{id}", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public BuilderModel modifyBuilderByBuilderId(@PathVariable("id") ObjectId id, @Valid @RequestBody BuilderModel builderModel) {
    	builderModel.setId(id);
    	return service.update(builderModel);
    }*/
}
