package com.finalmobile.wemarket.repository;

import com.finalmobile.wemarket.models.Shipper;
import com.finalmobile.wemarket.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ShipperRepository extends JpaRepository<Shipper,Long> {

    Optional<Shipper> findByUsername(String username);
    Boolean existsByUsername(String name);
    @Query(value="SELECT * FROM shipper WHERE shipper.shipper_status='ACTIVE'", nativeQuery = true)
    List<Shipper> findActiveShippers();

}
