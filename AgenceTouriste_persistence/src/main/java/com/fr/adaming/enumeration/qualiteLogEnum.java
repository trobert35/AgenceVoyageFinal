package com.fr.adaming.enumeration;

import lombok.Getter;

@Getter
public enum qualiteLogEnum {
	/**
	 * @author Claire
	 */
	
	//L'agence définit la qualité du logement pour chaque instance de logement.

	un("1"), deux("2"), trois("3"), quatre("4"), cinq("5");
	
	private String qualLog="";

	private qualiteLogEnum(String qualLog) {
		this.qualLog = qualLog;
	}
	
	
}
