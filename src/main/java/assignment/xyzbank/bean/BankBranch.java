package assignment.xyzbank.bean;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class BankBranch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String branchName;;
    private String ifsc;
    private String branchAddress;
    private String city;
}
