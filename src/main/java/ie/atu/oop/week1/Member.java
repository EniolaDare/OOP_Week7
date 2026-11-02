package ie.atu.oop.week1;

public class Member {
    private final String memberId;
    private final String name;
    private int age;

    public Member(String memberId, String name, Integer age) {
        if (memberId == null || memberId.isBlank()) throw new IllegalArgumentException("memberId cannot be null or blank");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("name cannot be null or blank");
        if (age == null|| age <= 0) throw new IllegalArgumentException("age cannot must be positive");

        this.memberId = memberId;
        this.name = name;
        this.age = age;
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    public void displayDetails() {
        System.out.println(memberId);
        System.out.println(name);
        System.out.println(age);
    }
}
