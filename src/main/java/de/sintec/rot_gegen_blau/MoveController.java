package de.sintec.rot_gegen_blau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class MoveController {
    @Autowired
    MoveService moveService;

    @GetMapping("/move")
    public String move(@RequestParam(name = "field") String field) {
        return moveService.move(field);
    }

    @GetMapping("/check")
    public String check(@RequestParam(name = "field") String field) {
        return moveService == null ? "null" : "ok";
    }

}
