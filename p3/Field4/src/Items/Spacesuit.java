package Items;

import Actor.Astronaut;
public class Spacesuit{
    public enum Status {
        PUT_ON (" надет"),
        PUT_OFF (" снят");

        private String text;
        Status(String s){
            text = s;
        }

        public String getText() {
            return text;
        }
    }

    private String state = Status.PUT_OFF.getText();

    public String putON(){
        this.state = Status.PUT_ON.getText();
        return state;
    }

    public String putOFF(){
        this.state = Status.PUT_OFF.getText();
        return state;
    }

    public String getState() {
        return state;
    }
}
