package assignment.xyzbank.service;

import assignment.xyzbank.bean.BankBranch;
import assignment.xyzbank.bean.BankFeatures;
import assignment.xyzbank.repo.BankBranchRepo;
import assignment.xyzbank.repo.BankFeaturesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {

    @Autowired
    private BankBranchRepo bankBranchRepo;

    @Autowired
    private BankFeaturesRepo bankFeaturesRepo;

    public List<BankBranch> getBankBranches() {
        return bankBranchRepo.findAll();
    }

    public List<BankFeatures> getBankFeatures() {
        return bankFeaturesRepo.findAll();
    }
    public List<BankBranch> addBankBranches(List<BankBranch> bankBranches) {
        return bankBranchRepo.saveAll(bankBranches);
    }

    public List<BankFeatures> addBankFeatures(List<BankFeatures> bankFeatures) {
        return bankFeaturesRepo.saveAll(bankFeatures);
    }
}
