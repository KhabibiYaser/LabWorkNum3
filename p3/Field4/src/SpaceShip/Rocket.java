package SpaceShip;

import Actor.Astronaut;
import Actor.Git;
import Actor.Neznaika;
import Exceptions.LowBatteryException;
import Items.Spacesuit;
import Items.Spacesuit.Status;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Rocket {


    private final String name = "Ракета";

    private static int bat = 53;




    public int getBat() {
        return bat;
    }

    List<Astronaut> Passengers = new LinkedList<>();

    // private int amountPeople = 2; Фуксия и Селедочка уже в ракете

    // здесь нужно еще реализовать сколько людей в ракете , чтобы стат классом door впускать их и выпускать .

    // будет отдельный класс group который по идее должен будет наследоваться от Human
    //

    private int temperature = 2;
    private String airState = Condition.FRESH.getAir();


    public void startLaunch(Rocket.Battery battery_obj) throws LowBatteryException {

        battery_obj.setBattery();
        Engine engine = new Engine();
        engine.startEngine(battery_obj);
    }


    private class Engine {
        // всякие характеристики которые можно связать геттерем

        public void startEngine(Rocket.Battery a) throws LowBatteryException {
            if (a.getBattery() > 50) {
                System.out.println("СИСТЕМНЫЕ ДАННЫЕ <<< Двигатели включаются , Ракета готова к работе , состояние воздуха на борту : " +
                        airState + "\n" + "Уровень заряда батарейки " + a.getBattery() + "% >>>");
            } else {
                // Можно кинуть свой экспшн
                throw new LowBatteryException("Заряда батарейки не хвататает , чтобы включить внутренние механизмы ракеты");
            }

        }


        public void endEngine() {
            System.out.println("Двигатели выключаются , Ракета прекратила работу");
        }

    }

    public static class Battery {

        private int battery = 53;

        public void setBattery() {
            bat = battery;
        }

        public void check() {
            bat = battery;
            System.out.println("Уровень заряда батарейки ракеты " + battery + "%");
        }

        public void setCharging(int level) {

            System.out.println("Вы зарядили ракету на " + level + "%");
            battery = level;
        }

        public int getBattery() {
            return battery;
        }
    }



    public String getAirState() {
        return airState;
    }

    public void setAirState(String airState) {
        this.airState = airState;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    // Место для эксепшена
    public void addCrowd(boolean addSuits, List<Git> gits, Neznaika n, Astronaut... astronauts) {
        this.Passengers.addAll(gits);
        this.Passengers.add(n);
        if (astronauts.length < 48) {
            System.out.println("Недостаточно пассажиров");
            System.exit(0);
        } else {
            for (Astronaut i : astronauts) {

                i.PutSpaceSuit(new Spacesuit(), addSuits);

                if (i.getSuitSpace().equals(Spacesuit.Status.PUT_OFF.getText())) {
                    throw new RuntimeException("Нет скафндара");
                }

                this.Passengers.add(i);

            }
        }


    }


    public List<Astronaut> getPassengers() {
        return Passengers;
    }


    @Override
    public String toString() {
        return name;
    }

    public String checkAll() {
        return "Состояние воздуха: " + getAirState() +
                "\n" + "Температура на борту: " + getTemperature();
    }


    public void startExcursion(String GidName, String _astronaut_) {
        Git gid = null;
        Astronaut astro = null;
        for (Astronaut i : Passengers) {
            if (i.getName().equals(GidName) & i instanceof Git) {
                gid = (Git) i;
                break;
            }
        }
        for (Astronaut l : Passengers) {
            if (l.getName().equals(_astronaut_)) {
                astro = l;
                break;
            }
        }


        if (gid == null) {
            throw new RuntimeException("Гида нет");
        } else if (astro == null) {
            throw new RuntimeException("Коротышки нет");
        }


        System.out.println("Начинаем экскурсию по ракете , задавайте вопросы :");

        System.out.println("\n");
        astro.askAir();
        gid.AnswerAir(this);
        System.out.println("\n");
        astro.askBattery();
        gid.AnswerBattery(this);
        System.out.println("\n");
        astro.askTemp();
        gid.AnswerTemp(this);
        System.out.println("\n");
        astro.askNum();
        gid.AnswerNum(this);



    }
}