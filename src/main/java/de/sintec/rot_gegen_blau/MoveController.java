package de.sintec.rot_gegen_blau;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MoveController {
    @Autowired
    MoveService moveService;

    @GetMapping("/move")
    public Move move(@RequestParam(name = "field") String field) {
        Move theMove;
        try {
            String nextField = moveService.move(field);
            theMove = new Move(nextField, "success");
        }
        catch (Exception ex) {
            theMove = new Move("X", ex.getMessage());
        }
        return theMove;
    }

}
