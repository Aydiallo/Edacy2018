/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy;

/**
 *
 * @author AYD
 */
public class TalentForeign extends Talent {
    
    private String countryOfOrigin ;

    public TalentForeign(String countryOfOrigin, String name, String firstName, int age, String level, String specializationCourse) {
	super(name, firstName, age, level, specializationCourse);
	this.countryOfOrigin = countryOfOrigin;
    }

    public TalentForeign() {
	super() ;
	this.countryOfOrigin = "";
    }
    
    public String getCountryOfOrigin() {
	return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
	this.countryOfOrigin = countryOfOrigin;
    }
    
    public String toString()
    {
	return super.toString()+"Country of origin : " + this.getCountryOfOrigin()+"\n";
		
    }

    public void print()
    {
	super.print();
	System.out.println("Country of origin : "+this.getCountryOfOrigin());
    }
    
    
    
    
    
}
