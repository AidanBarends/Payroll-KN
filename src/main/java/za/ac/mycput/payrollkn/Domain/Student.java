package za.ac.mycput.payrollkn.Domain;

public class Student extends Person{

    private String studNum;;

    private Student(){
        super();
    }

    private Student(Builder builder){
        super(new Person.Builder()
                .setFirstName(builder.firstName)
                .setLastName(builder.lastName));

        this.studNum = builder.studNum;
    }

    public String getStudNum() {
        return studNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studNum='" + studNum + '\'' +
                ",firstName='" + getFirstName() + '\'' +
                ",lastName='" + getLastName() + '\'' +
                '}';
    }

    public static class Builder{
        private String firstName;
        private String lastName;

        private String studNum;

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setStudNum(String studNum) {
            this.studNum = studNum;
            return this;
        }

        public Builder copy(Student student){
            this.firstName = student.getFirstName();
            this.lastName = student.getLastName();
            this.studNum = student.getStudNum();

            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}
