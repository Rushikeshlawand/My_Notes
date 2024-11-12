class hello{
    constructor(name,rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }
    Dispplay(){
        console.log(this.name,this.rollNumber);
    }
}
class Child extends hello{
    constructor(name,rollNumber,age){
        super(name,rollNumber)
        this.age=age;
    }
    Dispplay(){
        console.log(this.name,this.rollNumber,this.age);
    }
}

const obj=new Child ("rushi",99,24);

obj.Dispplay(); 