package com.security.securityClient.entity.listener;

import com.security.securityClient.event.RegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;

public class RegistrationCompleteEventListener implements ApplicationListener <RegistrationCompleteEvent> {
    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
       //Create the verification Token for the User with Link

       //Send mail to user
    }
}
