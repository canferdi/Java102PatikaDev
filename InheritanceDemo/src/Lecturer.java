public class Lecturer extends Academician {
    private String doorNum;

    public Lecturer(String name, String mpno, String email, String department, String title, String doorNum) {
        super(name, mpno, email, department, title);
        this.doorNum = doorNum;
    }

    @Override
    public void enter() {
        System.out.println(getName() + " akademisyeni sisteme giriş yaptı.");
    }

    @Override
    public void out() {
        System.out.println(getName() + " akademisyeni sistemden çıkış yaptı.");
    }

    @Override
    public void hall() {
        System.out.println(getName() + " akademisyeni yemekhaneye giriş yaptı.");
    }

    @Override
    public void enterLesson() {
        System.out.println(getName() + " akademisyeni derse girdi.");
    }

    public void meeting() {
        System.out.println("Toplantı yapıldı.");
    }

    public void makeAnExam() {
        System.out.println("Sınav yapıldı.");
    }

    public String getDoorNum() {
        return doorNum;
    }

    public void setDoorNum(String doorNum) {
        this.doorNum = doorNum;
    }

}
