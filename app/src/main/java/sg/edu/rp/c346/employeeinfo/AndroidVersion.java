package sg.edu.rp.c346.employeeinfo;

public class AndroidVersion {
    private String name;
    private String job;
    private String salary;

    public AndroidVersion(String name,String job,String salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String toString(){
        return (name + job + ":" + salary);
    }
}

