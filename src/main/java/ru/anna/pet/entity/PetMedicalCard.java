package ru.anna.pet.entity;


import javax.persistence.*;

/**
 * @author Anna
 */
@Entity
@Table(name = "pet_medical_card")
public class PetMedicalCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pet_id", unique = true, nullable = false)
    private int petId;

    @Column(name = "pet_name")
    private String petName;

    @Column(name = "pet_type")
    private String petType;

    @Column(name = "age")
    private int age;

    @Column(name = "owner_id")
    @ManyToOne
    @JoinColumn(name = "client_id")
    private ClientCard ownerId;

    @Column(name = "doctor_id")
    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctorId;

    @Column(name = "diagnosis")
    private String diagnosis;

    @Column(name = "appointment")
    private String appointment;

    public PetMedicalCard() {

    }

    public PetMedicalCard(String petName, String petType, int age, ClientCard ownerId,
                          Doctor doctorId, String diagnosis, String appointment) {
        this.petName = petName;
        this.petType = petType;
        this.age = age;
        this.ownerId = ownerId;
        this.doctorId = doctorId;
        this.diagnosis = diagnosis;
        this.appointment = appointment;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ClientCard getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(ClientCard ownerId) {
        this.ownerId = ownerId;
    }

    public Doctor getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Doctor doctorId) {
        this.doctorId = doctorId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }
}
