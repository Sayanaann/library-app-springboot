package com.example.libraryapp_backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class librarycontroller {

    @GetMapping("/")
    public String Homepage(){
        return "welcome to libraryapp";
    }
    @PostMapping("/admin")
    public String Adminlogin(){
        return "welcome to adminlogin";
    }
    @PostMapping("/userlogin")
    public String Userlogin(){
        return "welcome to userlogin";
    }
    @PostMapping("/userreg")
    public String Userreg(){
        return "welcome to userreg";
    }
    @PostMapping("/bookentry")
    public String Bookenry(){
        return "Enter the books";
    }
    @PostMapping("/booksearch")
    public String Booksearch(){
        return "Search the books";
    }
    @PostMapping("/bookissue")
    public String Bookissue(){
        return "Issue the books";
    }
    @PostMapping("/bookedit")
    public String Bookedit(){
        return "Edit the books";
    }
    @GetMapping("/bookview")
    public String Bookview(){
        return "View the books";
    }
    @PostMapping("/bookdelete")
    public String Bookdelete(){
        return "Edit the books";
    }
}


