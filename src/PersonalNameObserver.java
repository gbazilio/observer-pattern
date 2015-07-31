import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by bazilio on 30/07/15.
 */
public class PersonalNameObserver implements Observer {

    public static final String FIELD_KEY = "personal_name";
    private Observable observable;

    public PersonalNameObserver(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(getClass().getCanonicalName() + " notified!");
        Map<String, String> changes = (Map<String, String>)arg;

        if (changes.containsKey(FIELD_KEY)) {
            System.out.println("Change in Personal Name to: " + changes.get(FIELD_KEY));
        }
    }

}
