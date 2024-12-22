//package com.example.getrand_userservice.Entity;
//
//import com.example.getrand_userservice.dto.UsersDTO;
//import jakarta.persistence.*;
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Setter
//@Getter
//@Table(name = "users")
//public class MerberEntity {
//    @Id
//    @GeneratedValue
//    private long id;
//    @Column
//    private String username;
//    @Column(unique = true)
//    private String useremail;
//    @Column
//    private String password;
//
//    public static MerberEntity tomemberEntity(UsersDTO usersDTO) {
//        MerberEntity merberEntity = new MerberEntity();
//        merberEntity.setUsername(usersDTO.getUsername());
//        merberEntity.setUseremail(usersDTO.getUseremail());
//        merberEntity.setPassword(usersDTO.getPassword());
//        return merberEntity;
//    }
//}
