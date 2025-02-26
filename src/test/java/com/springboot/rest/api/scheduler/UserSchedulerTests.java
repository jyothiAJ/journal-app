package com.springboot.rest.api.scheduler;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserSchedulerTests {

    @Autowired
    private UserScheduler userScheduler;

//    @Disabled
    @Test
     void testFetchUsersAndSendEmail(){
        userScheduler.fetchUsersAndSendMail();
    }
}
