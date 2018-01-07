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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	// TODO code application logic here
	Talent talent1 = new Talent("Alpha Yankhouba", "Diallo", 23, "Master", "Informatique") ;
	TalentForeign talentForeign1 = new TalentForeign("Guinea","Thierno", "Baldé", 25, "Master", "Sociologie") ;
	Talent talent2 = new Talent("Bara", "Diop", 24, "Master", "Informatique") ;
	TalentForeign talentForeign2 = new TalentForeign("Togo","Ikepa", "Guessan", 21, "Licence", "Francais") ;
	Talent talent3 = new Talent("Suzanne", "Fall", 26, "Doctorat", "Agronomie") ;
	TalentForeign talentForeign3 = new TalentForeign("Suisse","Gueritt", "Suzie", 20, "Licence", "Medecine") ;
	
        ArrayList<Talent> listeTalents = new  ArrayList<Talent>();
	listeTalents.add(talent1);listeTalents.add(talentForeign1);
	listeTalents.add(talent2);listeTalents.add(talentForeign2);
	listeTalents.add(talent3);listeTalents.add(talentForeign3);
	
	School school = new School(listeTalents) ;
	System.out.println(school);
    }
    
}
