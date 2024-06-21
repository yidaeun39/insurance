package insurance.domain;

import insurance.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="reivews", path="reivews")
public interface ReivewRepository extends PagingAndSortingRepository<Reivew, >{
}