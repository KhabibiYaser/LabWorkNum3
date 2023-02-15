package Actor;

import Exceptions.WrongParameter;
import FMap.Map;

public class Neznaika extends Astronaut implements PasAbilities{

    public Neznaika(String name , int age){
        this.setName(name);
        this.setAge(age);
        try {
            this.setCurrent_Location(Map.Rocket.getPlace());
        } catch (WrongParameter a){
            a.printStackTrace();
        }
    }





    public void Ask(){
        System.out.println("Покажи мне состояние ракеты !" + " Спросил: " + getName());
    }


    public void askTemp(){
        System.out.println("Какая на борту Ракеты темпераутра ?" + " Спросил: " + getName());
    }

    public void askAir(){
        System.out.println("Какая температура воздуха на Ракете ?" + " Спросил: " + getName());
    }

    public void askBattery(){
        System.out.println("Расскажи мне про уровень баттареи Ракеты , насколько она заряжена ?" + " Спросил: " + getName());

    }

    public void askNum(){
        System.out.println("Расскажи , сколько нас на Борту Ракеты ?" + " Спросил: " + getName());
    }


}
