package com.club.group.repo;

import com.club.group.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository <User, Integer> {

    @Query(value = "SELECT * FROM USER WHERE ID = ?1",nativeQuery = true)
    User getUserByUserID(String userID);

    @Query(value = "SELECT * FROM USER WHERE ID = ?1 AND ADDRESS = ?2",nativeQuery = true)
    User getUserByUserIDAndAddress(String userID,String address);
}
