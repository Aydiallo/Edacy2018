/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edacy;

import java.util.ArrayList;

/**
 *
 * @author AYD
 */
public class School {
    
    private static int numberOfTalents = 0 ;
    private ArrayList<Talent> arrayOfTalents = new  ArrayList<Talent>();

    public School(ArrayList<Talent> arrayOfTalents) {
	this.arrayOfTalents = arrayOfTalents;
	numberOfTalents+=arrayOfTalents.size() ;
    }
    
    public School() {
	    }

    public static int getNumberOfTalent() {
	return numberOfTalents;
    }
    public void addTalent(Talent t)
    {
	this.arrayOfTalents.add(t) ;
	this.numberOfTalents++ ;
    }
    
    public String toString()
    {
	String mot = "This school count "+this.arrayOfTalents.size()+" talents";
	
	for(Talent t:this.arrayOfTalents)
	{
	    mot+= "\n***********************************\n";
	    mot+=t.toString();
	}
	return mot ;
    }
}
