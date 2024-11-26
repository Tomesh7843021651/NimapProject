package com.example.nimapbackend.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
public class ResponseDTO {
	
	int pages;
	long elements;
	boolean isLast;
	List<Products> products;

}
