package com.fr.adaming.enumeration;

import lombok.Getter;

@Getter
public enum typeActEnum {
	/**
	 * @author Claire
	 */

	//L'agence définit le type d'activités disponibles pour chaque instance d'activité.
	
	escalade("escalade"), plage("plage"), monument("monument"), musee("musee"), spa("spa"), 
	randonnee("randonnee"), croisiere("croisiere"), golf("golf"), plongee("plongee"), safari("safari"), tour("tour");
	
	private String typeAct = "";

	private typeActEnum(String typeAct) {
		this.typeAct = typeAct;
	}
	
	
}
