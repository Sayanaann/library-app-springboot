package com.example.libraryapp_backend.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="userreg")
public class Userreg {

    @Id
    @GeneratedValue

    private int id;
    private String name;
    private String aadharno;
    private String address;
    private String pincode;
    private String dateofbirth;
    private String emailid;
    private String phoneno;
    private String username;
    private String password;

    public Userreg() {
    }

    public Userreg(int id, String name, String aadharno, String address, String pincode, String dateofbirth, String emailid, String phoneno, String username, String password) {
        this.id = id;
        this.name = name;
        this.aadharno = aadharno;
        this.address = address;
        this.pincode = pincode;
        this.dateofbirth = dateofbirth;
        this.emailid = emailid;
        this.phoneno = phoneno;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadharno() {
        return aadharno;
    }

    public void setAadharno(String aadharno) {
        this.aadharno = aadharno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
