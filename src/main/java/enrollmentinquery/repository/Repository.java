package com.debi.java.builder.repository;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.debi.java.builder.entty.BuilderEntity;
import com.debi.java.builder.model.BuilderModel;

public interface  BuilderRepository extends MongoRepository<BuilderEntity, String> {

	@SuppressWarnings("unchecked")
	BuilderEntity save(BuilderEntity builderEntity);
	
	BuilderModel findById(ObjectId _id);
}
