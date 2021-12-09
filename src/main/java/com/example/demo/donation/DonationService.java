package com.example.demo.donation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.demo.user.User;

import java.util.List;
import java.util.Optional;

@Service
public class DonationService {
    private DonationDAO donationDAO;

    @Autowired
    public DonationService(@Qualifier("donations")DonationDAO donationDAO) {
        this.donationDAO = donationDAO;
    }

    public List<Donation> getAllDonations() {
        return donationDAO.selectAllDonations();
    }

    public Optional<Donation> getDonationByUser(int user_id) throws Exception {
        if (donationDAO.selectDonationByUser(user_id).isEmpty()){
            throw new Exception("Donation from User: " + user_id + " not found");
        }
        return donationDAO.selectDonationByUser(user_id);
    }

    public void createDonation(Donation donation) {
        donationDAO.addDonation(donation);
    }

    public void deleteDonation(int id) {donationDAO.deleteDonation(id);}

    public void updateDonation(Integer id, Donation donation){donationDAO.updateDonation(id, donation);}

    }

