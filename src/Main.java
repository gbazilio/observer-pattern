/**
 * Created by bazilio on 30/07/15.
 */
public class Main {

    public static void main(String[] args) {

        // The Observable instance. This is what we gonna monitor
        PersonalData personalData = new PersonalData();

        // The Observers. This are instances that's gonna be notified
        // when the observable changes
        PersonalNameObserver personalNameObserver = new PersonalNameObserver(personalData);
        NationalityObserver nationalityObserver = new NationalityObserver(personalData);

        // Console outputs are expected when observable' state is modified
        personalData.setPersonalName("Guilherme");
        personalData.setNationality("Brazilian");

    }

}
