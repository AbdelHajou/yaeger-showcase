package nl.han.showcase.scenes.textentities;

import com.github.hanyaeger.api.engine.entities.entity.AnchorPoint;
import com.github.hanyaeger.api.engine.entities.entity.Location;
import com.github.hanyaeger.api.engine.entities.entity.shape.text.TextEntity;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import nl.han.showcase.YaegerShowCase;
import nl.han.showcase.buttons.BackButton;
import nl.han.showcase.scenes.ShowCaseScene;
import nl.han.showcase.scenes.textentities.entities.SceneBorderCrossingDynamicTextEntity;
import nl.han.showcase.scenes.textentities.entities.SceneBorderTouchingDynamicTextEntity;
import nl.han.showcase.scenes.textentities.entities.TimedDynamicTextEntity;

public class TextEntitiesScene extends ShowCaseScene {

    private YaegerShowCase showCase;

    public TextEntitiesScene(YaegerShowCase showCase) {
        this.showCase = showCase;
    }

    @Override
    public void setupScene() {
        setBackgroundImage("backgrounds/milky-way.jpg");
    }

    @Override
    public void setupEntities() {
        var backButton = new BackButton(showCase, new Location(20, getHeight() - 30));
        addEntity(backButton);

        var staticTextEntity = new TextEntity(new Location(getWidth() / 2, 30), "I'm a TextEntity and remain static on the Scene");
        staticTextEntity.setFill(Color.ORANGE);
        staticTextEntity.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        staticTextEntity.setFont(Font.font("American Typewriter", FontWeight.BOLD, 30));
        addEntity(staticTextEntity);

        var borderTouchingDynamicTextEntity = new SceneBorderTouchingDynamicTextEntity(new Location(getWidth() / 2, 60));
        borderTouchingDynamicTextEntity.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(borderTouchingDynamicTextEntity);

        var borderCrossingDynamicTextEntity = new SceneBorderCrossingDynamicTextEntity(new Location(getWidth() / 2, 90));
        borderCrossingDynamicTextEntity.setAnchorPoint(AnchorPoint.CENTER_CENTER);
        addEntity(borderCrossingDynamicTextEntity);

        var timedDynamicTextEntity = new TimedDynamicTextEntity(new Location(400, 120));
        addEntity(timedDynamicTextEntity);
    }

    @Override
    public YaegerShowCase getShowCase() {
        return showCase;
    }
}
