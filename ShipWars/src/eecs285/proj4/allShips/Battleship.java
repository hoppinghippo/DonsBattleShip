package eecs285.proj4.allShips;

import eecs285.proj4.Location;


public class Battleship extends AbstractShip
{
  
  private static Location first;
  private static Location second;

  Battleship()
  {
    super(first, second); 
  }

  @Override
  public boolean isMoveHit(Location Move)
  {
    // TODO Auto-generated method stub
    return false;
  }

  
}