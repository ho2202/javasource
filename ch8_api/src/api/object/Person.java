package api.object;

public class Person {
    private String id;
    private String name;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        // Object의 메소드
        return this.id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person p = (Person) obj;
            // 아이디와 이름이 같으면
            if (this.id.equals(p.id) && this.name.equals(p.name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
