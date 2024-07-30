package de.sintec.rot_gegen_blau;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class MoveServiceTest {
    @Autowired
    MoveService moveService;

    @Test
    void testMove() {
        String nextField = moveService.move("BBRRBRoooo");

        Assertions.assertEquals("BBRRBRBooo", nextField);
    }
}
