package de.sintec.rot_gegen_blau;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {
    @GetMapping("/health")
    public Health health() {
        return new Health(true);
    }
}
