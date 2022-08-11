package ConsumerController;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor 
public class Book {

     private Integer bookId;
     private String bookName;
     private Double bookCost;
     
     Book(){};
     
     Book(Integer id,String book,Double cost){
    	 this.bookId=id;
    	 this.bookName=book;
    	 this.bookCost=cost;
     }
}
