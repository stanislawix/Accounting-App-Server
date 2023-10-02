package sj.accounting.server.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.NotBlank;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @NotBlank
    private String name;

    private String taxId;

    private String address;

    private String email;

    private String phone;

    private String website;

    private String logoUrl;

    @OneToMany(mappedBy = "company", orphanRemoval = true)
    @OrderBy("transaction.date DESC")
    private List<Transaction> transactions = new ArrayList<>();

    public Company() {}

    public Company(String name, String taxId, String address, String email, String phone, String website, String logoUrl) {
        this.name = name;
        this.taxId = taxId;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.website = website;
        this.logoUrl = logoUrl;
    }
}
