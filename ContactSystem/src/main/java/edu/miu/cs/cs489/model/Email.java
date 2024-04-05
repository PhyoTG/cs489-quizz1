package edu.miu.cs.cs489.model;

public class Email extends Label {
    private Long emailId;
    private String address;
    public Email(Long labelId, String name) {
        super(labelId, name);
    }
    public Email(Long labelId, String name, Long emailId, String address) {
        super(labelId, name);
        this.emailId = emailId;
        this.address = address;
    }

    public Long getEmailId() {
        return emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setEmailId(Long emailId) {
        this.emailId = emailId;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emails  -"
                + "| address ='" + address + '\''
                + "| label=" + getName();
    }
}
