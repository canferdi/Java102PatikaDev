public class Assistant extends Academician {
    private String officeHour;

    public Assistant(String name, String mpno, String email, String department, String title, String officeHour) {
        super(name, mpno, email, department, title);
        this.officeHour = officeHour;
    }

    @Override
    public void enter() {
        System.out.println(getName() + " asistanı sisteme giriş yaptı.");
    }

    @Override
    public void out() {
        System.out.println(getName() + " asistanı sistemden çıkış yaptı.");
    }

    @Override
    public void hall() {
        System.out.println(getName() + " asistanı yemekhaneye giriş yaptı.");
    }

    @Override
    public void enterLesson() {
        System.out.println(getName() + " asistanı derse girdi.");
    }

    public void makeQuiz() {
        System.out.println("Quiz yapıldı.");

    }

    public String getOfficeHour() {
        return officeHour;
    }

    public void setOfficeHour(String officeHour) {
        this.officeHour = officeHour;
    }

}
