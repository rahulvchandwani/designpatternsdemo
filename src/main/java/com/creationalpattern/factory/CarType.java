package com.creationalpattern.factory;

public enum CarType {
	SEDAN("S", "SEDAN"), HATCHBACK("H", "HATCHBACK"), LUXURY("L","LUXURY");
	
	private String code;
	private String value;
	
	private CarType(String code, String value) {
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
