package com.example.springsecuritydemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webapp.certificationtest.mapper.RegisterMemberMapper;

@Service
@Transactional
public class RegisterMemberService {

    @Autowired
    RegisterMemberMapper registerMemberMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    /**
     *Enregistrez les informations des membres dans DB.
     */
    public void registerMember(MemberRegistrationEntity entity) {

        //Hash le mot de passe et insérezMemberInfo()Défini sur l'objet à passer.
        entity.setPassword(passwordEncoder.encode(entity.getPassword()));

        registMemberMapper.insertMemberInfo(entity);
    }
}
