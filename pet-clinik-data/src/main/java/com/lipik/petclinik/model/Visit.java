package com.lipik.petclinik.model;

import java.time.LocalDate;

public class Visit extends BaseEntity {
    private LocalDate date;
    private String discription;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public String getDiscription() {
        return discription;
    }

    public Pet getPet() {
        return pet;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
