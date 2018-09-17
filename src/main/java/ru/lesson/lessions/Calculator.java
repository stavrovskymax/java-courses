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


    public void division(int ... params) throws UserException {
        if (params.length > 0 ) {
            this.result = params[0];
            for (int i = 1; i < params.length; i++) {
                if (params[0] == 0 | params[i] == 0) {
                    throw new IllegalArgumentException("You to tru div by 0. Please change parameter!");
                }
                this.result /= params[i];
            }
        } else {
            throw new UserException("You should enter params");
        }
    }


    public int getResult() {
        return this.result;
    }


    public void cleanResult() {
        this.result = 0;
    }
}
