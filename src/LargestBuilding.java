public class LargestBuilding {
int rank;
   String name;
   String country;
   String place;

   public LargestBuilding(int rank, String name, String country, String place)
   {
      this.rank = rank;
      this.name = name;
      this.country = country;
      this.place = place;
   }//default contructor

   public int getRank()
   {
      return rank;
   }

   public void setRank(int rank)
   {
      this.rank = rank;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getCountry()
   {
      return country;
   }

   public void setCountry(String country)
   {
      this.country = country;
   }

   public String getPlace()
   {
      return place;
   }

   public void setPlace(String place)
   {
      this.place = place;
   }

   @Override
   public String toString()
   {
      return "LargestBuilding{" +
              "rank=" + rank +
              ", name='" + name + '\'' +
              ", country='" + country + '\'' +
              ", place='" + place + '\'' +
              '}';
   } 
}//class