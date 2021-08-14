package edu.usc.iam.gap.service.impl;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import edu.usc.iam.gap.model.Guest;
import edu.usc.iam.gap.service.GuestService;

@Service
public class GuestServiceImpl implements GuestService {

	@Override
	public Guest getGuest(Integer sudentId) {
		Guest gs = new Guest();
		gs.setFirst_name("venkata");
		gs.setLast_name("rowthu");
		gs.setEmail_address("vrowthu@deloitte.com");
		gs.setMax_guest_count(1);
		gs.setService_count(2);
		gs.setLast_logged_in(LocalDateTime.now());
		// TODO Auto-generated method stub
		return gs;
	}

}
