package basic;
class employee {
    float salary=1000;
    
}
class subemployee extends employee{
    int bonus=2000;

    public static void main(String[] args){
        subemployee emp=new subemployee();
        System.out.println("bonus is "+emp.bonus);
        System.out.println("Salary is "+emp.salary);
    
    }
}

