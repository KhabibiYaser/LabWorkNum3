package Actor;

import Exceptions.WrongParameter;
import FMap.Map;
import Items.Spacesuit.Status;
import SpaceShip.Rocket;
import java.io.PrintStream;

import Exceptions.WrongParameter;
import java.util.LinkedList;
import java.util.Random;

public class Crowd extends Human {

    LinkedList<Astronaut> crowd = new LinkedList<>();


    private String name;
    private int amount;

    private void setAmount(int n) throws WrongParameter {
        if(n<=0){
            throw new WrongParameter("Неправильно введно значение");
        }
        this.amount = n;
    }

    public Crowd(int amount) {
        try{

            this.setAmount(amount);

        } catch (WrongParameter a){
            a.printStackTrace();
        }




    }




    // Пользователь вводит кол-во объектов .
    // соответсвенно тут они создаются в цикле
    // Помещаются  в List или Массив

    public Astronaut[] objects() {
        Astronaut[] astronauts = new Astronaut[amount];
        for (int i = 0; i < amount; i++) {
            Astronaut s = new Astronaut("Коротышка",18);
            astronauts[i] = s;
        }
        return astronauts;
    }




    Random rand = new Random();






    @Override
    public int hashCode() {
        return super.hashCode() ;
    }



}
