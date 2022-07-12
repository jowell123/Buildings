public class LargestFloorArea extends LargestBuilding {
    int floorArea;

    public LargestFloorArea(int rank, String name, String country, String place, int floorArea)
    {
       super(rank, name, country, place);
       this.floorArea = floorArea;
    }
 
    public int getFloorArea()
    {
       return floorArea;
    }
 
    public void setFloorArea(int floorArea)
    {
       this.floorArea = floorArea;
    }
 
    @Override
    public String toString()
    {
       return "LargestFloorArea{" +
               "rank=" + rank +
               ", name='" + name + '\'' +
               ", country='" + country + '\'' +
               ", place='" + place + '\'' +
               ", floorArea=" + floorArea +
               '}';
    } 
}//class
