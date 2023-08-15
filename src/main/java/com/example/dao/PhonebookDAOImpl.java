package com.example.dao;

import com.example.entity.PhoneBook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class PhonebookDAOImpl implements PhonebookDAO{
    private SessionFactory sessionFactory;

    public PhonebookDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public PhoneBook getPhoneBook(int id) {
        Session session = sessionFactory.getCurrentSession();
        PhoneBook phoneBook = session.get(PhoneBook.class, id);
        return phoneBook;
    }

    @Override
    public List<PhoneBook> getPhoneBooks() {
        Session session = sessionFactory.getCurrentSession();
        List<PhoneBook> allPhoneBooks = session.createQuery("from PhoneBook", PhoneBook.class).getResultList();
        return allPhoneBooks;
    }

    @Override
    public void editRecordToPhoneBooks(PhoneBook newPhoneBook) {
        Session session = sessionFactory.getCurrentSession();
        session.merge(newPhoneBook);
    }

    @Override
    public void deleteRecordToPhoneBooks(int id) {
        Session session = sessionFactory.getCurrentSession();
        PhoneBook phoneBook = session.get(PhoneBook.class, id);
        session.remove(phoneBook);
    }

    @Override
    public PhoneBook getNewPhoneBook() {
        return new PhoneBook();
    }

    @Override
    public void addRecordToPhoneBooks(PhoneBook newPhoneBook) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(newPhoneBook);
    }
}
