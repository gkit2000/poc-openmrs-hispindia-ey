/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.idgen.validator;

/**
 * A IdentifierValidator based on the Luhn Mod-N Algorithm
 * This allows alphanumeric characters, excluding 0,1,2,5,8,B,I,O,Q,S,Z
 * See http://en.wikipedia.org/wiki/Luhn_mod_N_algorithm
 */
public class LuhnMod25IdentifierValidator extends LuhnModNIdentifierValidator {
	
	/**
	 * @see LuhnModNIdentifierValidator#getBaseCharacters()
	 */
	@Override
	public String getBaseCharacters() {
		return "34679ACDEFGHJKLMNPRTUVWXY";
	}
}
