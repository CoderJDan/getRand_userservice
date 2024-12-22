//package com.example.getrand_userservice.controller;
//
//import com.example.getrand_userservice.dto.UsersDTO;
//import com.example.getrand_userservice.serivce. MerberService;
//import jakarta.servlet.http.HttpSession;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//
//@Controller
//@RequiredArgsConstructor
//public class MemberController {
//  private final MerberService memberservice;
//
//
//    @GetMapping("/users/save")
//    public String saveView(){
//        return "save";
//    }
//    @PostMapping("/users/save")
//    public String saveform(@ModelAttribute UsersDTO usersDTO){
//        return "index";
//
//    }
//    @PostMapping("/users/login")
//    public String login(@RequestBody UsersDTO usersDTO, HttpSession session){
//        UsersDTO loginResult = memberservice.login(usersDTO);
//        if(loginResult != null) {
//            //로그인 성공
//            session.setAttribute("username", loginResult.getUsername());
//            return "main";
//        }else {
//            //longin
//            return "login";
//        }
//    }
//}
