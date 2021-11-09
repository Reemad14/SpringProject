package com.sapiens.SpringDemo.daoSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonClientBean {
    @Autowired
    PersonService personService;

    public void run(){
        System.out.println("Persisting person");

        Person person = Person.create("mhg","sfg","sdagd");
        personService.savePerson(person);

        person = Person.create("demo", "twisavt", "122 Street");
        personService.savePerson(person);

        List<Person> allPersons = personService.getAllPersons();
        System.out.println("Persons Loaded: "+allPersons);

        person = personService.getPersonById(52);
        System.out.println("Person Loaded by id: "+ person);

        System.out.println("Update the Person with id 52 ");
        person.setAddress("111 yellow hill");
        personService.updatePerson(person);

        System.out.println("Deleting the person");
        personService.deletePerson(53);

        allPersons = personService.getAllPersons();
        System.out.println("Persons Loaded: "+allPersons);
    }
}
