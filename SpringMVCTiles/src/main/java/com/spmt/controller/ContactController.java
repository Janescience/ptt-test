package com.spmt.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.spmt.form.Contact;
@Controller
@SessionAttributes
public class ContactController {
	
	@RequestMapping(value = "/addContact", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contact")	Contact contact, BindingResult result,Model m) {
		m.addAttribute("firstName", contact.getFirstname());
		m.addAttribute("lastName", contact.getLastname());
		return "detail";
	}
	
	@RequestMapping("/contact")
	public String showContacts(Model m) {
		m.addAttribute("command", new Contact());
		return "contact";
	}
}
