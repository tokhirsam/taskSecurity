package uz.pdp.task2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Type;
import uz.pdp.task2.entity.User;
import uz.pdp.task2.projection.CustomType;
import uz.pdp.task2.projection.CustomUser;

@RepositoryRestResource(path = "user", collectionResourceRel = "list", excerptProjection = CustomUser.class)
public interface UserRepository extends JpaRepository<User, Integer> {
}
