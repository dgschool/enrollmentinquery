package com.debi.java.builder.service;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.debi.java.builder.entty.BuilderEntity;
import com.debi.java.builder.model.BuilderModel;
import com.debi.java.builder.repository.BuilderRepository;

@Service
public class BuilderServiceImpl implements BuilderService{

	private final BuilderRepository builderRepository;
	
	
    @Autowired
    BuilderServiceImpl(BuilderRepository builderRepository) {
        this.builderRepository = builderRepository;
    }	
	
	@Override
	public BuilderModel create(BuilderModel builderModel) {
		BuilderEntity persisted = convertToBuilderEntity(builderModel);
        persisted = builderRepository.save(persisted);
        return convertToBuilderModel(persisted);
	}
	
	
	@Override
	public BuilderModel update(BuilderModel builderModel) {
		if(isBuilderExist(builderModel.getId())) {
			BuilderEntity persisted = convertToBuilderEntity(builderModel);
	        persisted = builderRepository.save(persisted);
	        return convertToBuilderModel(persisted);
		}
		else {
			return new BuilderModel();
		}
	}
	
	private boolean isBuilderExist(ObjectId id) {
		if(null != builderRepository.findById(id)) {
			return true;
		}
		return false;
	}
	
	 
	
	private BuilderModel convertToBuilderModel(BuilderEntity entity) {
		BuilderModel model = new BuilderModel();
		model.setId(entity.getId());
		model.setBuilder_id(entity.getBuilder_id());
		model.setName(entity.getName());
		model.setDirector_name(entity.getDirector_name());
		model.setCityof_presense(entity.getCityof_presense());
		model.setClient_list(entity.getClient_list());
		model.setNo_of_commercial_project(entity.getNo_of_commercial_project());
		model.setNo_of_employees(entity.getNo_of_employees());
		model.setOverview(entity.getOverview());
		model.setNet_worth(entity.getNet_worth());
		model.setCompany_size(entity.getCompany_size());
		model.setNo_of_logistics(entity.getNo_of_logistics());
		model.setContact(entity.getContact());
		model.setProject_list(entity.getProject_list());
		model.setCertifications(entity.getCertifications());
		model.setPhotos_promotors(entity.getPhotos_promotors());
		model.setRating_inhouse(entity.getRating_inhouse());
		model.setRating_customer(entity.getRating_customer());
		model.setAddress(entity.getAddress());
        return model;
    }
	
	private BuilderEntity convertToBuilderEntity(BuilderModel model) {
		BuilderEntity entity = new BuilderEntity();
		entity.setId(model.getId());
		entity.setBuilder_id(model.getBuilder_id());
		entity.setName(model.getName());
		entity.setDirector_name(model.getDirector_name());
		entity.setCityof_presense(model.getCityof_presense());
		entity.setClient_list(model.getClient_list());
		entity.setNo_of_commercial_project(model.getNo_of_commercial_project());
		entity.setNo_of_employees(model.getNo_of_employees());
		entity.setOverview(model.getOverview());
		entity.setNet_worth(model.getNet_worth());
		entity.setCompany_size(model.getCompany_size());
		entity.setNo_of_logistics(model.getNo_of_logistics());
		entity.setContact(model.getContact());
		entity.setProject_list(model.getProject_list());
		entity.setCertifications(model.getCertifications());
		entity.setPhotos_promotors(model.getPhotos_promotors());
		entity.setRating_inhouse(model.getRating_inhouse());
		entity.setRating_customer(model.getRating_customer());
		entity.setAddress(model.getAddress());
        return entity;
    }
}
