package internship.eway.final_project.models

class DayOff {
    int typeDayOff
    String description

    DayOff() {
    }

    DayOff(int typeDayOff, String description) {
        this.typeDayOff = typeDayOff
        this.description = description
    }
}
