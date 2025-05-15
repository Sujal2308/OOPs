package JAVA15.Enums;

public enum Company {
    AMAZON(10_00_000),
    FLIPKART(23_00_000),
    MERCEDES;

    // instance variable in enum
    int turnOver;

    // CONSTRUCTOR in enum
    Company(int turnOver){
        this.turnOver = turnOver;
    }

    Company(){
        this(100);
    }

    public int getTurnOver(){
        return turnOver;
    }
}
