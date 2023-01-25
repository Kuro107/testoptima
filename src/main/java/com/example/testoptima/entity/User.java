package com.example.testoptima.entity;

import com.example.testoptima.enums.UserStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id Integer id;

    @Column
    private String fio;

    @Enumerated
    private UserStatus status;

    public Integer getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }
}
