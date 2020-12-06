package ru.anna.pet.entity;

import javax.persistence.*;
import java.sql.Date;


/**
 * @author Anna
 */
@Entity
@Table(name = "clinic")
public class Clinic {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "clinic_id", unique = true, nullable = false)
    private int clinicId;

    @Column(name = "address")
    private String address;

    @Column(name = "opening_hours")
    private Date openingHours;

    @Column(name = "closing_hours")
    private Date closingHours;

    @Column(name = "phone")
    private String phone;

    public Clinic(int clinicId, String address,
                  Date openingHours, Date closingHours, String phone) {
        this.address = address;
        this.clinicId = clinicId;
        this.closingHours = closingHours;
        this.openingHours = openingHours;
        this.phone = phone;
    }

    public Clinic() {
    }

    public int getClinicId() {
        return clinicId;
    }

    public void setClinicId(int clinicId) {
        this.clinicId = clinicId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOppeningHours() {
        return openingHours;
    }

    public void setOppeningHours(Date oppeningHours) {
        this.openingHours = oppeningHours;
    }

    public Date getClosingHours() {
        return closingHours;
    }

    public void setClosingHours(Date closingHours) {
        this.closingHours = closingHours;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
