
package bolum9;


public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    

Stock(){
}
Stock(String newsymbol,String newname , double newpreviousClosingPrice,double newcurrentPrice){
      previousClosingPrice=newpreviousClosingPrice;
      currentPrice=newcurrentPrice;
      symbol=newsymbol;
      name=newname;
  
    
}

double getChangePercent(){
    return(((currentPrice-previousClosingPrice)/previousClosingPrice)*100);
}





}
