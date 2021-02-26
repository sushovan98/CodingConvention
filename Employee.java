class employee{
    int id;
    double salary=0.0;
    private long Salary;

    public employee(int Id) {
        this.id = id;
    }

    public employee() {
    }

    double calTax(){
        if(this.Salary > 500000.00 && this.salary < 1000000)
            return this.salary*0.1;

        else if(this.salary >1000000.00 && this.Salary < 1500000)
        return this.Salary*0.2;

        else
        return this.Salary*0.3;

    }

}
