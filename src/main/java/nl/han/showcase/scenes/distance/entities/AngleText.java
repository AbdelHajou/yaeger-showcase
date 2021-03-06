package nl.han.showcase.scenes.distance.entities;

import com.github.hanyaeger.api.engine.UpdateExposer;
import com.github.hanyaeger.api.engine.entities.entity.Coordinate2D;
import com.github.hanyaeger.api.engine.entities.entity.YaegerEntity;
import com.github.hanyaeger.api.engine.entities.entity.shape.text.DynamicTextEntity;
import com.github.hanyaeger.api.engine.styles.HanFont;
import javafx.scene.paint.Color;

/**
 * A simple {@link DynamicTextEntity} that implements the interface {@link UpdateExposer}
 * to update its text continuously.
 */
public class AngleText extends DynamicTextEntity implements UpdateExposer {

    private final String DISTANCE = "Angle: ";
    private final YaegerEntity target;
    private final YaegerEntity origin;

    public AngleText(final Coordinate2D initialPosition, final YaegerEntity origin, final YaegerEntity target) {
        super(initialPosition);
        this.origin = origin;
        this.target = target;
        setFill(Color.WHITE);
        setFont(HanFont.createDefaultCondensedFont(14));
    }

    @Override
    public void explicitUpdate(long timestamp) {
        setText(DISTANCE + String.valueOf(Math.round(origin.angleTo(target))));
    }
}
