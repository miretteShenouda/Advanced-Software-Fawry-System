package com.Advanced.Software.Fawry.System.FawrySystem.Model.DiscountModel;


public abstract class Discounts {
	protected String dName,dType;
	protected int dValue;
	//protected DiscountViewer dViewer;
	
	
	public Discounts(String dName, String dType, int dValue) {
		this.dName=dName;
		this.dType=dType;
		this.dValue=dValue;
		//this.checkValidation=condition;
	}
	public String getDName()
	{
		return this.dName;
	}
	public String getDType()
	{
		return this.dType;
	}
	public int getDValue()
	{
		return this.dValue;
	}
		
	

}