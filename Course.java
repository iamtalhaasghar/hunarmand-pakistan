public class Course {
    String name;
    String code;
    String instructor;
    String time; // morning / evening
    String preRequisites;
    String learninOutcomes;
    String duration; // how many weeks

    Course(){

    }
    Course(String name){
        setName(name);
    }

    Course(String name, String code){
        this(name);
        setCode(code);
    }

    Course(String name, String code, String instructor){
        this(name, code);
        setInstructor(instructor);

    }
    Course(String name, String code, String instructor, String time){
       this(name, code, instructor);
       setTime(time);
    }

    String getName(){
        return name;
    }

    void setName(String courseName){
        if (courseName.length() == 0){
            System.out.println("You did not provided us with a proper name.");
            return;
        }
        // First Name
        name = courseName;
    }

    String getInstructor(){
        return this.instructor;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setPreRequisites(String preRequisites) {
        this.preRequisites = preRequisites;
    }

    public void setLearninOutcomes(String learninOutcomes) {
        this.learninOutcomes = learninOutcomes;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
