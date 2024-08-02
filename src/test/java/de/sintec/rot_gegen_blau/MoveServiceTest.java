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
    void testMove0() {
        String nextField = moveService.move("BBRRBRoooo");

        Assertions.assertEquals("BBRRBRBooo", nextField);
    }

    @Test
    void testMove1() {
        String nextField = moveService.move("oooooo");

        Assertions.assertEquals("BBoooo", nextField);
    }
    @Test
    void testMove2() {
        String nextField = moveService.move("Booooo");

        Assertions.assertEquals("BRRooo", nextField);
    }

    @Test
    void testMove3() {
        String nextField = moveService.move("oooooooooo");

        Assertions.assertEquals("Booooooooo", nextField);
    }

    @Test
    void testMove4() {
        String nextField = moveService.move("BRBBRBRRBo");

        Assertions.assertEquals("BRBBRBRRBR", nextField);
    }
}
