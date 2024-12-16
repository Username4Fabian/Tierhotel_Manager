package com.tierhotel.tierhotel_manager.models;

import jakarta.persistence.*;

@Entity
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private String species; 
    private java.util.Date checkInDate;
    private java.util.Date checkOutDate;
    private String ownerName;
    private String comment; 

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = true)
    private Room room;

    private String imgLink; 

    public Pet() {
    }

    public Pet(Long id, String name, String species, java.util.Date checkInDate, java.util.Date checkOutDate, String ownerName, String comment, Room room, String imgLink) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.ownerName = ownerName;
        this.comment = comment;
        this.room = room;
        this.imgLink = imgLink;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public java.util.Date getCheckInDate() {
        return checkInDate;
    }

    public java.util.Date getCheckOutDate() {
        return checkOutDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getComment() {
        return comment;
    }

    public Room getRoom() {
        return room;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setCheckInDate(java.util.Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public void setCheckOutDate(java.util.Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }
}