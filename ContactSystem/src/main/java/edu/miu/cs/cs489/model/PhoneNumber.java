package edu.miu.cs.cs489.model;

public class PhoneNumber extends  Label{
    private Long phoneId;
    private String phonenum;

    public PhoneNumber(Long labelId, String name,Long phoneId, String phonenumber) {
        super(labelId, name);
        this.phoneId = phoneId;
        this.phonenum = phonenumber;
    }

    public Long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Long phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    @Override
    public String toString() {
        return "Phone Numbers  -"
                + "| number ='" + phonenum + '\''
                + "| label=" + getName();
    }
}
