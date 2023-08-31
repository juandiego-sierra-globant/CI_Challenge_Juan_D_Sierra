public class Album {
    private String name;
    private String numberOfSongs;
    
    public Album(String name, String numberOfSongs){
        this.name=name;
        this.numberOfSongs=numberOfSongs;
    }
    
    public String getName(){
        return name;
    }
    public String getNumberOfSongs(){
        return numberOfSongs;
    }
}