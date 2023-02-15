package Actor;

import Exceptions.WrongParameter;
import Items.Spacesuit;
import Items.Spacesuit.Status;
import java.util.Random;

public class Astronaut extends Human implements PasAbilities {
    Random rand = new Random();
    private String suitSpace;

    public Astronaut(String name, int age) {
        super("Коротышка", age);
        this.suitSpace = Status.PUT_OFF.getText();
    }

    public Astronaut() {
        this.suitSpace = Status.PUT_OFF.getText();
    }

    public void setSuitSpace(String suitSpace) {
        this.suitSpace = suitSpace;
    }

    public String getSuitSpace() {
        return this.suitSpace;
    }

    public int hashCode() {
        return super.hashCode() / 100000 * 31;
    }

    public void setCurrent_Location(String current_Location) throws WrongParameter {
        super.setCurrent_Location(current_Location);
    }

    public String getCurrent_Location() {
        return super.getCurrent_Location();
    }

    public String getLevitation() {
        return super.getLevitation();
    }

    public void setLevitation(String levitation) {
        super.setLevitation(levitation);
    }

    public void PutSpaceSuit(Spacesuit suit, boolean put) {
        if (put) {
            this.suitSpace = suit.putON();
        } else {
            this.suitSpace = suit.putOFF();
        }

    }

    public void Ask() {
        System.out.println("Покажи мне устройство ракеты , как она работает ? Спросил:" + this.getName());
    }

    public void askTemp() {
        System.out.println("Какая температура на борту ? Спросил:" + this.getName());
    }

    public void askAir() {
        System.out.println("Какое состояние воздуха ? Спросил:" + this.getName());
    }

    public void askBattery() {
        System.out.println("Расскажи мне про уровень баттареи , насколько она заряжена ? Спросил:" + this.getName());
    }

    public void askNum() {
        System.out.println("Сколько нас на борту ?  Спросил:" + this.getName());
    }
}
