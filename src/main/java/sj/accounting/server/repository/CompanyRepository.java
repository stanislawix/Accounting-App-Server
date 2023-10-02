package sj.accounting.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sj.accounting.server.model.Company;
import sj.accounting.server.model.User;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {

}
