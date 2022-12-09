package com.example.libraryapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

 @Entity
 @Table(name="library")
  public class Library {

    @Id
    @GeneratedValue
    private int id;
    private String booktitle;
    private String author;
    private String description;
    private String publisher;
    private String language;
    private String distributer;
    private String releasedyear;
    private int price;
    private String image;

      public Library() {
      }

      public Library(int id, String booktitle, String author, String description, String publisher, String language, String distributer, String releasedyear, int price, String image) {
          this.id = id;
          this.booktitle = booktitle;
          this.author = author;
          this.description = description;
          this.publisher = publisher;
          this.language = language;
          this.distributer = distributer;
          this.releasedyear = releasedyear;
          this.price = price;
          this.image = image;
      }

      public int getId() {
          return id;
      }

      public void setId(int id) {
          this.id = id;
      }

      public String getBooktitle() {
          return booktitle;
      }

      public void setBooktitle(String booktitle) {
          this.booktitle = booktitle;
      }

      public String getAuthor() {
          return author;
      }

      public void setAuthor(String author) {
          this.author = author;
      }

      public String getDescription() {
          return description;
      }

      public void setDescription(String description) {
          this.description = description;
      }

      public String getPublisher() {
          return publisher;
      }

      public void setPublisher(String publisher) {
          this.publisher = publisher;
      }

      public String getLanguage() {
          return language;
      }

      public void setLanguage(String language) {
          this.language = language;
      }

      public String getDistributer() {
          return distributer;
      }

      public void setDistributer(String distributer) {
          this.distributer = distributer;
      }

      public String getReleasedyear() {
          return releasedyear;
      }

      public void setReleasedyear(String releasedyear) {
          this.releasedyear = releasedyear;
      }

      public int getPrice() {
          return price;
      }

      public void setPrice(int price) {
          this.price = price;
      }

      public String getImage() {
          return image;
      }

      public void setImage(String image) {
          this.image = image;
      }
  }
