package de.sintec.rot_gegen_blau;

import org.springframework.stereotype.Service;

@Service
public class MoveServiceImpl implements MoveService {
    public String move(String lastField) {
        String nextField;
        String start = lastField;
        int free = 0;
        while (start.endsWith("o")) {
            free++;
            if (start.length() > 1)
                start=start.substring(0, start.length()-1);
            else
                start="";
        }

        String lastMove = null;
        String nextMove;
        if (start.length() > 0)
        {
            if (start.endsWith("B"))
                lastMove = "B";
            else if (start.endsWith("R"))
                lastMove = "R";
        }

        if (lastMove == null || lastMove.equals("R")) {
            nextMove = (free % 3 == 1) ? "B" : "BB";
        }
        else {
            nextMove = (free % 3 == 1) ? "R" : "RR";
        }

        nextField = start + nextMove + lastField.substring(start.length() + nextMove.length());

        return nextField;
    }
}
