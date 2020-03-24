package cl.uach.inf.smartsheep.data.model;

public class Sheep {
    private String earring;
    private String earringColor;
    private String gender;
    private String breed;
    private double birthWeight;
    private String birthDate;
    private String purpose;
    private String category;
    private double merit;
    private int isDead;

    public Sheep(String earring, String earringColor, String gender, String breed, double birthWeight, String birthDate, String purpose, String category, double merit, int isDead) {
        this.earring = earring;
        this.earringColor = earringColor;
        this.gender = gender;
        this.breed = breed;
        this.birthWeight = birthWeight;
        this.birthDate = birthDate;
        this.purpose = purpose;
        this.category = category;
        this.merit = merit;
        this.isDead = isDead;
    }


    public String getEarring() {
        return earring;
    }

    public void setEarring(String earring) {
        this.earring = earring;
    }

    public String getEarringColor() {
        return earringColor;
    }

    public void setEarringColor(String earringColor) {
        this.earringColor = earringColor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public double getBirthWeight() {
        return birthWeight;
    }

    public void setBirthWeight(double birthWeight) {
        this.birthWeight = birthWeight;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getMerit() {
        return merit;
    }

    public void setMerit(double merit) {
        this.merit = merit;
    }

    public int getIsDead() {
        return isDead;
    }

    public void setIsDead(int isDead) {
        this.isDead = isDead;
    }

}
