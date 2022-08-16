package com.store.customer;

public class customer {
private String Name;
private String Email;
private String Address;
private long mobile;
private boolean membership;

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getAddress() {
        return Address;
    }

    public long getMobile() {
        return mobile;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }
}
