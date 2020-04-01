package com.sideeg.elegant_supervisor_java.utiltiy;


import com.sideeg.elegant_supervisor_java.models.ParentData;
import com.sideeg.elegant_supervisor_java.models.SchoolData;
import com.sideeg.elegant_supervisor_java.models.StudentData;
import com.sideeg.elegant_supervisor_java.models.SuperVisorData;

public  class StaticElemaents {
    private static SuperVisorData superVisorData;
    private static SchoolData schoolData;
    private static StudentData studentData;
    private static ParentData parentData;

    public static ParentData getParentData() {
        return parentData;
    }

    public static void setParentData(ParentData parentData) {
        StaticElemaents.parentData = parentData;
    }

    public static StudentData getStudentData() {
        return studentData;
    }

    public static void setStudentData(StudentData studentData) {
        StaticElemaents.studentData = studentData;
    }

    public static SchoolData getSchoolData() {
        return schoolData;
    }

    public static void setSchoolData(SchoolData schoolData) {
        StaticElemaents.schoolData = schoolData;
    }

    public static SuperVisorData getSuperVisorData() {
        return superVisorData;
    }

    public static void setSuperVisorData(SuperVisorData superVisorData) {
        StaticElemaents.superVisorData = superVisorData;
    }
}
