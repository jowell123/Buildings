public class LargestVolume extends LargestBuilding {
    int year;
    double volume;
 
    public LargestVolume(int rank, String name, String country, String place, int year, double volume)
    {
       super(rank, name, country, place);
       this.year = year;
       this.volume = volume;
    }
 
    public int getYear()
    {
       return year;
    }
 
    public void setYear(int year)
    {
       this.year = year;
    }
 
    public double getVolume()
    {
       return volume;
    }
 
    public void setVolume(double volume)
    {
       this.volume = volume;
    }
 
    @Override
    public String toString()
    {
       return "LargestVolume{" +
               "rank=" + rank +
               ", name='" + name + '\'' +
               ", country='" + country + '\'' +
               ", place='" + place + '\'' +
               ", year=" + year +
               ", volume=" + volume +
               '}';
    } 
}//class
