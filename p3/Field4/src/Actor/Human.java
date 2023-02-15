package Actor;

import Exceptions.WrongParameter;
import FMap.Map;

// поле текущей локацции
//
public class Human implements Abilities{

    private String levitation = State.OnGround.getState();

    private String name;
    private int age;

    private String Current_Location = Map.FlowerCity.getPlace();


    private String emotion = StateOfMind.HAPPY.getMind();


    public Human(String name){
        this.name = name;
    }
    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Human(String name,int age,String current_Location){
        this.Current_Location = current_Location;
        this.name = name;
        this.age = age;
    }

    public Human(){
    }






    public String getEmotion() {
        return emotion;
    }

    public void setCurrent_Location(String current_Location) throws WrongParameter {
        Current_Location = current_Location;
    }

    public String getLevitation() {
        return levitation;
    }


    public void setEmotion(String emotion) {
        this.emotion = emotion;
    }

    void setAge(int age) {
        this.age = age;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }


    public String getCurrent_Location() {
        return Current_Location;
    }

    public void setLevitation(String levitation) {
        this.levitation = levitation;
    }

    @Override
    public String toString() {
        return this.name;
    }


    @Override
    public void ChangeEmotion(Human human,String state) {
        if (state.equals(StateOfMind.HAPPY.getMind())){
            human.setEmotion(StateOfMind.HAPPY.getMind());
        } else {
            human.setEmotion(StateOfMind.ANGRY.getMind());
        }
    }



}