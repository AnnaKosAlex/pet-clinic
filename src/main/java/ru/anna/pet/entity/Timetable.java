package ru.anna.pet.entity;

import javax.persistence.*;

import java.sql.Date;
import java.util.Set;

/**
 * @author Anna
 */
@Entity
@Table(name = "timetable")
public class Timetable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", unique = true, nullable = false)
    private int id;


    @Column(name = "clinic_id")
    @OneToMany
    @JoinColumn(name = "clinic_id")
    private Set<Clinic> clinicId;

    @Column(name = "doctor_id")
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctorId;

    @Column(name = "date")
    private Date date;

    @Column(name = "cabinet")
    private int cabinet;

    public Timetable() {
    }

    public Timetable(int id, Set<Clinic> clinicId, Doctor doctorId, Date date, int cabinet) {
        this.id = id;
        this.clinicId = clinicId;
        this.doctorId = doctorId;
        this.date = date;
        this.cabinet = cabinet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public Set<Clinic> getClinicId() {
        return clinicId;
    }

    public void setClinicId(Set<Clinic> clinicId) {
        this.clinicId = clinicId;
    }

    public Doctor getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Doctor doctorId) {
        this.doctorId = doctorId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getCabinet() {
        return cabinet;
    }

    public void setCabinet(int cabinet) {
        this.cabinet = cabinet;
    }
}
