package ru.anna.pet.entity;


import javax.persistence.*;
import java.sql.Date;
import java.util.Set;


/**
 * @author Anna
 */
@Entity
@Table(name = "session")
public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "session_id", unique = true, nullable = false)
    private int sessionId;

    @Column(name = "date_time")
    private Date dateTime;

    @Column(name = "client_id")
    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientCard clientId;

    @Column(name = "doctor_id")
    @OneToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctorId;

    @Column(name = "clinic_id")
    @ManyToOne
    @JoinColumn(name = "clinic_id")
    private Clinic clinicId;

    public Session() {
    }

    public Session(int sessionId, Date dateTime,
                   ClientCard clientId, Doctor doctorId,
                   Clinic clinicId) {
        this.sessionId = sessionId;
        this.dateTime = dateTime;
        this.clientId = clientId;
        this.doctorId = doctorId;
        this.clinicId = clinicId;
    }

    public int getSessionId() {
        return sessionId;
    }

    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        dateTime = dateTime;
    }

    public ClientCard getClientId() {
        return clientId;
    }

    public void setClientId(ClientCard clientId) {
        this.clientId = clientId;
    }

    public Clinic getClinicId() {
        return clinicId;
    }

    public void setClinicId(Clinic clinicId) {
        this.clinicId = clinicId;
    }

    public Doctor getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Doctor doctorId) {
        this.doctorId = doctorId;
    }
}
