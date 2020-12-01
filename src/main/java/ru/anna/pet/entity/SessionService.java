package ru.anna.pet.entity;


import javax.persistence.*;
import java.util.Set;


/**
 * @author Anna
 */
@Entity
@Table(name = "session_service")
public class SessionService {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "session_service_id", unique = true, nullable = false)
    private int sessionServiceId;

    @Column(name = "session_id")
    @ManyToOne
    @JoinColumn(name = "session_id")
    private Session sessionId;

    @Column(name = "service_id")
    @ManyToMany
    @JoinColumn(name = "service_id")
    private Set<PriceList> serviceId;

    public SessionService() {
    }

    public SessionService(int sessionServiceId, Session sessionId, Set<PriceList> serviceId) {
        this.sessionServiceId = sessionServiceId;
        this.sessionId = sessionId;
        this.serviceId = serviceId;
    }

    public SessionService(int sessionServiceId){

    }

    public int getSessionServiceId() {
        return sessionServiceId;
    }

    public void setSessionServiceId(int sessionServiceId) {
        this.sessionServiceId = sessionServiceId;
    }

    public Session getSessionId() {
        return sessionId;
    }

    public void setSessionId(Session sessionId) {
        this.sessionId = sessionId;
    }

    public Set<PriceList> getServiceId() {
        return serviceId;
    }

    public void setServiceId(Set<PriceList> serviceId) {
        this.serviceId = serviceId;
    }
}
