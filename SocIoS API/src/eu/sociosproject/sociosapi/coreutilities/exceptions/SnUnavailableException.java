/*
 *  Copyright 2013 National Technical University of Athens
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
 
package eu.sociosproject.sociosapi.coreutilities.exceptions;

import eu.sociosproject.sociosapi.SociosException;
/**
 *
 * @author SONY
 */
public class SnUnavailableException extends SociosException{

	//private static final long serialVersionUID = 0;
	private eu.sociosproject.sociosvoc.SociosException fault; 

	public SnUnavailableException() {
    }

    public SnUnavailableException(String message) {
        super(message);
    }
	
    public SnUnavailableException(int responseCode, String responseMsg) {
        //super(responseCode, responseMsg);
    	super(responseMsg);
    	this.fault = new eu.sociosproject.sociosvoc.SociosException();
    	this.fault.setFaultcode(String.valueOf(responseCode));
    }	
    
}
