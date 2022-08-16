package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {

    @Autowired                // ТЗ: свяжите AnimalCage c бином Dog через абстрактный класс Animal
    @Qualifier("dog")         // явно указываем, какой бин нужно внедрить, т.к. подходящих бинов два: cat и dog
    private Animal animal;


    @Autowired
    private Timer timer;      // ТЗ: на основе класса Timer создайте бин, свяжите с AnimalCage

    public Timer getTimer() {
        return timer;
    }

    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animal.toString());
        System.out.println("At:");
        System.out.println(timer.getTime());
        System.out.println("________________________");
    }
}
