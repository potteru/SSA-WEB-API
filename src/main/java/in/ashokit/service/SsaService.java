package in.ashokit.service;

import org.springframework.stereotype.Service;

@Service
public class SsaService {
	
	public String fetchStateName(String ssn) {
		
		String stateName = null;
		
		if(ssn.startsWith("4")) {
			stateName = "New Jersey";
		}else if(ssn.startsWith("5")) {
			stateName = "Rhode Iland";
		}else if(ssn.startsWith("6")) {
			stateName = "Kentaccuy";
		}else if(ssn.startsWith("7")) {
			stateName = "Ohio";
		}else {
			stateName = "Invalid";
		}
		return stateName;	
	}
}
