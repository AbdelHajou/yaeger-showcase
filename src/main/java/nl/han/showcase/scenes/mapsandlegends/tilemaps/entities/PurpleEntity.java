package nl.han.showcase.scenes.mapsandlegends.tilemaps.entities;

import com.github.hanyaeger.api.engine.Size;
import com.github.hanyaeger.api.engine.entities.entity.Coordinate2D;
import com.github.hanyaeger.api.engine.entities.entity.sprite.SpriteEntity;

public class PurpleEntity extends SpriteEntity {

    public PurpleEntity(Coordinate2D location, Size size) {
        super("entities/block-purple.png", location, size);
    }
}
