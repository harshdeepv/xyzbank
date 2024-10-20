package assignment.xyzbank.controller;

import assignment.xyzbank.bean.BankBranch;
import assignment.xyzbank.bean.BankFeatures;
import assignment.xyzbank.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class BankController {
    @Autowired
    private BankService bankService;

    @GetMapping("/bank-branches")
    public String bankBranches(Model model){
        model.addAttribute("bankName", "XYZ_Bank Branch Details");
        List<BankBranch> branches = bankService.getBankBranches();
        model.addAttribute("branches", branches);
        return "bankDetails";
    }

    @GetMapping("/bank-features")
    public String bankFeatures(Model model){
        model.addAttribute("bankName", "XYZ_Bank Features");
        List<BankFeatures> features = bankService.getBankFeatures();
        model.addAttribute("features", features);
        return "bankFeatures";
    }

    @PostMapping("/add-branch")
    public List<BankBranch> addBranch(@RequestBody List<BankBranch> branches){
        return bankService.addBankBranches(branches);
    }

    @PostMapping("/add-feature")
    public List<BankFeatures> addFeatures(@RequestBody List<BankFeatures> features){
        return bankService.addBankFeatures(features);
    }
}
