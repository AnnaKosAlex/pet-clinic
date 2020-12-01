package ru.anna.pet.entity;


import javax.persistence.*;

/**
 * @author Anna
 */
@Entity
@Table(name = "doctor_account")
public class DoctorAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "account_id", unique = true, nullable = false)
    private int accountId;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String qualification;

    @Column(name = "doctor_id")
    @OneToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctorId;

    public DoctorAccount(int accountId, String login, String qualification, Doctor doctorId) {
        this.accountId = accountId;
        this.doctorId = doctorId;
        this.login = login;
        this.qualification = qualification;

    }

    public DoctorAccount() {

    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Doctor getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Doctor doctorId) {
        this.doctorId = doctorId;
    }
}
