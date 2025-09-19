package _05_Inheritance;

// ===== Association =====
// Association is a general "uses/works with" relationship between two classes.
// Example: Doctor is associated with Patient (can exist independently).

import java.util.ArrayList;
import java.util.List;

class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void treat(Patient patient) {
        System.out.println(name + " is treating " + patient.getName());
    }
}

class Patient {
    private String name;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// ===== Aggregation =====
// Aggregation is a "HAS-A" relationship where child objects can exist independently.
// Example: Team has Players, but Players can exist without Team.

class Team {
    private String teamName;
    private Player player; // Aggregation (player can exist without team)

    public Team(String teamName, Player player) {
        this.teamName = teamName;
        this.player = player;
    }

    public void showTeamInfo() {
        System.out.println(player.getName() + " is a player of " + teamName);
    }
}

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// ===== Composition =====
// Composition is a strong "HAS-A" relationship where child object cannot exist without parent.
// Example: House has Rooms. If House is destroyed, its Rooms are destroyed too.

class Room {
    private String type;

    public Room(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class House {
    private List<Room> rooms; // Composition: House owns its rooms

    public House() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(String type) {
        rooms.add(new Room(type));
    }

    void showHouse() {
        System.out.println("House contains:");
        for (Room room : rooms)
        {
            System.out.println(room.getType());
        }
    }
}

public class _11_Relationships {
    public static void main(String[] args) {

        // Association example
        System.out.println("----- Association -----");
        Doctor doctor = new Doctor("Dr. Jenny");
        Patient patient = new Patient("Grace");
        doctor.treat(patient); // Doctor works with Patient

        // Aggregation example
        System.out.println("\n----- Aggregation -----");
        Player p1 = new Player("Jane");
        Team team1 = new Team("Football Team", p1);
        Team team2 = new Team("Cricket Team", new Player("Lucy"));

        // Team has Player, but Player can exist independently
        team1.showTeamInfo();
        team2.showTeamInfo();

        // Composition example
        System.out.println("\n----- Composition -----");
        House house = new House();
        house.addRoom("Bedroom");
        house.addRoom("Living Room");
        house.addRoom("Kitchen");
        house.showHouse();

    }
}
