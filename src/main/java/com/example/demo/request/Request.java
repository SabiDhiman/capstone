package com.example.demo.request;

import java.util.Objects;

public class Request {

    private Integer id;
    private Integer post_id;
    private String donation_type;
    private Integer quantity_needed;

    public Request(Integer id, Integer post_id, String donation_type, Integer quantity_needed) {
        this.id = id;
        this.post_id = post_id;
        this.donation_type = donation_type;
        this.quantity_needed = quantity_needed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public String getDonation_type() {
        return donation_type;
    }

    public void setDonation_type(String donation_type) {
        this.donation_type = donation_type;
    }

    public Integer getQuantity_needed() {
        return quantity_needed;
    }

    public void setQuantity_needed(Integer quantity_needed) {
        this.quantity_needed = quantity_needed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return Objects.equals(id, request.id) && Objects.equals(post_id, request.post_id) && Objects.equals(donation_type, request.donation_type) && Objects.equals(quantity_needed, request.quantity_needed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, post_id, donation_type, quantity_needed);
    }

    @Override
    public String toString() {
        return "Request{" +
                "id=" + id +
                ", post_id=" + post_id +
                ", donation_type='" + donation_type + '\'' +
                ", quantity_needed=" + quantity_needed +
                '}';
    }
}
