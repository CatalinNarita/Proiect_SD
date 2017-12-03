package com.edu.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "monitor_spec")
public class MonitorSpec implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String producer;

    @Enumerated(EnumType.STRING)
    private GuaranteePeriodEnum guarantee;

    @Column
    private Double diagonal;

    @Column
    private String resolution;

    @Enumerated(EnumType.STRING)
    private ColourEnum colour;

    @Column(name = "aspect_ratio")
    private String aspectRatio;

    public MonitorSpec() {
    }

    public MonitorSpec(String producer, GuaranteePeriodEnum guarantee, Double diagonal, String resolution, ColourEnum colour, String aspectRatio, ProductSpec productSpec) {
        this.producer = producer;
        this.guarantee = guarantee;
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.colour = colour;
        this.aspectRatio = aspectRatio;
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

    public Double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Double diagonal) {
        this.diagonal = diagonal;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public ColourEnum getColour() {
        return colour;
    }

    public void setColour(ColourEnum colour) {
        this.colour = colour;
    }

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }
}
