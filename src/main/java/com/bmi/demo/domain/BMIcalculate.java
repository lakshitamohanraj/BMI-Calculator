package com.bmi.demo.domain;

public class BMIcalculate {
	
	private int height;
	  private int weight;
	  private float bmi;
  public BMIcalculate() {
		super();
		// TODO Auto-generated constructor stub
	}
  public BMIcalculate(int height, int weight) {
		super();
		this.height = height;
		this.weight = weight;
	}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

public float calculation() {
	 this.bmi=(float) (weight/(height*height*0.01*0.01));
	
	return this.bmi;
}

public String displayMessage() {
	
	String text="";
	if(this.bmi<18.5) {
		text="Under weight";
	}
	else if(this.bmi>=18.5 && this.bmi<=24.9) {
		text="Normal weight";
	}
	else if(this.bmi>=25 && this.bmi<=29.9) {
		text="Overweight";
	}
	else {
		text="Obesity";  //BMI order 30+
	}

return this.bmi+" "+text;
  
}

}