package com.movie.ticket.booking.system.api.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class BookingControllerFallbackAPI {

    @GetMapping("booking-fallback")
    public Mono<String> bookingFallback() {
        return Mono.just("booking-fallback");
    }

}
