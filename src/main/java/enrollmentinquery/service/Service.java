package com.debi.java.builder.service;


import com.debi.java.builder.model.BuilderModel;

public interface  BuilderService {
	BuilderModel create(BuilderModel builderModel);
	
	BuilderModel update(BuilderModel builderModel);
	
}
