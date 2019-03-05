package objects_classes_methods.examples;

class Pwr_10 {
    double b;
    int e;
    double pwr;

    Pwr_10(double base, int exp) {
        this.b = base;
        this.e = exp;

        this.pwr = 1;
        if(exp == 0)
            return;
        for( ; exp > 0; exp--)
            this.pwr = this.pwr * base;
    }

    double get_pwr() {
        return this.pwr;
    }
}

class demoPwr_10 {
    public static void main(String[] args) {
        Pwr_10 x = new Pwr_10(4, 2);
        System.out.println(x.get_pwr());
    }
}


