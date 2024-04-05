package edu.miu.cs.cs489.model;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private Long contactId;
    private String firstname;
    private String lastname;
    private String company;
    private String job;

    private List<Email> emails = new ArrayList<Email>();
    private List<PhoneNumber> phones = new ArrayList<PhoneNumber>();

    public Contact(Long contactId, String firstname, String lastname, String company, String job) {
        this.contactId = contactId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.job = job;
    }

    public Long getContactId() {
        return contactId;
    }

    public void setContactId(Long contactId) {
        this.contactId = contactId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public List<Email> getEmails() {
        return emails;
    }

    public void setEmails(List<Email> emails) {
        this.emails = emails;
    }

    public List<PhoneNumber> getPhones() {
        return phones;
    }

    public void setPhones(List<PhoneNumber> phones) {
        this.phones = phones;
    }

    public void insertEmail(Email e){
        this.emails.add(e);
    }
    public void insertPhone(PhoneNumber ph){
        this.phones.add(ph);
    }

    public void deleteContact(Long id){
        this.contactId = '';
        this.firstname = '';
        this.lastname = '';
        this.company = '';
        this.job = '';
        this.emails = [];
        this.phones = [];
    }

    public Contact updateContact(Long contactId, String firstname, String lastname, String company, String job) {
        this.contactId = contactId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.job = job;
    }

    @Override
    public String toString() {
        return "|"
                + "ID=" + contactId
                + "| First Name='" + firstname + '\''
                + "| Last Name='" + lastname + '\''
                + "| Company=" + company
                + "| Job Title=" + job
                + "| Email Addresses=" + emails
                + "| Phone Number=" + phones;
    }

}
