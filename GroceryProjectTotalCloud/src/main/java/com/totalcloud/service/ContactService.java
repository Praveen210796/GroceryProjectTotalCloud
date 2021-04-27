package com.totalcloud.service;

import javax.mail.MessagingException;
import com.totalcloud.entity.Contact;

public interface ContactService {
	
	void saveContacts(Contact contact) throws MessagingException;

}
