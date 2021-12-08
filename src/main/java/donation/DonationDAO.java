package donation;

import user.User;

import java.util.List;
import java.util.Optional;

public interface DonationDAO {
    List<Donation> selectAllDonations();

    Optional<Donation> selectDonationByUser(User user);

    int AddDonation(Donation donation);

    int deleteDonation(int id);

    int updateDonation(Integer id, Donation donation);
}
