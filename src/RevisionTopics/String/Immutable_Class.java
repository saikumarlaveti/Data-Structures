package RevisionTopics.String;

public final class Immutable_Class {
    private final String panNumber;

    public String getPanNumber() {
        return panNumber;
    }
    Immutable_Class(String pan){
        this.panNumber = pan;
    }

    public static void main(String[] args) {
        Immutable_Class ic  = new Immutable_Class("LSK143");
        System.out.println(ic.getPanNumber()); //LSK143
    }
}
