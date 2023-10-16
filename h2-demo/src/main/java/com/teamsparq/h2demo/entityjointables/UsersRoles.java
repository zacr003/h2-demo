//package com.teamsparq.h2demo.entityjointables;
//
//
//import com.teamsparq.h2demo.entity.Role;
//import com.teamsparq.h2demo.entity.User;
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//
//@Entity
//@Table
//public class UsersRoles {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    @OneToOne(mappedBy = "userId")
//    private User user;
//
//
//    @OneToMany(mappedBy = "role")
//    private Role role;
//
//


