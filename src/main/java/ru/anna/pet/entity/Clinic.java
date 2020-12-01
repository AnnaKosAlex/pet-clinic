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
    private int clinictId;

    @Column(name = "address")
    private String address;

    @Column(name = "oppening_hours")
    private Date oppeningHours;

    @Column(name = "closing_hours")
    private Date closingHours;

    @Column(name = "phone")
    private String phone;

    public Clinic(int clinictId, String address,
                  Date oppeningHours, Date closingHours, String phone) {
        this.address = address;
        this.clinictId = clinictId;
        this.closingHours = closingHours;
        this.oppeningHours = oppeningHours;
        this.phone = phone;
    }

    public Clinic() {
    }

    public int getClinictId() {
        return clinictId;
    }

    public void setClinictId(int clinictId) {
        this.clinictId = clinictId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getOppeningHours() {
        return oppeningHours;
    }

    public void setOppeningHours(Date oppeningHours) {
        this.oppeningHours = oppeningHours;
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
