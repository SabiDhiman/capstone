package donation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import request.Request;
import request.RequestService;
import user.User;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/donation")
public class DonationController {
    private DonationService donationService;

    @Autowired
    public DonationController(DonationService donationservice) {
        this.donationService = donationService;
    }

    @GetMapping
    public List<Donation> getAllDonation() {
        return donationService.getAllDonations();
    }

    @GetMapping("{user}")
    public Optional<Donation> getDonationByUser(@PathVariable("user") User user) throws Exception {
        return donationService.getDonationByUser(user);
    }

    @PostMapping
    public void createDonation(@RequestBody Donation donation) {
        donationService.createDonation(donation);
    }
}
