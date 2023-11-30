/*
 * Author: Buckley Wiley
 * Contact: buckley@buckleywiley.com
 * GitHub: https://github.com/BuckDaTruck
 * For help, visit: http://buckleywiley.com/forum/Code/forum.html
 * Description: A zoo managment system
 */
package Unit_5.Unit_5_Project;

public class Zoo {

    private Animal[] occupants;
    private double admissionRate;
    private int numberOfOccupants;

    public Zoo(int capacity) {
        occupants = new Animal[capacity];
        admissionRate = 2.0;
        numberOfOccupants = 0;
    }

    public int getNumberOfOccupants() {
        return numberOfOccupants;
    }

    public double getAdmissionRate() {
        return numberOfOccupants * admissionRate;
    }

    public void takeIn(Animal animal) {
        boolean added = false;
        for (int i = 0; i < occupants.length; i++) {
            if (occupants[i] == null) {
                occupants[i] = animal;
                numberOfOccupants++;
                added = true;
                break;
            }
        }
        if (!added) {
            System.out.println("There are no free enclosures to take in " + animal.getName() + " the "
                    + animal.getSpecies() + "!");
        }
    }

    public void feedTheAnimals() {
        for (Animal animal : occupants) {
            if (animal != null) {
                animal.eat();
            }
        }
    }

    public void cleanEnclosure(int enclosureNumber) {
        if (enclosureNumber >= 0 && enclosureNumber < occupants.length) {
            if (occupants[enclosureNumber] == null) {
                System.out
                        .println("You cleaned enclosure " + enclosureNumber + ". The next occupant will be thankful!");
            } else {
                System.out.println("You cleaned enclosure " + enclosureNumber + ". "
                        + occupants[enclosureNumber].getName() + " looks very happy now!");
            }
        } else {
            System.out.println("There is no enclosure #" + enclosureNumber + "!");
        }
    }

    public void cleanTheEnclosures() {
        for (int i = 0; i < occupants.length; i++) {
            cleanEnclosure(i);
        }
    }

    public void openEnclosure(int enclosureNumber) {
        if (enclosureNumber >= 0 && enclosureNumber < occupants.length) {
            if (this.occupants[enclosureNumber] != null) {
                this.occupants[enclosureNumber].free();
                occupants[enclosureNumber] = null;
            } else {
                System.out.println("Enclosure " + enclosureNumber + " is already empty!");
            }
        } else {
            System.out.println("Enclosure #" + enclosureNumber + "does not exist!");
        }
    }

    public void openAllEnclosures() {
        for (int i = 0; i < occupants.length; i++) {
            openEnclosure(i);
        }
    }

    public String toString() {
        String result = "ENCLOSURES:\n";
        for (int i = 0; i < occupants.length; i++) {

            if (occupants[i] == null) {
                result += "Enclosure " + i + ": Empty\n";
            } else {
                result += "Enclosure " + i + ": " + occupants[i].getName() + " the " + occupants[i].getSpecies() + "\n";
            }
        }
        return result;
    }
}