package com.joalvarez.graphqlexample.data.dto;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.joalvarez.baseframework.data.dto.BaseDTO;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class StudentDTO implements BaseDTO {

	private Long id;
	private String name;
	private String lastname;
	private Integer age;
	private Integer idCourse;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getIdCourse() {
		return idCourse;
	}

	public void setIdCourse(Integer idCourse) {
		this.idCourse = idCourse;
	}
}
