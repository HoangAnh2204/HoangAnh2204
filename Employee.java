class Employee {
    public String name , address;
    public int age;
    public double hours, basicRate;


    public Employee(String name, int age, Double hours, String address){
        this.name = name;
        this.age = age;
        this.hours = hours;
        this.address = address;
        basicRate = 120000;
    }
    public void setAge(int age){
        this.age = age;

    }
    public void setName(String name){
        this.name = name;
    }
    public void setHours(double hours){
        this.hours = hours;
    }
    public void setAdress(String address){
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getHours(){
        return hours;
    }
    public double getSalary(){
        double salary;
        salary = hours * basicRate;
        if (salary < 10000000){
            salary = salary;

        }
        if (salary >= 10000000 && salary < 15000000){
            salary = salary - salary * 0.1;

        }
        if (salary >= 15000000 && salary < 20000000){
            salary = salary - salary * 0.12;

        }
        if (salary > 20000000){
            salary = salary - salary * 0.15;

        }
        return salary;


    }


}
