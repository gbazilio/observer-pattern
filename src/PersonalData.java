import java.util.*;

/**
 * Created by bazilio on 30/07/15.
 */
public class PersonalData extends Observable {

    private String personalName;
    private String nationality;

    public String getPersonalName() {
        return personalName;
    }

    public void setPersonalName(String personalName) {
        this.personalName = personalName;
        setChanged();

        Map<String, String> changes = new HashMap<>();
        changes.put("personal_name", this.personalName);

        notifyObservers(changes);
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
        setChanged();

        Map<String, String> changes = new HashMap<>();
        changes.put("nationality", this.nationality);

        notifyObservers(changes);
    }
}
