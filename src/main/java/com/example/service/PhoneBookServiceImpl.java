package com.example.service;

import com.example.dao.PhonebookDAO;
import com.example.entity.PhoneBook;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
public class PhoneBookServiceImpl implements PhoneBookService{
    private PhonebookDAO phoneBookDAO;

    public PhoneBookServiceImpl(PhonebookDAO phoneBookDAO) {
        this.phoneBookDAO = phoneBookDAO;
    }

    @Override
    @Transactional
    public PhoneBook getPhoneBook(int id) {
        return phoneBookDAO.getPhoneBook(id);
    }
    @Override
    @Transactional
    public List<PhoneBook> getPhoneBooks() {
        return phoneBookDAO.getPhoneBooks();
    }
    @Override
    @Transactional
    public void editRecordToPhoneBooks(PhoneBook newPhoneBook){
        phoneBookDAO.editRecordToPhoneBooks(newPhoneBook);
    }
    @Override
    @Transactional
    public void deleteRecordToPhoneBooks(int id){
        phoneBookDAO.deleteRecordToPhoneBooks(id);
    }
    @Override
    @Transactional
    public PhoneBook getNewPhoneBook() {
        return phoneBookDAO.getNewPhoneBook();
    }
    @Override
    @Transactional
    public void addRecordToPhoneBooks(PhoneBook newPhoneBook) {
        phoneBookDAO.addRecordToPhoneBooks(newPhoneBook);
    }
}

