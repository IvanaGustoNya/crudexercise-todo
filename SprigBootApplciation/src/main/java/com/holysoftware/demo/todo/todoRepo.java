package com.holysoftware.demo.todo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface todoRepo
        extends JpaRepository<todo, Long>
{
    @Query("SELECT s FROM todo s WHERE s.username = ?1")
    Optional<todo> findtodoByUsername(String username);
}


