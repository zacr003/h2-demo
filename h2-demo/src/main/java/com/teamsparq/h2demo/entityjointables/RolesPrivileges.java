//package com.teamsparq.h2demo.entityjointables;
//
//import com.teamsparq.h2demo.entity.Role;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.ManyToMany;
//
//import java.util.Collection;
//
//public class RolesPrivileges {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//
//    private String name;
//
//    @ManyToMany(mappedBy = "privileges")
//    private Collection<Role> roles;
//}
