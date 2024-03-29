package com.example.VaccineManagementSystem.Repository;

import com.example.VaccineManagementSystem.Models.VaccinationCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amresh Tripathy
 */

@Repository
public interface VaccinationRepository extends JpaRepository<VaccinationCenter, Integer> {
}
