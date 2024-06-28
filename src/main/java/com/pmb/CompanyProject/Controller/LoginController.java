package com.pmb.CompanyProject.Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pmb.CompanyProject.Model.BookingInfo;
import com.pmb.CompanyProject.Model.Contact;
import com.pmb.CompanyProject.Model.CreateAccount;
import com.pmb.CompanyProject.Model.Login;


import org.springframework.ui.Model;

@Controller
public class LoginController {

	@Autowired
	private SessionFactory sessionFactory;

	@RequestMapping("/")
	public String userAdminPage() {
		return "userAdmin";

	}
	
	@RequestMapping("loginPage")
	public String loginPage() {
		return "login";

	}

	@RequestMapping("loginData")
	public String loginData(CreateAccount createAccount, Model model, Login login) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		CreateAccount dbcreateAccount = session.get(CreateAccount.class, createAccount.getEmail());
		String page = "login";
		String msg = null;
		if (dbcreateAccount != null) {
			if (createAccount.getPassword().equals(dbcreateAccount.getPassword())) {
				page = "home";

			} else {
				msg = "Invalid Email";
			}
		} else {
			msg = "Invalid Password";
		}

		model.addAttribute("msg", msg);
		return page;

	}

	@RequestMapping("/createAccountPage")
	public String createAccountPage() {
		return "createAccount";

	}

	@RequestMapping("createAccountData")
	public String createAccountData(CreateAccount createAccount, Model model) {
		Session session = sessionFactory.openSession();
		Transaction t = session.beginTransaction();
		CreateAccount dbcreateAccount = session.get(CreateAccount.class, createAccount.getEmail());
		String page = "createAccount";
		String msg = null;
		if (dbcreateAccount != null) {
			if (createAccount.getPassword().equals(dbcreateAccount.getPassword())) {
				msg = "Already Registered Account";
			}
		} else {
			page = "login";
			session.save(createAccount);
			t.commit();
		}

		model.addAttribute("msg", msg);
		return page;
	}
	
	@RequestMapping("homepage")
	public String homepage() {
		return "home";
		
	}
	
	@RequestMapping("aboutpage")
	public String aboutpage() {
		return "about";
		
	}
	
	@RequestMapping("treatmentpage")
	public String treatementpage() {
		return "treatment";
		
	}
	
	@RequestMapping("doctorpage")
	public String doctorpage() {
		return "doctor";
		
	}
	
	@RequestMapping("testimonialpage")
	public String testimonialpage() {
		return "testimonial";
		
	}
	
	
	@RequestMapping("contactpage")
	public String contactpage() {
		return "contact";
		
	}
	
	@RequestMapping("/contactdata")
	public String contactPageDB(Contact contact, Model model) {
		Session s = sessionFactory.openSession();
		Transaction t = s.beginTransaction();
		Contact dbContact = s.get(Contact.class, contact.getEmail());
		String page = "contact";
		String msg = null;
		page = "contact";
		s.save(contact);
		t.commit();
		return page;
	}
	
	@RequestMapping("bookingdata") // API
	public String bookingdata(BookingInfo bookingInfo) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		BookingInfo dbbookingInfo = session.get(BookingInfo.class, bookingInfo.getPhone());
		
		String page="home";
		String msg=null;
		
		if (dbbookingInfo !=null) {
			if (bookingInfo.getPhone().equals(dbbookingInfo.getDate())) {
				msg="Already register phone";
			}
			} else {

				session.save(bookingInfo);
				transaction.commit();
			}
			
		return "home";
		
	}
	
	
	@RequestMapping("adminLoginPage")
	public String adminLoginPage() {
		return "adminLogin";

	}
	
	@RequestMapping("adminData")
	public String adminData(CreateAccount createAccount, Model model) {
		
		String msg = null;
		if (createAccount.getEmail().equals("pb@gmail.com") && createAccount.getPassword().equals("1111")) {
			return "ahome";
		} else {

			msg = "Invalid email and password";
			model.addAttribute("msg", msg);
			return "adminLogin";
		}
	}

		@RequestMapping("ahomepage")
		public String ahomepage() {
			return "ahome";
			
		}
		
		@RequestMapping("viewpatientloginpage")
		public String viewpatientloginpage() {
			return "viewPatientLogin";
			
		}
		
		@RequestMapping("viewappointmentbookpage")
		public String viewappointmentbookPage() {
			return "viewAppointmentBook";
			
		}
		
		@RequestMapping("savedata")
		public String savedata(CreateAccount createAccount) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.persist(createAccount);
			transaction.commit();
			return "viewPatientLogin";
			
		}
		
		@RequestMapping("updatedata")
		public String updatedata(CreateAccount createAccount) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(createAccount);
			transaction.commit();
			return "viewPatientLogin";
			
		}
		
		@RequestMapping("deletedata")
		public String deletedata(String email) {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			CreateAccount createAccount = session.get(CreateAccount.class, email);
			session.delete(createAccount);
			transaction.commit();
			return "viewPatientLogin";
	
		
		
		}
	}
	

