public class Building {
    String nameBuilding;//Building Name
    int numFloors;//No of Floors
    int numRoomsFloor;//Rooms per floor
    String colour;//Building Colour 

    //Getters
    public String getNameBuilding(){
        return nameBuilding;
    }
    public int getNumFloors(){
        return numFloors;
    }
    public int getNumRoomsFloor(){
        return numRoomsFloor;
    }
    public String getColour(){
        return colour;
    }
    public int getRoomsBuilding(){
        return numFloors * numRoomsFloor;
    }
    
    //Setters
    public void setNameBuilding(String newNameBuilding){
        this.nameBuilding = newNameBuilding;
    }
    public void setNumFloors(int newNumFloors){
        this.numFloors = newNumFloors;
    }
    public void setNumRoomsFloor(int newNumRoomsFloor){
        this.numRoomsFloor = newNumRoomsFloor;
    }
    public void setColour(String newColour){
        this.colour = newColour;
    }

    //Method
    public void printBuilding(){
        String[] building = {nameBuilding, colour};
        System.out.println(building[0]+" is a "+building[1]+" building. It has "+getRoomsBuilding()+" rooms.\n");
    } 

}