package com.example.libraryapp_backend.dao;

import com.example.libraryapp_backend.model.Library;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface librarydao extends CrudRepository<Library,Integer> {

   @Query(value = "SELECT `id`, `author`, `booktitle`, `description`, `distributer`, `image`, `language`, `price`, `publisher`, `releasedyear` FROM `library` WHERE `booktitle`= :booktitle",nativeQuery = true)
    List<Library> Searchbook(@Param("booktitle") String booktitle );


    @Modifying
    @Transactional
    @Query(value = "DELETE FROM `library` WHERE `id`= :id",nativeQuery = true)
    void deletebook(@Param("id") Integer id);
}
