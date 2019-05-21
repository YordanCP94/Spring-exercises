package com.example.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeContraintValidator implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix; 
	
	@Override
	public void initialize(CourseCode courseCode) {
		coursePrefix = courseCode.value();
	}
	
	@Override
	public boolean isValid(String courseCodeEntered, ConstraintValidatorContext constraintValidatorContext) {
		boolean result;
		
		if(courseCodeEntered != null) {
			result = courseCodeEntered.startsWith(coursePrefix);
		}else {
			return true;
		}
		
		return result;
	}
	
}
