package ru.anna.pet.entity;


import javax.persistence.*;

/**
 * @author Anna
 */
@Entity
@Table(name = "client_card")
public class ClientCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id", unique = true, nullable = false)
    private int clientId;

    @Column(name = "client_name")
    private String сlientName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    public ClientCard() {

    }
    public ClientCard(int clientId, String clientName, String phone, String email) {
        this.clientId = clientId;
        this.сlientName = clientName;
        this.email = email;
        this.phone = phone;

    }


    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return сlientName;
    }

    public void setClientName(String clientName) {
        сlientName = clientName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
