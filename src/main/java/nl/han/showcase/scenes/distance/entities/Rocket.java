package nl.han.showcase.scenes.distance.entities;

import com.github.hanyaeger.api.engine.entities.entity.AnchorPoint;
import com.github.hanyaeger.api.engine.entities.entity.Coordinate2D;
import com.github.hanyaeger.api.engine.entities.entity.collisions.AABBCollided;
import com.github.hanyaeger.api.engine.entities.entity.collisions.AABBCollider;
import com.github.hanyaeger.api.engine.entities.entity.shape.circle.DynamicCircleEntity;
import javafx.scene.paint.Color;

public class Rocket extends DynamicCircleEntity implements AABBCollided {

    public Rocket(final Coordinate2D initialPosition, final double direction) {
        super(initialPosition);

        setAnchorPoint(AnchorPoint.CENTER_CENTER);
        setStrokeWidth(1);
        setStrokeColor(Color.YELLOW);
        setFill(Color.ORANGE);
        setMotionTo(8, direction);
        setRadius(4);
    }

    @Override
    public void onCollision(final AABBCollider collidingObject) {
        remove();
    }
}