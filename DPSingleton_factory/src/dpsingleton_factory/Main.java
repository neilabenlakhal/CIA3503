package dpsingleton_factory;

// Step 1: Define the Planet interface with attributes and methods
interface Planet {
    String getName();
    double getMass();
    void orbit();
}

// Step 2: Create concrete classes that implement the Planet interface
class Sun implements Planet {
    private String name;
    private double mass;

    // Step 2.1: Constructor to initialize attributes
    public Sun() {
        name = "Sun";
        mass = 1.989 * Math.pow(10, 30); // Mass of the Sun in kg
    }

    // Step 2.2: Implement the getter methods
    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    // Step 2.3: Implement the orbit method
    public void orbit() {
        System.out.println(name + " doesn't orbit.");
    }
}

class Moon implements Planet {
    private String name;
    private double mass;

    // Step 2.1: Constructor to initialize attributes
    public Moon() {
        name = "Moon";
        mass = 7.342 * Math.pow(10, 22); // Mass of the Moon in kg
    }

    // Step 2.2: Implement the getter methods
    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    // Step 2.3: Implement the orbit method
    public void orbit() {
        System.out.println(name + " orbits the Earth.");
    }
}

class Earth implements Planet {
    private String name;
    private double mass;

    // Step 2.1: Constructor to initialize attributes
    public Earth() {
        name = "Earth";
        mass = 5.972 * Math.pow(10, 24); // Mass of the Earth in kg
    }

    // Step 2.2: Implement the getter methods
    public String getName() {
        return name;
    }

    public double getMass() {
        return mass;
    }

    // Step 2.3: Implement the orbit method
    public void orbit() {
        System.out.println(name + " orbits the Sun.");
    }
}

// Step 3: Implement the PlanetFactory class
class PlanetFactory {
    private static PlanetFactory instance;  //Step1 of Singleton design pattern

    // Step 3.1: Private constructor to make the factory a Singleton
    private PlanetFactory() {
        // Initialize if needed
    }

    // Step 3.2: Singleton instance retrieval method
    public static PlanetFactory getInstance() {
        if (instance == null) {
            instance = new PlanetFactory();
        }
        return instance;
    }

    // Step 3.3: Factory method to create instances of Planet subclasses
    public Planet createPlanet(String type) {
        if ("Sun".equalsIgnoreCase(type)) {
            return new Sun();
        } else if ("Moon".equalsIgnoreCase(type)) {
            return new Moon();
        } else if ("Earth".equalsIgnoreCase(type)) {
            return new Earth();
        }
        return null; // Handle other types if needed
    }
}

// Step 4: Demonstrate the Usage
public class Main {
    public static void main(String[] args) {
        PlanetFactory factory = PlanetFactory.getInstance();

        // Create instances of planets
        Planet sun = factory.createPlanet("Sun");
        Planet moon = factory.createPlanet("Moon");
        Planet earth = factory.createPlanet("Earth");

        // Print details and orbit them
        System.out.println(sun.getName() + " - Mass: " + sun.getMass() + " kg");
        sun.orbit();

        System.out.println(moon.getName() + " - Mass: " + moon.getMass() + " kg");
        moon.orbit();

        System.out.println(earth.getName() + " - Mass: " + earth.getMass() + " kg");
        earth.orbit();
    }
}
