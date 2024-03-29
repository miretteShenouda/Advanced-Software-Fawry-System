package system;

import java.util.Scanner;
import java.util.Vector;

public class Form {
	public int numberOfFields ;
	public Vector<FormFields> vec = new Vector<>();
	Scanner scanInput = new Scanner(System.in);
	
	public void setNumberOfFields(int numberOfFields)
	{
	    this.numberOfFields = numberOfFields ;
	}

	public int getNumberOfFields()
	{
		return numberOfFields;
	}

	public Vector<FormFields> getFormFields()
	{
		return this.vec ;
	}
	// public void setVec(FormFields vec){
	//	 this.vec= vec;
	 //}
	 
	public Form (int numberOfFields) 
	{
	    //Form F= new Form() ;
		for(int i=0;i<numberOfFields ;i++)
		{  
			String fieldName;
			
			int choice ;
			System.out.print("choose field type if \n DropDown-> 1 \n text->2");
			choice =scanInput.nextInt();

			System.out.print("Enter field name: ");
			fieldName =scanInput.next();
			
			if (choice==1)
			{
				DropDown D =new DropDown(fieldName); 
				this.vec.add(D);
			}
			else if (choice==2)
			{
				this.vec.add(new Text(fieldName));
			}			
	    }
	}

	public void showForm()
	{
		for(int i=0;i<numberOfFields ;i++)
		{
			this.vec.get(i).showFields();
		}
	}
	
	public void setForm()
	{
		for(int i=0;i<numberOfFields ;i++)
		{
			this.vec.get(i).setFields();;
		}
	}
}
