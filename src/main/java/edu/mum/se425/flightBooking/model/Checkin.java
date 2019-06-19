//package edu.mum.se425.flightBooking.model;
//
//import java.time.LocalTime;
//
//import javax.persistence.Entity;
//import javax.persistence.Table;
//
//@Entity
//@Table(name ="check_in")
//public class Checkin {
//
//		private Long id;
//		private String lastName;
//		private String email;
//		private LocalTime chechinTime;
//		private String chechinMethod;
//
//		//constructor
//		public Checkin() {
//
//		}
//
//
//
//		public Checkin(String lastName, String email, LocalTime chechinTime, String chechinMethod) {
//			super();
//			this.lastName = lastName;
//			this.email = email;
//			this.chechinTime = chechinTime;
//			this.chechinMethod = chechinMethod;
//		}
//
//
//
//		//getters and setters
//		public Long getId() {
//			return id;
//		}
//
//		public void setId(Long id) {
//			this.id = id;
//		}
//
//		public LocalTime getChechinTime() {
//			return chechinTime;
//		}
//
//		public void setChechinTime(LocalTime chechinTime) {
//			this.chechinTime = chechinTime;
//		}
//
//		public String getChechinMethod() {
//			return chechinMethod;
//		}
//
//		public void setChechinMethod(String chechinMethod) {
//			this.chechinMethod = chechinMethod;
//		}
//
//		public String getLastName() {
//			return lastName;
//		}
//
//
//
//		public void setLastName(String lastName) {
//			this.lastName = lastName;
//		}
//
//
//
//		public String getEmail() {
//			return email;
//		}
//
//
//
//		public void setEmail(String email) {
//			this.email = email;
//		}
//
//
//
//		//to string method
//		@Override
//		public String toString() {
//			return "Checkin [id=" + id + ", chechinTime=" + chechinTime + ", chechinMethod=" + chechinMethod + "]";
//		}
//
//
//
//}
