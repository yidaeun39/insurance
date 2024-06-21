package insurance.domain;

import insurance.ReviewApplication;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Reivew_table")
@Data
//<<< DDD / Aggregate Root
public class Reivew {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public static ReivewRepository repository() {
        ReivewRepository reivewRepository = ReviewApplication.applicationContext.getBean(
            ReivewRepository.class
        );
        return reivewRepository;
    }

    //<<< Clean Arch / Port Method
    public static void readyToReview(ClaimRequested claimRequested) {
        //implement business logic here:

        /** Example 1:  new item 
        Reivew reivew = new Reivew();
        repository().save(reivew);

        Reviewed reviewed = new Reviewed(reivew);
        reviewed.publishAfterCommit();
        */

        /** Example 2:  finding and process
        
        repository().findById(claimRequested.get???()).ifPresent(reivew->{
            
            reivew // do something
            repository().save(reivew);

            Reviewed reviewed = new Reviewed(reivew);
            reviewed.publishAfterCommit();

         });
        */

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
