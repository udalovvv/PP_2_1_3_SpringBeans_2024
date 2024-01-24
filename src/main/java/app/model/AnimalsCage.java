package app.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    private static final Logger log = LoggerFactory.getLogger(AnimalsCage.class);

    private final Animal animal;

    private final Timer timer;

    public AnimalsCage(@Qualifier("dogBean") Animal animal, @Qualifier("timerBean") Timer timer) {
        this.animal = animal;
        this.timer = timer;
    }

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        log.info(String.format("Say: %s At: %s", animal.toString(), timer.getTime().toString()));

    }
}
