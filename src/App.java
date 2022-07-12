import java.util.ArrayList;
import java.util.Scanner;
public class App {
    public static void main (String [] args)
    {
       Scanner keyboard = new Scanner(System.in);
 
       String sizeResponse;
       char sizeChar;
       int response;
 
       ArrayList <LargestFloorArea> floorList = new ArrayList<>();
       ArrayList<LargestVolume> volumeList = new ArrayList<>();
       ArrayList<LargestFootprint> footprintList = new ArrayList<>();
 
       floorList.add(new LargestFloorArea(1,"Tower", "Italy", "Piza", 2222));
       floorList.add(new LargestFloorArea(2, "Peppa Hill", "Peppa Pig World", "Imagination", 99999));
       floorList.add(new LargestFloorArea(3, "Pen", "Farm", "Old MacDonald's Farm", 8888));
       volumeList.add(new LargestVolume(1, "Sea", "Spain", "Somewhere", 1997, 23333));
       volumeList.add(new LargestVolume(2, "Pointy tower", "India", "the street", 2020, 467456));
       volumeList.add(new LargestVolume(3, "Version 1", "Italy", "Over there", 1960, 34534));
       footprintList.add(new LargestFootprint(1, "High Thing", "Africa", "Up and Down", 42346));
       footprintList.add(new LargestFootprint(2, "Tumble Towers", "France", "Round and Round", 12221));
       footprintList.add(new LargestFootprint(3, "The Hub", "Scotland", "Ninky Nonk", 9345));
 
       do
       {
          System.out.println("Would you like information about buildings with the largest floor area, largest volume or largest footprint?");
          System.out.println("Please enter 'A' for Area, 'V' for Volume or 'F' for Footprint:");
          sizeResponse = keyboard.nextLine();
          sizeChar = sizeResponse.toUpperCase().charAt(0);
 
       System.out.println("Please enter the rank of the building you would like information about:");
       response = keyboard.nextInt();
       keyboard.nextLine();
 
          switch (sizeChar)
          {
             case 'A':
                for (LargestFloorArea match : floorList)
                {
                   if (match.getRank() == response)
                      System.out.println(match);
                }//for
                break;
             case 'V':
                for (LargestVolume match : volumeList)
                {
                   if (match.getRank() == response)
                      System.out.println(match);
                }//for
                break;
             case 'F':
                for (LargestFootprint match : footprintList)
                {
                   if (match.getRank() == response)
                      System.out.println(match);
                   break;
                }//for
             default:
                System.out.println("Your entry is invalid, please enter the letter 'A', 'V' or 'F' and Rank between 1-3:");
          }//switch
       }//do
       while ((sizeChar != 'A') && (sizeChar != 'V') && (sizeChar != 'F'));
 
    
    }//main 
}
