package com.example.service;

import com.example.entity.PhoneBook;
import java.util.List;

public interface PhoneBookService {
    PhoneBook getPhoneBook(int id);
    List<PhoneBook> getPhoneBooks();
    void editRecordToPhoneBooks(PhoneBook newPhoneBook);
    void deleteRecordToPhoneBooks(int id);
    PhoneBook getNewPhoneBook();
    void addRecordToPhoneBooks(PhoneBook newPhoneBook);
}
