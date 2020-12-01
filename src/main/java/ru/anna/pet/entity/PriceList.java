package ru.anna.pet.entity;


import javax.persistence.*;

/**
 * @author Anna
 */
@Entity
@Table(name = "price_list")
public class PriceList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "service_id", unique = true, nullable = false)
    private int serviceId;

    @Column(name = "service")
    private String service;

    @Column(name = "price")
    private int price;

    public PriceList() {
    }

    public PriceList(int serviceId, String service, int price) {
        this.serviceId = serviceId;
        this.service = service;
        this.price = price;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
