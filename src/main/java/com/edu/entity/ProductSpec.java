package com.edu.entity;


import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "product_spec")
public class ProductSpec implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "monitor_spec_id")
    private MonitorSpec monitorSpec;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "laptop_spec_id")
    private LaptopSpec laptopSpec;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "smartphone_spec_id")
    private SmartphoneSpec smartphoneSpec;

    public ProductSpec() {
    }

    public ProductSpec(MonitorSpec monitorSpec, LaptopSpec laptopSpec, SmartphoneSpec smartphoneSpec) {
        this.monitorSpec = monitorSpec;
        this.laptopSpec = laptopSpec;
        this.smartphoneSpec = smartphoneSpec;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MonitorSpec getMonitorSpec() {
        return monitorSpec;
    }

    public void setMonitorSpec(MonitorSpec monitorSpec) {
        this.monitorSpec = monitorSpec;
    }

    public LaptopSpec getLaptopSpec() {
        return laptopSpec;
    }

    public void setLaptopSpec(LaptopSpec laptopSpec) {
        this.laptopSpec = laptopSpec;
    }

    public SmartphoneSpec getSmartphoneSpec() {
        return smartphoneSpec;
    }

    public void setSmartphoneSpec(SmartphoneSpec smartphoneSpec) {
        this.smartphoneSpec = smartphoneSpec;
    }
}
