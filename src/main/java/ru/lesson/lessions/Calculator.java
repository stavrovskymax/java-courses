package ru.lesson.lessions;

public class Calculator {

    private int result;

    public void sum(int ... params) {
        this.result = params[0];
        for(int i=1; i<params.length; i++)
            this.result += params[i];
    }


    public void subtraction(int ... params) {
        this.result = params[0];
        for(int i=1; i<params.length; i++)
            this.result -= params[i];
    }


    public void multiplication(int ... params) {
        this.result = params[0];
        for(int i=1; i<params.length; i++)
            this.result *= params[i];
    }


    public void division(int ... params) {
        this.result = params[0];
        for(int i=1; i<params.length; i++)
            this.result /= params[i];
    }


    public int getResult() {
        return this.result;
    }


    public void cleanResult() {
        this.result = 0;
    }
}
