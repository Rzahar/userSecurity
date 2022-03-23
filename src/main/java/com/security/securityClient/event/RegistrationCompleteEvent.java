package com.security.securityClient.event;

import com.security.securityClient.entity.User;
import org.springframework.context.ApplicationEvent;

public class RegistrationCompleteEvent extends ApplicationEvent {

    private User user;
    private String applicationUrl;

    public RegistrationCompleteEvent(User user, String applicationUrl) {
        super(user);
        this.user = user;
        this.applicationUrl = applicationUrl;
    }
}
