package com.edu.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "laptop_spec")
public class LaptopSpec implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String producer;

    @Enumerated(EnumType.STRING)
    private GuaranteePeriodEnum guarantee;

    @Column
    private String processor;

    @Column
    private int ram;

    @Column(name = "video_card")
    private String videoCard;

    @Column(name = "hdd_capacity")
    private int hddCapacity;

    @Column
    private Double diagonal;

    public LaptopSpec() {
    }

    public LaptopSpec(String producer, GuaranteePeriodEnum guarantee, String processor, int ram, String videoCard, int hddCapacity, Double diagonal) {
        this.producer = producer;
        this.guarantee = guarantee;
        this.processor = processor;
        this.ram = ram;
        this.videoCard = videoCard;
        this.hddCapacity = hddCapacity;
        this.diagonal = diagonal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public GuaranteePeriodEnum getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(GuaranteePeriodEnum guarantee) {
        this.guarantee = guarantee;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public int getHddCapacity() {
        return hddCapacity;
    }

    public void setHddCapacity(int hddCapacity) {
        this.hddCapacity = hddCapacity;
    }

    public Double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Double diagonal) {
        this.diagonal = diagonal;
    }
}
