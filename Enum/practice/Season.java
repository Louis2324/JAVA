package Enum.practice;

public enum Season {
    WINTER("cold"),
    SUMMER("hot"),
    SPRING("Pleasant"),
    FALL("Cool");

    private String description;

    Season(String descrp) {
        this.description = descrp;
    }

    public String getDescription() {
        return description;
    }

}
