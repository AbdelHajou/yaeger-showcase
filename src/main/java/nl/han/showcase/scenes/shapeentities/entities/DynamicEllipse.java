package nl.han.showcase.scenes.shapeentities.entities;

import com.github.hanyaeger.api.engine.entities.entity.Location;
import com.github.hanyaeger.api.engine.entities.entity.SceneBorderTouchingWatcher;
import com.github.hanyaeger.api.engine.entities.entity.motion.Direction;
import com.github.hanyaeger.api.engine.entities.entity.shape.circle.DynamicCircleEntity;
import com.github.hanyaeger.api.engine.entities.entity.shape.ellipse.DynamicEllipseEntity;
import com.github.hanyaeger.api.engine.scenes.SceneBorder;
import javafx.scene.paint.Color;

public class DynamicEllipse extends DynamicEllipseEntity implements SceneBorderTouchingWatcher {

    public DynamicEllipse(Location initialPosition) {
        super(initialPosition);
        setRadiusX(40);
        setRadiusY(10);
        setOpacity(0.8);
        setFill(Color.STEELBLUE);
        setStrokeColor(Color.SADDLEBROWN);
        setStrokeWidth(4);
        setMotionTo(1, Direction.RIGHT.getValue());
    }

    @Override
    public void notifyBoundaryTouching(SceneBorder border) {
        changeDirectionBy(180);
    }
}