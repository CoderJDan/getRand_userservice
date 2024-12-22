//package com.example.getrand_userservice.serivce;
//
//import com.example.getrand_userservice.Entity.MerberEntity;
//import com.example.getrand_userservice.Repository.MerberRepository;
//import com.example.getrand_userservice.dto.UsersDTO;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//@RequiredArgsConstructor
//public class MerberService {
//    private final MerberRepository merberRepository;
//
//    // 회원 저장
//    public void save(UsersDTO usersDTO) {
//        MerberEntity merberEntity = MerberEntity.tomemberEntity(usersDTO);
//        merberRepository.save(merberEntity);
//    }
//
//    // 로그인 처리
//    public UsersDTO login(UsersDTO usersDTO) {
//        Optional<MerberEntity> byUsername = merberRepository.findMerberByUsername(usersDTO.getUsername());
//
//        if (byUsername.isPresent()) {
//            MerberEntity merberEntity = byUsername.get();
//
//            // 비밀번호 검증
//            if (merberEntity.getPassword().equals(usersDTO.getPassword())) {
//                return merberEntity.tomemberEntity(); // Entity를 DTO로 변환
//            } else {
//                return null; // 비밀번호 불일치
//            }
//        }
//
//        return null; // 사용자 이름 불일치
//    }
//}
