package com.adib.course;

import javax.persistence.Entity;

import come.adib.core.BaseEntity;

@Entity
public class Course extends BaseEntity {
	private String title;
	private String url;
	
	protected Course() {
		super();
	}

	public Course(String title, String url) {
		this();
		this.title = title;
		this.url = url;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	

}
