public class Calc {

    private double num1;
    private double num2;

    // Constructor.

    public Calc () {
        this.setNum1(0);
        this.setNum2(0);
    }

    //public set or mutator method for every private data field.

    public void setNum1(double newNum1){
        this.num1 = newNum1;
    }

    public void setNum2(double newNum2){
        this.num2 = newNum2;
    }

    //public get or accessor method for every private data field

    public double getNum1(){
        return this.num1;
    }

    public double getNum2(){
        return this.num2;
    }

    // Other methods.

    public double add(){
        return num1 + num2;
    }

    public double subtract(){
        return num1 - num2;
    }

    public double multiply(){
        return num1 * num2;
    }

    public double divide(){
        return num1 / num2;
    }

    //public toString method that prints out all of the object state

    public String toString(){
        return "Displaying private data fields using toString():\nNum1: "+ this.num1 +"\nNum2: "+ this.num2;
    }


}