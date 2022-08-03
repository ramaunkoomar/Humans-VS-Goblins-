package model;

public class RandomNumbers {
    private int from = 0;
    private int to = 1;
    public int numberInt = 0;
    public double numberDouble = 0.0;

    RandomNumbers(){}

    RandomNumbers(int to) {
        this.setTo(to);
    }

    public RandomNumbers(int from, int to){
        this.setFrom(from);
        this.setTo(to);
    }

    //Setters
    public void setFrom(int from){
        this.from = from;
    }

    public void setTo(int to){
        this.to = to;
    }

    public int setNumberInt(int num ){
        this.numberInt = num;
        return this.numberInt;
    }

    public double  setNumberDouble(double num){
        this.numberDouble = num;
        return this.numberDouble;
    }

    //Getters
    public int getFrom(){
        return this.from;
    }

    public int getTo(){
        return this.to;
    }

    public int getNumberInt(){
        return this.numberInt;
    }

    public double getNumberDouble(){
        return this.numberDouble;
    }



    //Methods
    public int Int(){
        return setNumberInt(randI(this.getFrom(),this.getTo()));
    }

    public int Int(int to){
        this.setTo(to);
        return setNumberInt(randI(this.getFrom(),this.getTo()));
    }

    public int Int(int from, int to){
        this.setFrom(from);
        this.setTo(to);
        return setNumberInt(randI(this.getFrom(),this.getTo()));
    }

    public double Double(){
        return setNumberDouble(randD(this.getFrom(),this.getTo()));
    }

    public double Double(int to){
        this.setTo(to);
        return setNumberDouble(randD(this.getFrom(),this.getTo()));
    }

    public double Double(int from,int to){
        this.setFrom(from);
        this.setTo(to);
        return setNumberDouble(randD(this.getFrom(),this.getTo()));
    }

    public int randI(int from,int to){
        double number = Math.random();
        if (this.getFrom() < 0 ) {
            return (int) Math.round(number * (Math.abs(from - to)) + from);
        }
        return (int) Math.round(number * to + (from-(from*number)));
    }

    public double randD(int from,int to){
        double number = Math.random();
        if (this.getFrom() < 0 ) {
            return  (number * (Math.abs(from - to)) + from);
        }
        return ((number * to) + (from-(from*number)));
    }
}
