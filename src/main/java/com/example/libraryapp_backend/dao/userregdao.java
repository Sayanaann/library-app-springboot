package com.example.libraryapp_backend.dao;

import com.example.libraryapp_backend.model.Userreg;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface userregdao extends CrudRepository<Userreg,Integer> {

  @Query(value="SELECT `id`, `aadharno`, `address`, `dateofbirth`, `emailid`, `name`, `password`, `phoneno`, `pincode`, `username` FROM `userreg` WHERE  `emailid`= :emailid AND 'password'= :password",nativeQuery = true)
    List<Userreg> Searchuser(@Param("emailid")  String emailid, @Param("password") String password);
}
