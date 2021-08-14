package edu.usc.iam.gap.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.usc.iam.gap.model.Guest;
import edu.usc.iam.gap.service.GuestService;



@RestController
@RequestMapping("/api/students/guests")
public class StudentController {
	
	@Autowired
	GuestService guestservice;
	private static Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@GetMapping("/{studentId}")
	public HttpEntity<?> getGuests(@PathVariable Integer studentId){
		HttpEntity<?> resp = null;
		
		try {
			Guest guest = guestservice.getGuest(studentId);
			resp = new ResponseEntity<Guest>(guest, HttpStatus.OK);
			
			
		} catch (Exception e) {
			return new ResponseEntity<String>("Unable to find studentId", HttpStatus.NOT_FOUND);		
			}
		return resp;
		
		
		}

		
		
			
	

}
