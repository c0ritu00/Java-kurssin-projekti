package com.example.app;

public class LocalCourse extends Course {
    
    private String classRoom;
    private static int limit = 25;
    private static int studentCount = 0;

    public LocalCourse(String classRoom, String courseName, String teacherName, String room, long idCounter)
    {
        super(courseName,teacherName,room,idCounter);
        this.classRoom = classRoom;
        
    }

    public String getClassRoom(){
        return this.classRoom;
    }

    public void setClassRoom(String classRoom){
        this.classRoom = classRoom;
    }

    @Override
    public boolean addStudent(Student student){
        if(studentCount < limit){
            super.addStudent(student);
            studentCount++;
            return true;
        } else{
            System.out.println("Kurssille ei enää mahdu!");
            return false;
        }
        
    }

    //Palautetaan kuvaus
    @Override
    public String toString() {
        return String.format(getCourseName() + " " + getTeacherName() + " " + getClassRoom());
    }    
}
