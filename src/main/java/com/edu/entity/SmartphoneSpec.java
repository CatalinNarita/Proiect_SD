package com.edu.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "smartphone_spec")
public class SmartphoneSpec implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String producer;

    @Enumerated(EnumType.STRING)
    private GuaranteePeriodEnum guarantee;

    @Enumerated(EnumType.STRING)
    private ColourEnum colour;

    @Column
    private String screen;

    @Column
    private String processor;

    @Column
    private String resolution;

    @Column
    private int memory;

    public SmartphoneSpec() {
    }

    public SmartphoneSpec(String producer, GuaranteePeriodEnum guarantee, ColourEnum colour, String screen, String processor, String resolution, int memory) {
        this.producer = producer;
        this.guarantee = guarantee;
        this.colour = colour;
        this.screen = screen;
        this.processor = processor;
        this.resolution = resolution;
        this.memory = memory;
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

    public ColourEnum getColour() {
        return colour;
    }

    public void setColour(ColourEnum colour) {
        this.colour = colour;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
