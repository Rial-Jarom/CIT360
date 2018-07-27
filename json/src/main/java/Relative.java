public class Relative {
    private String name;
    private String birth;
    private String death;
    private String relationship;

    public Relative(String name, String birth, String death, String relationship) {
        this.name = name;
        this.birth = birth;
        this.death = death;
        this.relationship = relationship;
    }

    public String getName() {
        return name;
    }
    public String getBirth() {
        return birth;
    }
    public String getDeath() {
        return death;
    }
    public String getRelationship() {
        return relationship;
    }
    public String toString() {
        return "Relative [ name: " + name + ", age: " + birth + ", death: " + death + ", relationship: " + relationship + " ]";
    }
}
