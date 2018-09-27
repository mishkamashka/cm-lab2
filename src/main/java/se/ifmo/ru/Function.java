package se.ifmo.ru;

public enum Function {

    FIRST("y = lnj"), SECOND(""), THIRD(""), FORTH(""), FIFTH("");

    private String function;

    Function(String function) {
        this.function = function;
    }

    public double calculateFunction(double x) {
        switch (this) {
            case FIRST:
                //return some func calculation
                break;
            case SECOND:
                //return some func calculation
                break;
            case THIRD:
                //return some func calculation
                break;
            case FORTH:
                //return some func calculation
                break;
            case FIFTH:
                //return some func calculation
                break;
        }
    }

    @Override
    public String toString() {
        return this.function;
    }
}
