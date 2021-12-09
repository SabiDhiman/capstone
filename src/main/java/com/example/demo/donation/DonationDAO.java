package com.example.demo.donation;

import com.example.demo.user.User;

import java.util.List;
import java.util.Optional;

public interface DonationDAO {
    List<Donation> selectAllDonations();

    Optional<Donation> selectDonationByUser(int user_id);

    int addDonation(Donation donation);

    int deleteDonation(int id);

    int updateDonation(Integer id, Donation donation);
}
