package assignment.xyzbank;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankController {

    @GetMapping("/bank")
    public String bank(Model model){
        model.addAttribute("message", "XYZ_Bank");
        return "bankDetails";
    }
}
