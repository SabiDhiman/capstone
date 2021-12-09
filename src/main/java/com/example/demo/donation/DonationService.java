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

    public Optional<Donation> getDonationByUser(User user) throws Exception {
        if (donationDAO.selectDonationByUser(user).isEmpty()){
            throw new Exception("Donation from com.example.demo.user: " + user + " not found");
        }
        return donationDAO.selectDonationByUser(user);
    }

    public void createDonation(Donation donation) {
        donationDAO.AddDonation(donation);
    }
}
