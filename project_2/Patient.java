package project_2;

public class Patient {
    private int age;
    private int sex;
    private int cp;
    private int trestbps;
    private int chol;
    private int fbs;
    private int thalach;
    private int exang;
    private int target;

    // Build contructor
    public Patient(int age, int sex, int target){
        this.age = age;
        this.sex = sex;
        this.cp = 0;
        this.trestbps = 0;
        this.chol = 0;
        this.fbs = 0;
        this.thalach = 0;
        this.exang = 0;
        this.target = target;
    }
    public Patient(int age, int sex, int cp, int trestbps, int chol, int fbs, int thalach, int exang, int target){
        this.age = age;
        this.sex = sex;
        this.cp = cp;
        this.trestbps = trestbps;
        this.chol = chol;
        this.fbs = fbs;
        this.thalach = thalach;
        this.exang = exang;
        this.target = target;
    }
    //define method with switch to grab patient information by feild name.
    public Object getPatientInfo(String field){
        switch (field){
            case "age":
                return age;
            case "sex":
                return sex;
            case "cp":
                return cp;
            case "trestbps":
                return trestbps;
            case "chol":
                return chol;
            case "fbs":
                return fbs;
            case "thalach":
                return thalach;
            case "exang":
                return exang;
            case "target":
                return target;
            default:
                return null;
        }
    }

    // define getters
    public int getAge(){
        return age;
    }
    public int getSex(){
        return sex;
    }
    public int getCp(){
        return cp;
    }
    public int getTrestbps(){
        return trestbps;
    }
    public int getChol(){
        return chol;
    }
    public int getFbs(){
        return fbs;
    }
    public int getThalach(){
        return thalach;
    }
    public int getExang(){
        return exang;
    }
    public int getTarget(){
        return target;
    }
    public String toString(){
        return String.format("Age: %d\nSex: %d\nCp: %d\nTrestbps: %d\nChol: %d\nFbs: %d\nThalach: %d\nExang: %d\nTarget: %d\n", age,sex,cp,trestbps,chol,fbs,thalach,exang,target);
    }
}