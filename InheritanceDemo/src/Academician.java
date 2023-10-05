public abstract class Academician extends Employee {
    private String department;
    private String title;

    public Academician(String name, String mpno, String email, String department, String title) {
        super(name, mpno, email);
        this.department = department;
        this.title = title;
    }

    public abstract void enterLesson();

    public String getDepartment() {
        return department;
    }

    public String getTitle() {
        return title;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
