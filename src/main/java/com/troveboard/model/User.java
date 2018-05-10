package com.troveboard.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String password;
    private String name;
    private String sername;
    private String email;
    private String diaryId;
    private String status;

    public User() {
    }

    public User(String password, String name, String sername, String email, String diaryId, String status) {
        this.password = password;
        this.name = name;
        this.sername = sername;
        this.email = email;
        this.diaryId = diaryId;
        this.status = status;
    }

    public User clone(User user){

        User user1 = new User();

        user1.setPassword(user.getPassword());
        user1.setName(user.getName());
        user1.setSername(user.getSername());
        user1.setEmail(user.getEmail());
        user1.setDiaryId(user.getDiaryId());
        user1.setStatus(user.getStatus());

        return user;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(String diaryId) {
        this.diaryId = diaryId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
