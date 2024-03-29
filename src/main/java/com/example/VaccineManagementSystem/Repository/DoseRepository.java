package com.example.VaccineManagementSystem.Repository;

import com.example.VaccineManagementSystem.Models.Dose;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Amresh Tripathy
 */

@Repository
public interface DoseRepository extends JpaRepository<Dose, Integer> {

}
