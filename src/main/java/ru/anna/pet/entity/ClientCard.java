package ru.anna.pet.entity;


import com.sun.istack.NotNull;

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
    @NotNull
    private String ClientName;

    @Column(name = "phone")
    @NotNull
    private String phone;

    @Column(name = "email")
    @NotNull
    private String email;

    public ClientCard() {

    }
    public ClientCard(int clientId, String clientName, String phone, String email) {
        this.clientId = clientId;
        this.ClientName = clientName;
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
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
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
