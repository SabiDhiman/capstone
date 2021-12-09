package com.example.demo.donation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.user.User;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/donations")
public class DonationController {

    private DonationService donationService;

    @Autowired
    public DonationController(DonationService donationService) {
        this.donationService = donationService;
    }

    @GetMapping
    public List<Donation> getAllDonation() {
        return donationService.getAllDonations();
    }


    //TODO fix getDonationByUser method

    @GetMapping("{user_id}")
    public Optional<Donation> getDonationByUser(@PathVariable("user_id") int user_id) throws Exception {
        return donationService.getDonationByUser(user_id);
    }


    @PostMapping
    public void addDonation(@RequestBody Donation donation) {
        donationService.createDonation(donation);
    }

    @PutMapping
    public void updateDonation(Integer id, @RequestBody Donation donation) {donationService.updateDonation(id, donation);}

    @DeleteMapping("{id}")
    public void deleteDonation(@PathVariable("id")Integer id){donationService.deleteDonation(id);}
}
