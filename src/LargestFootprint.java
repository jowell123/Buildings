public class LargestFootprint extends LargestBuilding {
    int footprint;

   public LargestFootprint(int rank, String name, String country, String place, int footprint)
   {
      super(rank, name, country, place);
      this.footprint = footprint;
   }

   public int getFootprint()
   {
      return footprint;
   }

   public void setFootprint(int footprint)
   {
      this.footprint = footprint;
   }

   @Override
   public String toString()
   {
      return "LargestFootprint{" +
              "rank=" + rank +
              ", name='" + name + '\'' +
              ", country='" + country + '\'' +
              ", place='" + place + '\'' +
              ", footprint=" + footprint +
              '}';
   }
}//class
