package com.example.demo.donation;

import com.example.demo.request.Request;

import java.util.Objects;
import java.util.Optional;

public class Donation {
    private Integer id;
    private Integer user_id;
    private Integer donation_quantity;
    private Integer request_id;
    private Optional<Request> request;

    public Donation(Integer id, Integer user_id, Integer donation_quantity, Integer request_id, Optional<Request> request) {
        this.id = id;
        this.user_id = user_id;
        this.donation_quantity = donation_quantity;
        this.request_id = request_id;
        this.request = request;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getDonation_quantity() {
        return donation_quantity;
    }

    public void setDonation_quantity(Integer donation_quantity) {
        this.donation_quantity = donation_quantity;
    }

    public Integer getRequest_id() {
        return request_id;
    }

    public void setRequest_id(Integer request_id) {
        this.request_id = request_id;
    }

    public Optional<Request> getRequest() {
        return request;
    }

    public void setRequest(Optional<Request> request) {
        this.request = request;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Donation donation = (Donation) o;
        return Objects.equals(id, donation.id) && Objects.equals(user_id, donation.user_id) && Objects.equals(donation_quantity, donation.donation_quantity) && Objects.equals(request_id, donation.request_id) && Objects.equals(request, donation.request);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user_id, donation_quantity, request_id, request);
    }

    @Override
    public String toString() {
        return "Donation{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", donation_quantity=" + donation_quantity +
                ", request_id=" + request_id +
                ", request=" + request +
                '}';
    }
}
