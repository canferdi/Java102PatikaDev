public abstract class Employee {
    private String name;
    private String mpno;
    private String email;

    public Employee(String name, String mpno, String email) {
        this.name = name;
        this.mpno = mpno;
        this.email = email;
    }

    public abstract void enter();

    public abstract void out();

    public abstract void hall();

    public String getName() {
        return name;
    }

    public String getMpno() {
        return mpno;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMpno(String mpno) {
        this.mpno = mpno;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
