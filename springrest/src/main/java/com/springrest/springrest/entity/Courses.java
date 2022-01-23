package com.springrest.springrest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {
	
	@Id
	private long cid;
	private String title;
	private String description;
	
	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Courses(long cid, String title, String description) {
		super();
		this.cid = cid;
		this.title = title;
		this.description = description;
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Courses [cid=" + cid + ", title=" + title + ", description=" + description + "]";
	}
	
	
	
}
