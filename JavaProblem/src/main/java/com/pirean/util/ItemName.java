package com.pirean.util;

public enum ItemName {

	ORGANIC_BANANAS("Organic Bananas"),
	THERMAL_VEST("Thermal Vest"),
	AGED_BRIE("Aged Brie"),
	CHICKEN("Chicken"),
	SULFURAS("Sulfuras"),
	BACKSTAGE_PASSES("Backstage Passes"),
	GINGER_CAKE("Ginger Cake");
	
	private String value;
	
	ItemName(String v) {
		value = v;
	}
	
	public String getValue() {
		return value;
	}
}
