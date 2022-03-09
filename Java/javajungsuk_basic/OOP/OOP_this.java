package javajungsuk_basic.OOP;

public class OOP_this {
    public static void main(String[] args){
        Car2 c1 = new Car2();
        Car2 c2 = new Car2("red");
    }
    public static class Car2{
        String color;
        String gearType;
        int door;

        public Car2(){
            this("white", "auto", 4);
//            color = "white";
//            gearType = "auto";
//            door = 4;
        }
        public Car2(String color){
            this(color, "auto", 4);
        }

        public Car2(String color, String gearType, int door){
            this.color = color;
            this.gearType = gearType;
            this.door = door;
        }


    }
}
