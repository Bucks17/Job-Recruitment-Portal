package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.domain.Administrator;

public interface AdministratorRepository extends JpaRepository<Administrator, Long> {
}