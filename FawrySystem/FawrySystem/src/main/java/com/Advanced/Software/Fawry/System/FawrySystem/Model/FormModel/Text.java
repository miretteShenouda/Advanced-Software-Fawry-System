package com.Advanced.Software.Fawry.System.FawrySystem.Model.FormModel;

public class Text implements FormFields {
	protected String fieldType;
	protected String fieldName;
	public String text; //string for the text field

	public Text (String fName) {
		this.fieldType="text";
		this.fieldName= fName;
	} 
	public Text () {
		this.fieldType="text";
	}
	

	@Override
	public String getFieldType() {
        return this.fieldType;
    }
	@Override
    public String getFieldName() {
        return this.fieldName;
    }
	@Override
	public void setField(String text) {
		this.text=text;
	}
	@Override
	public String getFinalValue() {
		return this.text;
	}
	
}
