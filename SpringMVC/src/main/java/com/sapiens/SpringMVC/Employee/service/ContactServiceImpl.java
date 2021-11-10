package com.sapiens.SpringMVC.Employee.service;

import com.sapiens.SpringMVC.Employee.model.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{
    @Override
    public List<Contact> findAll() {
        ArrayList<Contact> contacts = new ArrayList<Contact>();

        contacts.add(new Contact("035-243","ABC Street", "Reema@example.com","efwqef"));
        contacts.add(new Contact("023-113","Jane Street", "Akaber@gmail.com","ersdef"));
        contacts.add(new Contact("013-000","Demp Street", "Salma@hotmail.com","mjmg"));
        contacts.add(new Contact("038-563","Str Street", "Luzan123@example.com","xzsc"));
        contacts.add(new Contact("035-763","ATF Street", "Steve@gmail.com","abcd"));

        return contacts;
    }
}
