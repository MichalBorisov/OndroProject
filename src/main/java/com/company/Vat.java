package com.company;

public class Vat {
    private String comment;
    private String iso_duplicate;
    private String country;
    private Double standard_rate;
    private Double reduced_rate;
    private Double reduced_rate_alt;
    private Boolean super_reduced_rate;
    private Boolean parking_rate;

    public Vat(String comment, String iso_duplicate, String country, Double standard_rate, Double reduced_rate, Double reduced_rate_alt, Boolean super_reduced_rate, Boolean parking_rate) {
        this.comment = comment;
        this.iso_duplicate = iso_duplicate;
        this.country = country;
        this.standard_rate = standard_rate;
        this.reduced_rate = reduced_rate;
        this.reduced_rate_alt = reduced_rate_alt;
        this.super_reduced_rate = super_reduced_rate;
        this.parking_rate = parking_rate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getIso_duplicate() {
        return iso_duplicate;
    }

    public void setIso_duplicate(String iso_duplicate) {
        this.iso_duplicate = iso_duplicate;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getStandard_rate() {
        return standard_rate;
    }

    public void setStandard_rate(Double standard_rate) {
        this.standard_rate = standard_rate;
    }

    public Double getReduced_rate() {
        return reduced_rate;
    }

    public void setReduced_rate(Double reduced_rate) {
        this.reduced_rate = reduced_rate;
    }

    public Double getReduced_rate_alt() {
        return reduced_rate_alt;
    }

    public void setReduced_rate_alt(Double reduced_rate_alt) {
        this.reduced_rate_alt = reduced_rate_alt;
    }

    public Boolean getSuper_reduced_rate() {
        return super_reduced_rate;
    }

    public void setSuper_reduced_rate(Boolean super_reduced_rate) {
        this.super_reduced_rate = super_reduced_rate;
    }

    public Boolean getParking_rate() {
        return parking_rate;
    }

    public void setParking_rate(Boolean parking_rate) {
        this.parking_rate = parking_rate;
    }


}
