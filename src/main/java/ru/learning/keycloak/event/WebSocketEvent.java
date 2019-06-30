package ru.learning.keycloak.event;


import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionConnectEvent;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;
import ru.learning.keycloak.model.User;

import java.io.IOException;

@Component
public class WebSocketEvent {


    @Autowired
    private SimpMessageSendingOperations messagingTemplate;



    @EventListener
    private void handleSessionConnected(SessionConnectEvent event) throws IOException
    {
//        SimpMessageHeaderAccessor headers = SimpMessageHeaderAccessor.wrap(event.getMessage());
//        ObjectMapper mapper = new ObjectMapper();
//        String jsonInString = headers.getUser().getName();
//        User user = mapper.readValue(jsonInString,User.class);
//        if (user == null)
//        {
//            return;
//        }
//        String id = user.getId();
//        MessageHeaders headers2 = event.getMessage().getHeaders();
//        String sessionId = SimpMessageHeaderAccessor.getSessionId(headers2);

    }

    @EventListener
    private void handleSessionDisconnect(SessionDisconnectEvent event)
    {

    }
}