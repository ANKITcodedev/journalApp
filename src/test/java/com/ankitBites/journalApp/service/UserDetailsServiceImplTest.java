package com.ankitBites.journalApp.service;

import com.ankitBites.journalApp.entity.User;
import com.ankitBites.journalApp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;

import static org.mockito.Mockito.*;

//@Disabled
//@ExtendWith(MockitoExtension.class)
//public class UserDetailsServiceImplTest {
//
//    @InjectMocks
//    private UserDetailsServiceImpl userDetailsService;
//
//    @Mock
//    private UserRepository userRepository;
//
//    @BeforeEach
//    void setup() {
//        MockitoAnnotations.initMocks(this);
//    }
//
//    @Test
//    void loadByUsernameTest() {
//        User entityUser = new User();
//        entityUser.setUserName("ram");
//        entityUser.setPassword("1234");
//        entityUser.setRoles(new ArrayList<>());
//
//        when(userRepository.findByUserName(ArgumentMatchers.anyString()))
//                .thenReturn(entityUser);
//        UserDetails user = userDetailsService.loadUserByUsername("ram");
//        Assertions.assertNotNull(user);
//    }
//}
