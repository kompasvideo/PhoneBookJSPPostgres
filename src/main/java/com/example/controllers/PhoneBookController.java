package com.example.controllers;

import com.example.entity.PhoneBook;
import com.example.service.PhoneBookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PhoneBookController {
    private PhoneBookService phoneBookService;

    public PhoneBookController(PhoneBookService phoneBookService) {
        this.phoneBookService = phoneBookService;
        String url = "jdbc:postgresql://localhost:5432/postgres";
        String user = "postgres";

    }

    @GetMapping(value = "/")
    public String showFirstView(Model model) {
        List<PhoneBook> phoneBooks =  phoneBookService.getPhoneBooks();
        model.addAttribute("phoneBooks",phoneBooks);
        return "index";
    }

    @PostMapping(value = "/viewRecord")
    public String viewRecord(@RequestParam("id") int id, Model model) {
        model.addAttribute("phoneBook", phoneBookService.getPhoneBook(id));
        return "view-record";
    }

    @PostMapping(value = "/deleteRecord")
    public String deleteRecord(@RequestParam("id") int id, Model model) {
        phoneBookService.deleteRecordToPhoneBooks(id);
        return "redirect:/";
    }

    @PostMapping(value = "/editRecord")
    public String editRecord(@RequestParam("id") int id, Model model) {
        model.addAttribute("phoneBook", phoneBookService.getPhoneBook(id));
        return "edit-record";
    }

    @PostMapping(value = "/editSaveRecord")
    public String editSaveRecord(@ModelAttribute("phoneBook") PhoneBook phoneBook, Model model) {
        phoneBookService.editRecordToPhoneBooks(phoneBook);
        return "redirect:/";
    }
    @GetMapping("/viewAddRecord")
    public String viewAddRecord(Model model) {
        model.addAttribute("phoneBook", phoneBookService.getNewPhoneBook());
        return "view-add-record";
    }
    @PostMapping(value = "/addSaveRecord")
    public String addSaveRecord(@ModelAttribute("phoneBook") PhoneBook phoneBook, Model model) {
        phoneBookService.addRecordToPhoneBooks(phoneBook);
        return "redirect:/";
    }

}
