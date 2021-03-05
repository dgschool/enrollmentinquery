package enrollmentinquery.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import enrollmentinquery.entty.EntityClass;
import enrollmentinquery.model.Model;
import enrollmentinquery.repository.Repository;
import enrollmentinquery.utility.Utility;

@Service
public class  ServiceImpl  implements ServiceClass {

	private final Repository repository;
	 @Autowired
	 private final Utility utility;
   
	 @Autowired
    ServiceImpl(Repository repository,Utility utility) {
        this.repository = repository;
        this.utility = utility;
    }	
    
	@Override
	public String create(Model model) {
		EntityClass persisted = utility.convertToBuilderEntity(model);
        persisted = repository.save(persisted);
        return utility.convertToBuilderModel(persisted);
	}
 
}
