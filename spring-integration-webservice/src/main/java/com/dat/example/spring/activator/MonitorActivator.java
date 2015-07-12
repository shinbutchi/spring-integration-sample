package com.dat.example.spring.activator;

import com.dat.example.spring.dto.request.PingRequest;
import com.dat.example.spring.dto.response.PingResponse;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class MonitorActivator {
    public Message<PingResponse> ping(Message<PingRequest> message) {
        PingRequest pingRequest = message.getPayload();
        return MessageBuilder.withPayload(buildPingResponse(pingRequest.getPingValue())).build();
    }

    public void getMessageFromQueue(Message<PingRequest> message) {
        PingRequest pingRequest = message.getPayload();
        System.out.println(pingRequest.getPingValue());
    }

    public PingResponse buildPingResponse(String pingValue) {
        return new PingResponse(pingValue);
    }
}
