package sj.accounting.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import sj.accounting.server.model.Company;

@Controller
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @QueryMapping
    public Company
}
