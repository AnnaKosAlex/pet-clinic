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

    @Column(name = "Date_time")
    private Date DateTime;

    @Column(name = "client_id")
    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientCard clientId;

    @Column(name = "doctor_id")
    @ManyToMany
    @JoinColumn(name = "doctor_id")
    private Set<Doctor> doctorId;

    @Column(name = "clinic_id")
    @ManyToOne
    @JoinColumn(name = "clinic_id")
    private Clinic clinicId;

    public Session() {
    }

    public Session(int sessionId, Date dateTime,
                   ClientCard clientId, Set<Doctor> doctorId,
                   Clinic clinicId) {
        this.sessionId = sessionId;
        DateTime = dateTime;
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
        return DateTime;
    }

    public void setDateTime(Date dateTime) {
        DateTime = dateTime;
    }

    public ClientCard getClientId() {
        return clientId;
    }

    public void setClientId(ClientCard clientId) {
        this.clientId = clientId;
    }

    public Set<Doctor> getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Set<Doctor> doctorId) {
        this.doctorId = doctorId;
    }

    public Clinic getClinicId() {
        return clinicId;
    }

    public void setClinicId(Clinic clinicId) {
        this.clinicId = clinicId;
    }
}
