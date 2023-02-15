package Actor;

import Exceptions.WrongParameter;
import FMap.Map;
import Items.Spacesuit;
import Items.Spacesuit.Status;
import SpaceShip.Rocket;
import java.io.PrintStream;

public class Git extends Astronaut{

    // проверить состояние ракеты



    public Git(String name , int age) throws WrongParameter{

        try {
            this.setSuitSpace(Spacesuit.Status.PUT_ON.getText());
            this.setName(name);
            this.setAge(age);
            this.setCurrent_Location(Map.Rocket.getPlace());
        } catch (WrongParameter a){
            a.printStackTrace();
        }


    }


    public void checkRocket (Rocket o) {
        System.out.println( getName() + " проверяет состояние " + "\n" + o.checkAll());
    }

    @Override
    public void setCurrent_Location(String current_Location) throws WrongParameter {

        if (!current_Location.equals(Map.Rocket.getPlace())){
            throw new WrongParameter("Объектов нельзя перемещать");
        }
        super.setCurrent_Location(current_Location);

    }


    public void AnswerAll(Rocket o){
        checkRocket(o);
    }
    public void AnswerAir(Rocket o){
        System.out.println("Спасибо за вопрос , Состояние Воздуха: " + o.getAirState());

    }
    public void AnswerBattery(Rocket o){
        System.out.println("Спасибо за вопрос  , Состояние Баттареи: " + o.getBat() +"%");
    }

    public void AnswerTemp(Rocket o) {
        System.out.println("Спасибо за вопрос . Состояние температуры: " + o.getAirState());
    }

    public void AnswerNum(Rocket o) {
        System.out.println("Спасибо за вопрос . На борту сейчас : " + o.getPassengers().size() + " - пассажиров");
    }






    // проверка кол-ва людей в ракете и нахождения незнайки



    // ответить на вопросы объекта астронавта
    // Если в листе будет Незнайка то селедочка скажет
    // Селедочка сказала, что никого прогонять не надо:
    // если кто-нибудь хочет как следует изучить устройство ракеты, то от этого может быть только польза








}