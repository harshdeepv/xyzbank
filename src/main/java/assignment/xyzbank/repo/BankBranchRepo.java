package assignment.xyzbank.repo;

import assignment.xyzbank.bean.BankBranch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankBranchRepo extends JpaRepository<BankBranch, Long> {
}
