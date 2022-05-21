package dev.karambol.servicecicd;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserJpaRepository extends PagingAndSortingRepository<UserEntity, Long> {

}
