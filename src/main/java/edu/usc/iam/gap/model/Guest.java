package edu.usc.iam.gap.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Guest {
	private String first_name = "N/A";
	private String last_name ="N/A";
	private String email_address="N/A";
	private int service_count=0;
	private LocalDateTime last_logged_in;
	private int max_guest_count=0;
	enum Status
    { 
		Active, Invited, Expired; 
    }
	
	
	

}
