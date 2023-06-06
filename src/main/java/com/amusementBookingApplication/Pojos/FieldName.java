package com.amusementBookingApplication.Pojos;

import lombok.Data;

@Data
public class FieldName {
	
	String field = "dateTime";
	String field1 = "customer";
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getField1() {
		return field1;
	}
	public void setField1(String field1) {
		this.field1 = field1;
	}
	
	
}
