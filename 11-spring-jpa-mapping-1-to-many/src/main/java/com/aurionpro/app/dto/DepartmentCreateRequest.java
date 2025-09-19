package com.aurionpro.app.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DepartmentCreateRequest {
	@NotBlank
	private String name;

//	public String getName() {
//		return name;
//	}

//	public void setName(String name) {
//		this.name = name;
//	}


}
