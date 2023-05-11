package com.firas.weapon.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.firas.weapon.entities.Class;
public interface ClassRepository extends JpaRepository<Class, Long> {

}
