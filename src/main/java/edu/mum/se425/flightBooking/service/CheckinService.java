package edu.mum.se425.flightBooking.service;

import java.util.List;

import edu.mum.se425.flightBooking.model.Checkin;



public interface CheckinService {

		public void checkin(Checkin c);
		public void addCheckin(Checkin ch);
		public List<Checkin> allCheckins();
}
