package com.epam.courses.practice.lesson07;

public enum DaysOfWeek {
    SUNDAY, MONDAY(true), TUESDAY, WEDNESDAY(true), THURSDAY, FRIDAY(true), SATURDAY;
    private boolean flag;

    DaysOfWeek() { }
    DaysOfWeek(boolean flag) {
        this.flag = flag;
    }
    public boolean isFlag() {return flag;}
    public DaysOfWeek nextDay(){
        DaysOfWeek[] days = DaysOfWeek.values();
        return days[(this.ordinal() + 1) % days.length];
    }
}
