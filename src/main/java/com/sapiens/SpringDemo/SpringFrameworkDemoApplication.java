package com.sapiens.SpringDemo;

import com.sapiens.SpringDemo.ioc.Address;
import com.sapiens.SpringDemo.ioc.Contact;
import com.sapiens.SpringDemo.ioc.Employee;
import com.sapiens.SpringDemo.ioc.OfficialDetails;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
public class SpringFrameworkDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFrameworkDemoApplication.class, args);
		System.out.println("Spring IOC Demo");
		XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("Beans.xml"));

		Employee employee = (Employee) factory.getBean("employee");
		Address address = (Address) factory.getBean("address");
		Contact contact = (Contact) factory.getBean("contact");
		OfficialDetails officialDetails = (OfficialDetails) factory.getBean("officialDetails");


		System.out.println("------------- Employee Details --------------------");
		System.out.println("ID: "+employee.getId()+" \n"+"Name: "+employee.getName()+" \n"+"Age: "+employee.getAge()+" \n"+"Gender: "+employee.getGender() );

		System.out.println("------------- Address Details --------------------");
		System.out.println("City: "+address.getCity()+" \n"+"state: "+address.getState()+" \n"+"country: "+address.getCountry()+" \n"+"PinCode: "+address.getPincode()+" \n"+"Pos Box Number: "+address.getPoBoxNumber());

		System.out.println("------------- Contact Details --------------------");
		System.out.println("primary Mobile No: "+contact.getPrimaryMobileNo()+" \n"+"secondary Mobile No: "+contact.getSecondaryMobileNo()+" \n"+"emergency Contact No: "+contact.getEmergencyContactNo()+" \n"+"email Id: "+contact.getEmailId()+" \n"+"Official Mail Id: "+contact.getOfficialMailId());

		System.out.println("------------- Official Details --------------------");
		System.out.println("eduQualification: "+officialDetails.getEduQualification()+" \n"+"percentage: "+officialDetails.getPercentage()+" \n"+"Designation: "+officialDetails.getDesignation()+" \n"+"years Of Experience: "+officialDetails.getYearsOfExperience()+" \n"+"current Company Name: "+officialDetails.getCurrentCompanyName());

	}

}
