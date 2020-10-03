package th.ac.ku.bankaccount.data;

import org.springframework.data.jpa.repository.JpaRepository;
import th.ac.ku.bankaccount.model.BankAccount;

import java.util.List;

public interface BankAccountRepository extends JpaRepository<BankAccount,Integer> {
    List<BankAccount> findByCustomerId (int customerId);


}
