import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by bazilio on 30/07/15.
 */
public class NationalityObserver implements Observer {

    public static final String FIELD_NATIONALITY = "nationality";
    private Observable personalData;

    public NationalityObserver(Observable personalData) {
        this.personalData = personalData;
        personalData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(getClass().getCanonicalName() + " notified!");
        Map<String, String> changes = (Map<String, String>) arg;

        if (changes.containsKey(FIELD_NATIONALITY)) {
            System.out.println("Change in Nationality to: " + changes.get(FIELD_NATIONALITY));
        }
    }
}
