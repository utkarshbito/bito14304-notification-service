package com.example.notifications.controller;

import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {

    @PostMapping("/order-placed")
    public Map<String, String> orderPlaced(@RequestParam Long orderId) {
        return Map.of("status", "queued", "orderId", String.valueOf(orderId));
    }

    @GetMapping("/{id}")
    public Map<String, Object> get(@PathVariable Long id) {
        return Map.of("id", id, "state", "SENT");
    }
}
