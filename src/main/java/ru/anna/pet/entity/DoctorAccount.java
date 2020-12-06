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
    private String password;

    @Column(name = "doctor_id")
    @OneToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctorId;

    public DoctorAccount(int accountId, String login, String password, Doctor doctorId) {
        this.accountId = accountId;
        this.doctorId = doctorId;
        this.login = login;
        this.password = password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Doctor getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Doctor doctorId) {
        this.doctorId = doctorId;
    }
}
