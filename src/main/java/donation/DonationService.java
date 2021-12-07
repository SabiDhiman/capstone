package donation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DonationService {
    private DonationDAO donationDAO;

    @Autowired
    public DonationService(DonationDAO donationDAO) {
        this.donationDAO = donationDAO;
    }

    public List<Donation> getAllDonations() {
        return donationDAO.selectAllDonations();
    }

    public Optional<Donation> getDonationById(int id) throws Exception {
        if (donationDAO.selectDonationById(id).isEmpty()){
            throw new Exception("Donation with the id " + id + " not found");
        }
        return donationDAO.selectDonationById(id);
    }

    public void createDonation(Donation donation) {
        donationDAO.AddDonation(donation);
    }
}
