package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "phonebook")
public class PhoneBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phonebook_id")
    private int phoneBookID;
    // Фамилия
    @Column(name = "last_name")
    private String lastName;
    // Имя
    @Column(name = "first_name")
    private String firstName;
    // Отчество
    @Column(name = "three_name")
    private String threeName;
    // Номер телефона
    @Column(name = "number_phone")
    private String numberPhone;
    //Адрес
    @Column(name = "address")
    private String address;
    // Описание
    @Column(name = "description")
    private String description;

    public PhoneBook() {
        phoneBookID = 0;
        lastName = "";
        firstName = "";
        threeName = "";
        numberPhone = "";
        address = "";
        description = "";
    }

    public PhoneBook(int phoneBookID, String lastName, String firstName, String threeName, String numberPhone, String address, String description) {
        this.phoneBookID = phoneBookID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.threeName = threeName;
        this.numberPhone = numberPhone;
        this.address = address;
        this.description = description;
    }

    public int getPhoneBookID() {
        return phoneBookID;
    }

    public void setPhoneBookID(int phoneBookID) {
        this.phoneBookID = phoneBookID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getThreeName() {
        return threeName;
    }

    public void setThreeName(String threeName) {
        this.threeName = threeName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
            "PhoneBookID=" + phoneBookID +
            ", LastName='" + lastName + '\'' +
            ", FirstName='" + firstName + '\'' +
            ", ThreeName='" + threeName + '\'' +
            ", NumberPhone='" + numberPhone + '\'' +
            ", Address='" + address + '\'' +
            ", Description='" + description + '\'' +
            '}';
    }
}
