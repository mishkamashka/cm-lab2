package se.ifmo.ru;

public enum Function {

    FIRST("y = sin(x*3/2) + 1/2"), SECOND("y = log(x/5 + cos(2*x))"), THIRD(""), FORTH(""), FIFTH("");

    private String function;

    Function(String function) {
        this.function = function;
    }

    public double calculateFunction(double x) {
        switch (this) {
            case FIRST:
                return (double) (Math.sin(x * 3 / 2) + 1 / 2);
            case SECOND:
                return Math.log(x / 5 + Math.cos(2 * x));
            case THIRD:
                return Math.sqrt(Math.cos(Math.pow(x, 2)));
            case FORTH:
                return 0;
                //return some func calculation
            case FIFTH:
                return 0;
                //return some func calculation
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return this.function;
    }
}
