package fr.ubx.poo.ubomb.go.decor;

import fr.ubx.poo.ubomb.game.Direction;
import fr.ubx.poo.ubomb.game.Game;
import fr.ubx.poo.ubomb.game.Position;
import fr.ubx.poo.ubomb.go.GameObject;
import fr.ubx.poo.ubomb.go.Movable;
import fr.ubx.poo.ubomb.go.decor.bonus.Bonus;

public class Box extends Decor implements Movable{
    public Box(Position position) {
        super(position);
    }

    @Override
    public boolean canMove(Direction direction) {

        return true;
    }

    @Override
    public void doMove(Direction direction) {
    }
}
