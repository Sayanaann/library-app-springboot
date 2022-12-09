package com.example.libraryapp_backend.controller;

import com.example.libraryapp_backend.dao.librarydao;
import com.example.libraryapp_backend.dao.userregdao;
import com.example.libraryapp_backend.model.Library;
import com.example.libraryapp_backend.model.Userreg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController

public class librarycontroller {
    @Autowired
    private librarydao dao;

      @Autowired
       private userregdao dao1;

    @CrossOrigin(origins = "*")
    @GetMapping("/")
    public String Homepage(){
        return "welcome to libraryapp";
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path="/bookentry",consumes = "application/json",produces = "application/json")
    public String Addbook(@RequestBody Library l) {
        dao.save(l);
        return "Book added";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/bookview")
    public List<Library> viewall(){
        return (List<Library>) dao.findAll();
    }
    @CrossOrigin(origins = "*")
    @PostMapping(path = "/booksearch", consumes = "application/json", produces = "application/json")
    public List<Library> Searchbook(@RequestBody Library l) {
        String booktitle = String.valueOf(l.getBooktitle());
        System.out.println(booktitle);
        return (List<Library>) dao.Searchbook(l.getBooktitle());
    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/bookdelete", consumes = "application/json", produces = "application/json")
    public HashMap<String,String> deletebook(@RequestBody Library l) {
        String id = String.valueOf(l.getId());
        System.out.println(id);
        dao.deletebook(l.getId());
        HashMap<String, String> map = new HashMap<>();
        map.put("status", "success");
        return map;

    }

    @CrossOrigin(origins = "*")
    @PostMapping(path = "/adduser", consumes = "application/json", produces = "application/json")
    public Userreg Registration(@RequestBody Userreg u) {
        dao1.save(u);
        return u;
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewuser")
    public List<Userreg> viewu() {
        return (List<Userreg>) dao1.findAll();
    }



   @CrossOrigin(origins = "*")
    @PostMapping(path = "/userlogin", consumes = "application/json", produces = "application/json")
    public List<Userreg> Searchuser(@RequestBody Userreg u) {
        String emailid = u.getEmailid().toString();
        String password =u.getPassword().toString();
        System.out.println(emailid);
        System.out.println(password);
        return (List<Userreg>) dao1.Searchuser(u.getEmailid(), u.getPassword());

    }


}


