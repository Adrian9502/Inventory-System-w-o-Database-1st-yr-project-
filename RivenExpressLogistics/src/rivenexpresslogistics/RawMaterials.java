package rivenexpresslogistics;

public class  RawMaterials {
            private  int productID;
            private String productName;
            private  int qty;
            private  String kilo;
    //constructor
    public  RawMaterials(int productID,String productName,int qty,String kilo)
    {
        this.productID = productID;
        this.productName = productName;
        this.qty = qty;
        this.kilo= kilo;
    }
    public int getproductID(){
        return productID;
    }
      //getter
     public  String getproductName()
     {
        return productName;
    }
     public  int getQty( )
     {
        return qty;
    }
     public  String getKilo( )
     {
        return kilo;
    }//end of getter
     //setter
    void setQty(int qty) {
        this.qty = qty;
    }
    }
    

