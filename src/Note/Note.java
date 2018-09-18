package Note;

public class Note {
    private String noteName;
    private Note(String noteName){
        this.noteName=noteName;
    }
    public String toString(){
        return noteName;
    }
    public static final Note
     MIDDLE_C = new Note("Srodkowe C"),
     C_SHARP = new Note("C wysokie"),
     B_FLAT = new Note("B z bemolem");
}
