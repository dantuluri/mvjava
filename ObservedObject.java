
import java.util.Observable;
import java.util.Observer;

class ObservedObject extends Observable {
   private String watchedValue;

   public ObservedObject(String value) {
   watchedValue = value;
   }

   public void setValue(String value) {
   // if value has changed notify observers
   if(!watchedValue.equals(value)) {
   watchedValue = value;

   // mark as value changed
   setChanged();
   }

   }
}
public class ObservableDemo implements Observer {
   public String name;
   public ObservableDemo(String name) {
   this.name = name;
   }

   public static void main(String[] args) {
   // create watched and watcher objects
   ObservedObject watched = new ObservedObject("Original Value");
   // watcher object listens to object change
   ObservableDemo watcher = new ObservableDemo("Watcher");
   // add observer to the watched object
   watched.addObserver(watcher);

   // trigger value change
   System.out.println("setValue method called...");
   watched.setValue("New Value");
   // check if value has changed
   if(watched.hasChanged())
   System.out.println("Value changed");
   else
   System.out.println("Value not changed");
   }

   public void update(Observable obj, Object arg) {
   System.out.println("Update called");
   }
}
