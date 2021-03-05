package enrollmentinquery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import enrollmentinquery.entty.EntityClass;

/*import com.debi.java.builder.entty.BuilderEntity;
import com.debi.java.builder.model.BuilderModel;
*/
public interface  Repository extends JpaRepository<EntityClass,Integer>  {

	 @SuppressWarnings("unchecked")
	EntityClass save(EntityClass entityClass);
}
