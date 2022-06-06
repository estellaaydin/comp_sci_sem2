package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager
{
   
   private ArrayList<Gizmo> purchases;
   //int purchases;
   
   public OnlinePurchaseManager(){
      // = purchases;
      purchases = new ArrayList<Gizmo>();
   }
   
   public int countElectronicsByMaker(String mkr ){
      int c=0;
   
      for(int k=0;k<purchases.size();k++){
         if(purchases.get(k).isElectronic() && purchases.get(k).getMaker().equals(mkr)){
            c++;
         }
      }
      return c;
   }
   
   public boolean hasAdjacentEqualPair(){
      for(int x=0; x<purchases.size()-1 && purchases.size()>=2;x++){
         if((purchases.get(x)).equals(purchases.get(x+1) ) && purchases.get(x).isElectronic() && purchases.get(x+1).isElectronic()){
            System.out.println(" this is " + x);
            return true;
         }
      }
      return false;
   }
   
   public Gizmo getCheapestGizmoByMaker(String mkr ) {
      double min = Double.MAX_VALUE;
      int c=0;
      
      for(int y=0;y<purchases.size();y++){
         if((purchases.get(y).getCost() < min && purchases.get(y).getMaker().equals(mkr))){
            min = (purchases.get(y).getCost());
            c=y;
         }
         
      }
      
      /*for(Gizmo y: purchases){
         if(y.getCost() < min && y.getMaker().equal(mkr)){
            
         }
      }
      */
      return purchases.get(c);
   }
   
   public void add(String maker, boolean isE, double cost){
      Gizmo a= new Gizmo(maker, isE, cost);
      purchases.add(a);
   }
   
   
   public String toString()
   {
   	return "" + purchases;
   }
}
