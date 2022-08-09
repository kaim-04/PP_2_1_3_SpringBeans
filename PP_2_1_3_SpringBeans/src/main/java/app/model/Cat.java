package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {

    @Autowired
    public Cat() {
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }
}
