package com.debi.java.builder.model;

import javax.validation.constraints.Size;

import org.bson.types.ObjectId;

import com.debi.java.builder.constant.BuilderConstant;
import com.debi.java.builder.entty.Address;

public class BuilderModel {
	private ObjectId id;
    private String builder_id;
    private String name;
    private String no_of_commercial_project;
    private String no_of_employees;
    
    @Size(max = BuilderConstant.MAX_LENGTH_OVERVIEW)
    private String overview;
    
    private String net_worth;
    private String company_size;
    private String no_of_logistics;
    private String[] cityof_presense;
    private String[] contact;
    private String[] project_list;
    private String[] certifications;
    private String[] photos_promotors;
    private String[] rating_inhouse;
    private String[] rating_customer;
    private Address[] address;
    private String director_name;
    private String[] client_list;
    
    
	public String getBuilder_id() {
		return builder_id;
	}
	public void setBuilder_id(String builder_id) {
		this.builder_id = builder_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNo_of_commercial_project() {
		return no_of_commercial_project;
	}
	public void setNo_of_commercial_project(String no_of_commercial_project) {
		this.no_of_commercial_project = no_of_commercial_project;
	}
	public String getNo_of_employees() {
		return no_of_employees;
	}
	public void setNo_of_employees(String no_of_employees) {
		this.no_of_employees = no_of_employees;
	}
	public String getOverview() {
		return overview;
	}
	public void setOverview(String overview) {
		this.overview = overview;
	}
	public String getNet_worth() {
		return net_worth;
	}
	public void setNet_worth(String net_worth) {
		this.net_worth = net_worth;
	}
	public String getCompany_size() {
		return company_size;
	}
	public void setCompany_size(String company_size) {
		this.company_size = company_size;
	}
	public String getNo_of_logistics() {
		return no_of_logistics;
	}
	public void setNo_of_logistics(String no_of_logistics) {
		this.no_of_logistics = no_of_logistics;
	}
	public String[] getCityof_presense() {
		return cityof_presense;
	}
	public void setCityof_presense(String[] cityof_presense) {
		this.cityof_presense = cityof_presense;
	}
	public String[] getContact() {
		return contact;
	}
	public void setContact(String[] contact) {
		this.contact = contact;
	}
	public String[] getProject_list() {
		return project_list;
	}
	public void setProject_list(String[] project_list) {
		this.project_list = project_list;
	}
	public String[] getCertifications() {
		return certifications;
	}
	public void setCertifications(String[] certifications) {
		this.certifications = certifications;
	}
	public String[] getPhotos_promotors() {
		return photos_promotors;
	}
	public void setPhotos_promotors(String[] photos_promotors) {
		this.photos_promotors = photos_promotors;
	}
	public String[] getRating_inhouse() {
		return rating_inhouse;
	}
	public void setRating_inhouse(String[] rating_inhouse) {
		this.rating_inhouse = rating_inhouse;
	}
	public String[] getRating_customer() {
		return rating_customer;
	}
	public void setRating_customer(String[] rating_customer) {
		this.rating_customer = rating_customer;
	}
	public Address[] getAddress() {
		return address;
	}
	public void setAddress(Address[] address) {
		this.address = address;
	}
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getDirector_name() {
		return director_name;
	}
	public void setDirector_name(String director_name) {
		this.director_name = director_name;
	}
	public String[] getClient_list() {
		return client_list;
	}
	public void setClient_list(String[] client_list) {
		this.client_list = client_list;
	}
}
