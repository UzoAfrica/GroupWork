package models;

import enums.TYPE;


public class Car {

    private Integer id;

    private String name;

    private TYPE typeOfCar;

    private Integer modelYear;

    public Car() {
    }

    public Car(Integer id, String name, TYPE typeOfCar, Integer modelYear) {
        this.id = id;
        this.name = name;
        this.typeOfCar = typeOfCar;
        this.modelYear = modelYear;
        

    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TYPE getTypeOfCar(){
        
        return typeOfCar;
    }

    public void setTypeOfCar (TYPE typeOfCar){
        this.typeOfCar = typeOfCar;
    }
    

    public String getModelYear(){
        if(this.modelYear>=2022){
            return "Buy this Car";
        }
        else{
            return "Don't buy this car";
        }
    }
    public void setModelYear(Integer modelYear){
        modelYear+=10;
        this.modelYear = modelYear;
    }

    @overrige
    public String tiString (){
        return "Car[" +
                "id=" + id +
                ", name ='" + name + '\'' +
                ", typeOfCar=" +typeOfCar +
                ", modelYear =" + modelYear +
                        ']';
    }

    public void setModeYear(int i) {
    }
}
