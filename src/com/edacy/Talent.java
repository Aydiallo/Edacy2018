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
public class Talent {
    
    private String name ;
    private String firstName ;
    private int age;
    private String level ;
    private String specializationCourse ;

    public Talent(String name, String firstName, int age, String level, String specializationCourse) {
	this.name = name;
	this.firstName = firstName;
	this.age = age;
	this.level = level;
	this.specializationCourse = specializationCourse;
    }
    
    public Talent() {
	this.name = "";
	this.firstName = "";
	this.age = 0;
	this.level = "";
	this.specializationCourse = "";
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public String getLevel() {
	return level;
    }

    public void setLevel(String level) {
	this.level = level;
    }

    public String getSpecializationCourse() {
	return specializationCourse;
    }

    public void setSpecializationCourse(String specializationCourse) {
	this.specializationCourse = specializationCourse;
    }
    public String toString()
    {
	return "Name : " + this.getName()+"\n"+
		"First name : " + this.getFirstName()+"\n"+
		"Age : "+this.getAge()+"\n"+
		"Level : "+this.getLevel()+"\n"+
		"Specialization course : "+this.getSpecializationCourse()+"\n";
    }
    public void print()
    {
	System.out.print(this);
    }
}
