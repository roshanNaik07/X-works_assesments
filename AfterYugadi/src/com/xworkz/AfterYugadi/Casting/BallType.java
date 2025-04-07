package com.xworkz.AfterYugadi.Casting;

import com.xworkz.AfterYugadi.Internal.Game;
import com.xworkz.AfterYugadi.Internal.VolleyBall;

public class BallType {

    public void ballMaterial(Game game){
        game.compitation();
        game.play();
        game.organise();
        game.timing();
        game.practice();

        if (game instanceof VolleyBall){

            VolleyBall volleyBall = (VolleyBall) game;
            volleyBall.bounce();
        }
    }
}
